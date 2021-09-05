package br.edu.ufca.basicas;

public class Animal {

	private String nome;
	private double precoVenda;
	private double racaoMensal;

	public Animal(String tipo, double precoVenda, double racaoMensal) {
		this.nome = tipo;
		this.precoVenda = precoVenda;
		this.racaoMensal = racaoMensal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoVenda() {
		return this.precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getRacaoMensal() {
		return this.racaoMensal;
	}

	public void setRa�aoMensal(double racaoMensal) {
		this.racaoMensal = racaoMensal;
	}
}
