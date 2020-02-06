package br.com.gx2.recibo;

public class Prestador extends Recibo {

	
		
	
	private int codigoPrestador = 5;
	private String nome = "José da silva";
	private String endereco = "Avenida são miguesl";
	private String cpf =  "54545455";
	private int matricula = 554545456;
	private double valorServico = 150.50;
	
	public Prestador() {
		
	}

	public Prestador(int codigoPrestador, String nome, String endereco, String cpf, int matricula,
			double valorServico) {
		super();
		this.codigoPrestador = codigoPrestador;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.matricula = matricula;
		this.valorServico = valorServico;
	}

	public int getCodigoPrestador() {
		return codigoPrestador;
	}

	public void setCodigoPrestador(int codigoPrestador) {
		this.codigoPrestador = codigoPrestador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

	@Override
	public String toString() {
		return "Prestador [codigoPrestador=" + codigoPrestador + ", nome=" + nome + ", endereco=" + endereco + ", cpf="
				+ cpf + ", matricula=" + matricula + ", valorServico=" + valorServico + "]";
	}
	
	
	
}
