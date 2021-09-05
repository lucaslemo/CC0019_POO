package br.edu.ufca.repositorio;

import br.edu.ufca.basicas.Proprietario;

public class RepositorioCliente{

	private Proprietario [] clientes;
	
	public RepositorioCliente() {
		this.clientes = new Proprietario[10];
	}

	public int adicionarCliente(Proprietario novo) {
		int i = 0;
		while(this.clientes[i] != null && i < 10) {
			i++;
		}
		if(i < 10) {
			this.clientes[i] = novo;
			return 1;
		}
		return 0;
	}

	public Proprietario buscarCliente(int cpf) {
		Proprietario aux = null;
		for(int i = 0; i < 10; i++) {
			aux = this.getClientes()[i];
			if(aux != null) {
				if(aux.getCPF() == cpf) {
					return aux;
				}
			}
		}
		return null;
	}

	public Proprietario [] getClientes() {
		return clientes;
	}
}
