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
	
	public void alimentarAnimais() {
		Animal aux = null;
		int i = 0, racaoNec = 0;
		while(i < 10000) {
			aux = this.getCeleiro().getRepositorio().getAnimais()[i];
			if (aux != null) {
				racaoNec = aux.getQtdRacaoDiaria();
			}
		}
		if(this.getCeleiro().getRacao() >= racaoNec) {
			this.getCeleiro().setRacao(this.getCeleiro().getRacao() + racaoNec);
		}
		
	}

	public Celeiro getCeleiro() {
		return celeiro;
	}

	public void setCeleiro(Celeiro celeiro) {
		this.celeiro = celeiro;
	}

	public String getSenhaProprietario() {
		return senhaProprietario;
	}

	public void setSenhaProprietario(String senhaProprietario) {
		this.senhaProprietario = senhaProprietario;
	}

	
}
