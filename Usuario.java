import java.util.Scanner;

public  class Usuario{
	public static void main(String args[]) throws Exception {
		
		B1 b1 = new B1(100.0, 10);
		B2 b2 = new B2(10.0, 10);
		B3 b3 = new B3(20.0, 10);
		B4 b4 = new B4(50.0, 10);
		
		Caixa caixa = new Caixa("CX1234", "Rua 1", "12", "Campinas", "SP");
		
		caixa.setB1(b1);
		caixa.setB2(b2);
		caixa.setB3(b3);
		caixa.setB4(b4);
		
		System.out.println( "Saldo do caixa: " +caixa.saldoCaixa());
		System.out.println("\n" +caixa.saldoPorBandeja());	
		
		
		Scanner var  = new Scanner(System.in);
		
		System.out.println("Digite o valor a ser sacado:");
		
		double op = var.nextFloat();
		
		System.out.println(caixa.sacar(op));
		
		}			
			
}