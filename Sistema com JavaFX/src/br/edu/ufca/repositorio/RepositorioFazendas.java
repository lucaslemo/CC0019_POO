package br.edu.ufca.repositorio;

import br.edu.ufca.basicas.Fazenda;

public class RepositorioFazendas {

	private Fazenda[] fazendas;

	public RepositorioFazendas () {
		this.fazendas = new Fazenda[10];
	}

	public Fazenda consultarFazenda(int i) {
		return this.fazendas[i];
	}

	public void adicionarFazenda(int i, Fazenda nova) {
		this.fazendas[i] = nova;
	}

	public void removerFazenda(int i){
		this.fazendas[i] = null;
	}
}
