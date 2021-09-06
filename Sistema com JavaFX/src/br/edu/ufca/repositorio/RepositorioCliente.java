package br.edu.ufca.repositorio;

import java.io.Serializable;

import br.edu.ufca.basicas.Proprietario;

public class RepositorioCliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Proprietario [] clientes;
	private int qtdClientes;
	
	public RepositorioCliente() {
		this.clientes = new Proprietario[20];
		this.qtdClientes = 0;
	}

	public Proprietario consultaCliente(long cpf) {
		Proprietario aux = null;
		for (int i = 0; i < 20; i++) {
			aux = this.getClientes()[i];
			if(aux != null) {
				if(aux.getCPF() == cpf) {
					return aux;
				}
			}
		}
		return aux;
	}

	public int adicionarCliente(Proprietario novo) {
		int i = 0;
		while(this.clientes[i] != null && i < 20) {
			i++;
		}
		if(i < 10) {
			this.clientes[i] = novo;
			this.setQtdClientes(this.getQtdClientes() + 1);
			return 1;
		}
		return 0;
	}

	public Proprietario [] getClientes() {
		return clientes;
	}

	public int getQtdClientes() {
		return qtdClientes;
	}

	public void setQtdClientes(int qtdClientes) {
		this.qtdClientes = qtdClientes;
	}
}
