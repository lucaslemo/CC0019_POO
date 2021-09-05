package br.edu.ufca.basicas;

import java.io.Serializable;
import br.edu.ufca.repositorio.RepositorioAnimais;

public class Celeiro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int qtdRacao;
	private RepositorioAnimais Repositorio;
	
	public Celeiro() {
		this.qtdRacao = 0;
		this.Repositorio = new RepositorioAnimais();
	}

	public void adicionaAnimal(String tipo, int qtd, double lucroMensal, double racaoMensal) {
		for (int i = 0; i < qtd; i++) {
			Animal novo = new Animal(tipo, lucroMensal, racaoMensal);
			this.Repositorio.adicionarAnimal(novo);
		}
	}

	public void removerAnimal(String tipo, int qtd) {
		for (int i = 0; i < qtd; i++) {
			this.Repositorio.removerAnimais(tipo);
		}
	}
	
	public int getAnimais(String tipo) {
		int qtd = 0, i = 0;
		Animal aux = null;
		while (i < 10000) {
			aux = this.getRepositorio().getAnimais()[i];
			if (aux != null) {
				if (aux.getNome().equals(tipo)) {
					qtd++;
				}
			}
			i++;
		}
		return qtd;
	}

	public int getRacao() {
		return this.qtdRacao;
	}

	public void setRacao(int racao) {
		this.qtdRacao = racao;
	}

	public RepositorioAnimais getRepositorio() {
		return Repositorio;
	}

	public void setRepositorio(RepositorioAnimais repositorio) {
		Repositorio = repositorio;
	}
}