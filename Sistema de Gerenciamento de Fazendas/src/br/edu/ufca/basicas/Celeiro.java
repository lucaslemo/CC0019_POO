package br.edu.ufca.basicas;

import br.edu.ufca.repositorio.RepositorioAnimais;

public class Celeiro {
	
	private int qtdAnimais;
	private double qtdRacao;
	private RepositorioAnimais Repositorio;
	
	public Celeiro() {
		this.qtdAnimais = 0;
		this.qtdRacao = 0;
		this.Repositorio = new RepositorioAnimais();
	}

	public void adicionaAnimal(String tipo, int qtd, double lucroMensal, int racaoMensal) {
		for (int i = 0; i < qtd; i++) {
			Animal novo = new Animal(tipo, lucroMensal, racaoMensal);
			this.Repositorio.adicionarAnimal(novo);
		}
	}

	public int getAnimais() {
		return this.qtdAnimais;
	}

	public void setAnimais(int qtdAnimais) {
		this.qtdAnimais = qtdAnimais;
	}

	public double getRacao() {
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