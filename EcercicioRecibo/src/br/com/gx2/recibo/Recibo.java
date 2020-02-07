package br.com.gx2.recibo;

public class Recibo {


	private int codigoRecibo ;
	private double valorInss;
	private double valorIr;
	private double valorLiquido;
	private double valorServico;
	
	
	public Recibo() {


	}


	public Recibo(int codigoRecibo, double valorInss, double valorIr, double valorLiquido, double valorServico) {
		super();
		this.codigoRecibo = codigoRecibo;
		this.valorInss = valorInss;
		this.valorIr = valorIr;
		this.valorLiquido = valorLiquido;
		this.valorServico = valorServico = 150;
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

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}


	@Override
	public String toString() {
		return "Recibo [codigoRecibo=" + codigoRecibo + ", valorInss=" + valorInss + ", valorIr=" + valorIr
				+ ", valorLiquido=" + valorLiquido + ", valorServico=" + valorServico + "]";
	}

	
	


		}
	

