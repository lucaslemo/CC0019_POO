package br.edu.ufca.basicas;

public class Celeiro {
	private int Id;
	private int qtdAnimais;
	private int qtdRacao;
	
	public Celeiro() {
		this.setId(Id);
		this.setQtdAnimais(0);
		this.setRacao(0);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getQtdAnimais() {
		return this.qtdAnimais;
	}

	public void setQtdAnimais(int qtdAnimais) {
		this.qtdAnimais = qtdAnimais;
	}

	public int getRacao() {
		return this.qtdRacao;
	}

	public void setRacao(int racao) {
		this.qtdRacao = racao;
	}
}
