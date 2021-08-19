package br.edu.ufca.basicas;

public class Celeiro {
	private int qtdAnimais;
	private double lucro;
	private int racao;

	public Celeiro() {
		this.qtdAnimais = 0;
		this.lucro = 0;
		this.racao = 0;
	}

	public boolean alimentarAnimais(int porcao) {
		int qtd = this.consultarAnimais() * porcao;
		if (qtd <= this.consultarRacao()) {
			this.racao -= this.consultarAnimais() * qtd;
			return true;
		}
		return false;
	}

	public boolean comprarRacao(int racao) {
		if (racao >= 0) {
			this.racao += racao;
			return true;
		}
		return false;
	}

	public int consultarRacao() {
		return this.racao;
	}

	public int consultarAnimais() {
		return this.qtdAnimais;
	}

	public void comprarAnimais(int novosAnimais) {
		if(novosAnimais >= 0) {
			this.qtdAnimais += novosAnimais;
		}
	}

	public double getLucro() {
		return this.lucro;
	}

}
