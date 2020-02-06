package br.com.gx2.recibo;

public class CalculoRecibo extends Recibo {

	Recibo recibo = new Recibo();
	Prestador prestador = new Prestador();
	CalculoInss inss = new CalculoInss();
	CalculoIr ir = new CalculoIr();
	
	public double calculaLiquido(double valorInss, double valorIr, double valorLiquido) {
		
		valorLiquido = (prestador.getValorServico() - inss.calculaInss(valorInss) - ir.calculaIr(valorIr));  
		return 0;
	}
		
	

	}
	
	
	


