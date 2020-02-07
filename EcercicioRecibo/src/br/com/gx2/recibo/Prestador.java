package br.com.gx2.recibo;



public class Prestador {


	private int codigoPrestador;
	private String nome;
	private String endereco;
	private String cpf;
	private int matricula;
	
	
	public Prestador() {
		
	}

	public Prestador(int codigoPrestador, String nome, String endereco, String cpf, int matricula) {
		super();
		this.codigoPrestador = codigoPrestador;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.matricula = matricula;
		
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


	@Override
	public String toString() {
		return "Prestador [codigoPrestador=" + codigoPrestador + ", nome=" + nome + ", endereco=" + endereco + ", cpf="
				+ cpf + ", matricula=" + matricula + ", valorServico=" +"]";
	}
	
	
	
}
