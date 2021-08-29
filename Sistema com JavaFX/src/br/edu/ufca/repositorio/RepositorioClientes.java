package br.edu.ufca.repositorio;

import br.edu.ufca.basicas.Dono;

public class RepositorioClientes {
	
	private Dono[] donos;
	
	public RepositorioClientes() {
		this.donos = new Dono[10];
	}
	
	public Dono concultaCliente(int i) {
		return this.donos[i];
	}
	
	public void adicionarCliente(int i, Dono novo) {
		this.donos[i] = novo;
	}

	public void removerCliente(int i){
		this.donos[i] = null;
	}

}
