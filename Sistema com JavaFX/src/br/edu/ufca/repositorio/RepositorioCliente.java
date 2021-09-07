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

	public Proprietario consultaCliente(String cpf) {
		Proprietario aux = null;
		for (int i = 0; i < 20; i++) {
			aux = this.getClientes()[i];
			if(aux != null) {
				if(aux.getCPF().equals(cpf)) {
					return aux;
				}
			}
		}
		return aux;
	}
	
	public Proprietario consultaClientePorSenha(String senha) {
		Proprietario aux = null;
		for (int i = 0; i < 20; i++) {
			aux = this.getClientes()[i];
			if(aux != null) {
				if(aux.getSenha().equals(senha)) {
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
		if(i < 20) {
			this.clientes[i] = novo;
			this.setQtdClientes(this.getQtdClientes() + 1);
			return 1;
		}
		return 0;
	}

	public int removeCliente(String cpf) {
		for(int i = 0; i < 20; i++) {
			if(this.getClientes()[i] != null) {
				if(this.getClientes()[i].getCPF().equals(cpf)) {
					this.getClientes()[i] = null;
					this.setQtdClientes(this.getQtdClientes() - 1);
					return 1;
				}
			}
		}
		return 0;
	}

	public int atualizaCliente(String cpf, Proprietario novo) {
		for(int i = 0; i < 20; i++) {
			if(this.getClientes()[i] != null) {
				if(this.getClientes()[i].getCPF().equals(cpf)) {
					this.getClientes()[i] = novo;
					return 1;
				}
			}
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
