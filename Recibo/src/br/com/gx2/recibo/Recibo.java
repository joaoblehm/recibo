package br.com.gx2.recibo;

public class Recibo  {
	
			
		
	
	private int codigoRecibo = 1;
	private double valorInss;
	private double valorIr;
	private double valorLiquido;
	
	
	public Recibo() {


	}


	public Recibo(int codigoRecibo, double valorInss, double valorIr, double valorLiquido) {
		super();
		this.codigoRecibo = codigoRecibo;
		this.valorInss = valorInss;
		this.valorIr = valorIr;
		this.valorLiquido = valorLiquido;
	}


	public int getCodigoRecibo() {
		return codigoRecibo;
	}


	public void setCodigoRecibo(int codigoRecibo) {
		this.codigoRecibo = codigoRecibo;
	}


	public double getValorInss() {
		return valorInss;
	}


	public void setValorInss(double valorInss) {
		this.valorInss = valorInss;
	}


	public double getValorIr() {
		return valorIr;
	}


	public void setValorIr(double valorIr) {
		this.valorIr = valorIr;
	}


	public double getValorLiquido() {
		return valorLiquido;
	}


	public void setValorLiquido(double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}


	@Override
	public String toString() {
		return "Recibo [codigoRecibo=" + codigoRecibo + ", valorInss=" + valorInss + ", valorIr=" + valorIr
				+ ", valorLiquido=" + valorLiquido + "]";
	
	
	
	}
		}
	

