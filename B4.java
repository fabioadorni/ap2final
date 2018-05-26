public class B4{
	
	private double valorDeFace;
	private int quantidadeCedula;
	private double total;

	public B4(double valorDeFace, int quantidadeCedula) {
		super();
		this.valorDeFace = valorDeFace;
		this.quantidadeCedula = quantidadeCedula;
	}


	public double getValorDeFace() {
		return valorDeFace;
	}


	public void setValorDeFace(double valorDeFace) {
		this.valorDeFace = valorDeFace;
	}


	public int getQuantidadeCedula() {
		return quantidadeCedula;
	}


	public void setQuantidadeCedula(int quantidadeCedula) {
		this.quantidadeCedula = quantidadeCedula;
	}


	public double getTotal() {
		return total = this.quantidadeCedula * this.valorDeFace;
	}


	public void setTotal(double total) {
		this.total = total;
	}
	
		
	
}	