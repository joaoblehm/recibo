package br.com.gx2.recibo;

public class TestRecibo {
	
	
	
	public static void main(String[] args) {
		
	
	
	CalculoRecibo calculo = new CalculoRecibo();
	
	Recibo recibo = new Recibo();
	Prestador prestador = new Prestador();
	
	
	
System.out.println("Claculo de Inss:" + recibo.getValorInss());
System.out.println("Claculo de Ir:" + recibo.getValorIr());
System.out.println("Claculo de Liquido:" + recibo.getValorLiquido());

	
	}
}
