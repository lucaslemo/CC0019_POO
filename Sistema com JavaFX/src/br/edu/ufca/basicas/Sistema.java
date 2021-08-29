package br.edu.ufca.basicas;

import br.edu.ufca.repositorio.RepositorioClientes;
import br.edu.ufca.repositorio.RepositorioFazendas;

public class Sistema {
	private RepositorioFazendas fazendas;
	private RepositorioClientes clientes;
	
	public Sistema() {
		this.fazendas = new RepositorioFazendas();
		this.clientes = new RepositorioClientes();		
	}

	public void addCliente(String nome, int CPF, int tamCeleiro, int qtdFuncionario) {

		int i = 0;
		Dono aux = this.clientes.concultaCliente(i);
		while (aux != null) {
			i++;
			aux = this.clientes.concultaCliente(i);
		}
		Dono novo = new Dono(nome, CPF, i);
		Fazenda nova = new Fazenda(i, tamCeleiro, qtdFuncionario);
		this.clientes.adicionarCliente(i, novo);
		this.fazendas.adicionarFazenda(i, nova);

	}

	public void rmCliente(int Id) {
		this.clientes.removerCliente(Id);
		this.fazendas.removerFazenda(Id);
	}

	public Dono consultarCliente(int i) {
		return this.clientes.concultaCliente(i);
	}
	
}
