package br.com.gx2.recibo;

public class CalculoRecibo {
	
	Recibo recibo = new Recibo();
	
	public double  calculaValorInss (double valorInss) {
		
		if(recibo.getValorServico() >= 0 && recibo.getValorServico() <= 965.67) {
			valorInss = recibo.getValorServico() * 0.08;
			
		}else if (recibo.getValorServico() >= 965.68 & recibo.getValorServico() <= 1609.45) {
			valorInss = recibo.getValorServico() * 0.09;
			
		}else if(recibo.getValorServico() >= 1609.46 & recibo.getValorServico() <= 3218.90) {
			
		}else {
			valorInss = (recibo.getValorServico() - 354.08);
		}
		return valorInss;
	}
	
	public double calculoValorIr (double valorIr) {
		
		if(recibo.getValorServico() <= 1434) {
			
			valorIr = 0;
		
		}else if(recibo.getValorServico() >= 1434.01 & recibo.getValorServico() <= 2150){
			valorIr = recibo.getValorIr() * 0.75;
			
		}else if(recibo.getValorServico() >= 2150.01 & recibo.getValorServico() <= 2866) {
			valorIr = recibo.getValorServico() * 0.15;
			
		}else if(recibo.getValorServico() >= 2866.01 & recibo.getValorServico() <= 3582) {
			
		}else {
			
			valorIr = recibo.getValorServico() * 0.275;
		}
		return valorIr;
	}
	
	public void calcularLiquido (double valorLiquido) {
		
		valorLiquido = (recibo.getValorServico() - recibo.getValorServico()) - recibo.getValorIr();
		
		
	}

}
