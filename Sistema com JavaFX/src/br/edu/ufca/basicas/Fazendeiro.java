package br.edu.ufca.basicas;

import java.io.Serializable;

public class Fazendeiro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String senhaProprietario;
	private Celeiro celeiro;

	public Fazendeiro(String senha) {
		this.celeiro = new Celeiro();
		this.senhaProprietario = senha;
	}

	public int consultarAnimais(String tipo) {
		return this.getCeleiro().getAnimais(tipo);
	}

	public int consultarAnimais() {
		return this.getCeleiro().getRepositorio().getQtdAnimal();
	}

	public int consultarRacao() {
		return this.getCeleiro().getRacao();
	}

	public void comprarRacao(int qtdRacao) {
		this.getCeleiro().setRacao(this.consultarRacao() + qtdRacao);
	}
	
	public void alimentarAnimais(String tipo, int qtdAnimais) {
		Animal aux = null;
		int i = 0, j = 0;
		while(i < 10000 || j < qtdAnimais) {
			aux = this.getCeleiro().getRepositorio().getAnimais()[i];
			if (aux != null) {
				if(aux.getNome().equals(tipo)) {
					this.getCeleiro().setRacao(this.consultarRacao() - aux.getQtdRacaoDiaria());
				}
			}
		}
	}

	public Celeiro getCeleiro() {
		return celeiro;
	}

	public void setCeleiro(Celeiro celeiro) {
		this.celeiro = celeiro;
	}

	
}
