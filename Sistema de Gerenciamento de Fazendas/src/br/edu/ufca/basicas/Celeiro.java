package br.edu.ufca.basicas;

import br.edu.ufca.repositorio.RepositorioAnimais;

public class Celeiro {
	
	private int qtdAnimais;
	private double qtdRacao;
	private RepositorioAnimais Repositorio;
	
	public Celeiro(int tam) {
		this.qtdAnimais = 0;
		this.qtdRacao = 0;
		this.Repositorio = new RepositorioAnimais(tam);
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