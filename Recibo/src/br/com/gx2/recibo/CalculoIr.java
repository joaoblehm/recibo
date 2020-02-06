package br.com.gx2.recibo;

public class CalculoIr {
	
	
	Recibo recibo = new Recibo();
	Prestador prestador = new Prestador();
	


	
	public double calculaIr(double valorIr) {
	
		
		
			
			if(prestador.getValorServico() <= 1434) {
				
				valorIr = 0;
				
			}else if(prestador.getValorServico() >= 1434.01 & prestador.getValorServico() <2150) {
				
				valorIr = prestador.getValorServico() * 0.075;
				
			}else if(prestador.getValorServico() >= 2150.01 & prestador.getValorServico() <= 2866) {
				
				valorIr = prestador.getValorServico() * 0.15;
					
			}else if(prestador.getValorServico() >= 2866.01 & prestador.getValorServico() <= 3582) {
				
				valorIr = prestador.getValorServico() * 0.225;
				
			}else {
				
				valorIr =prestador.getValorServico() * 0.275;

			}
			return valorIr;
		
		
	}
}