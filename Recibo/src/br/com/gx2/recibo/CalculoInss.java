package br.com.gx2.recibo;

public class CalculoInss{
	
	Recibo recibo = new Recibo();
	Prestador prestador = new Prestador();
	
	
	

	
	public double calculaInss(double valorInss) {
		
			
			if(prestador.getValorServico() <= 0) {
			
			valorInss = 0;
			
			}else if (prestador.getValorServico() <=965.67) {
				
				
				valorInss  = prestador.getValorServico() * 0.08;
				
				
			} else if(prestador.getValorServico() >= 965.68 & prestador.getValorServico() <= 1609.45) {
				
				
				valorInss  = prestador.getValorServico() * 0.09;
				
			}else if(prestador.getValorServico() >= 1609.46 & prestador.getValorServico() <= 3218.90) {
				
				
				valorInss  = prestador.getValorServico() * 0.11;
				
				
			}else {
				
				valorInss  = (prestador.getValorServico() - 354.08);
			}
			return valorInss;
		
		
	}
}
