	public class Caixa{
	
		private String codigo;
		private String logradouro;
		private String numero_rua;
		private String cidade;
		private String estado;
		private B1 b1;
		private B2 b2;
		private B3 b3;
		private B4 b4;
		
		public Caixa(String codigo, String logradouro, String numero_rua, String cidade, String estado) {
			super();
			this.codigo = codigo;
			this.logradouro = logradouro;
			this.numero_rua = numero_rua;
			this.cidade = cidade;
			this.estado = estado;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public String getNumero_rua() {
			return numero_rua;
		}

		public void setNumero_rua(String numero_rua) {
			this.numero_rua = numero_rua;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public B1 getB1() {
			return b1;
		}

		public void setB1(B1 b1) {
			this.b1 = b1;
		}

		public B2 getB2() {
			return b2;
		}

		public void setB2(B2 b2) {
			this.b2 = b2;
		}

		public B3 getB3() {
			return b3;
		}

		public void setB3(B3 b3) {
			this.b3 = b3;
		}

		public B4 getB4() {
			return b4;
		}

		public void setB4(B4 b4) {
			this.b4 = b4;
		}
		
		public double saldoCaixa() {
			return this.b1.getTotal() + this.b2.getTotal() + this.b3.getTotal() + this.b4.getTotal(); 
		}
		
		public String saldoPorBandeja () {
			
			return ("Bandeja 1: " +  this.b1.getTotal() +" (" +b1.getQuantidadeCedula() +" Nota(s) " +"valor: " +b1.getValorDeFace() +")"
		    +"\n" + "Bandeja 2: " +  this.b2.getTotal() +" (" +b2.getQuantidadeCedula() +" Nota(s) " +"valor: " +b2.getValorDeFace() +")"
			+"\n" + "Bandeja 3: " +  this.b3.getTotal() +" (" +b3.getQuantidadeCedula() +" Nota(s) " +"valor: " +b3.getValorDeFace() +")"
			+"\n" + "Bandeja 4: " +  this.b4.getTotal() +" (" +b4.getQuantidadeCedula() +" Nota(s) " +"valor: " +b4.getValorDeFace() +")\n");
		}
		
		public String sacar(double valorSaque) throws Exception {					
			
			String resultado = null;
			
			if (valorSaque >  this.saldoCaixa())
				throw new Exception ("Esse caixa não possui saldo para saque");		
				
			while (valorSaque > 0) {
				
				int qty = (int) (valorSaque / b1.getValorDeFace());				
				
				if (qty > 0) {
					resultado = this.mostrarDisponibilidade(b1.getValorDeFace(), qty > b1.getQuantidadeCedula() ? b1.getQuantidadeCedula() : qty);
					int auxQuantity = qty > b1.getQuantidadeCedula() ? b1.getQuantidadeCedula() : qty;
					valorSaque -= auxQuantity * b1.getValorDeFace();
				}
				
				if(valorSaque > 0) {					
						int qty2 = (int) (valorSaque / b2.getValorDeFace());				
						int auxQuantity2 = qty2 > b2.getQuantidadeCedula() ? b2.getQuantidadeCedula() : qty2;
						if (qty2 > 0) {
							resultado += this.mostrarDisponibilidade(b2.getValorDeFace(), auxQuantity2);
							valorSaque -= auxQuantity2 * b2.getValorDeFace();				
						}
				}
				if (valorSaque > 0) {
							
					int qty3 = (int) (valorSaque / b3.getValorDeFace());				
					int auxQuantity3 = qty3 > b3.getQuantidadeCedula() ? b3.getQuantidadeCedula() : qty3;
					if (qty3 > 0) {
						resultado += this.mostrarDisponibilidade(b3.getValorDeFace(), auxQuantity3);
						valorSaque -= auxQuantity3 * b3.getValorDeFace();
					}

				}
					
				if (valorSaque > 0) {
					
					int qty4 = (int) (valorSaque / b4.getValorDeFace());				
					int auxQuantity4 = qty4 > b4.getQuantidadeCedula() ? b4.getQuantidadeCedula() : qty4;
					if (qty4 > 0) {
						resultado += this.mostrarDisponibilidade(b4.getValorDeFace(), auxQuantity4);
						valorSaque -= auxQuantity4 * b4.getValorDeFace();
					}

				}	
			}	
			
			
			return resultado;
		}
		
		public String mostrarDisponibilidade (double valor, int quantidade) {
			return "\n" +quantidade + " nota(s) de " + valor;
		}
		
	
		
	}