package br.edu.ufca.repositorio;

import java.io.Serializable;

import br.edu.ufca.basicas.Fazendeiro;

public class RepositorioFuncionarios implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Fazendeiro [] funcionarios;
	private int qtdFuncionario;
	
	public RepositorioFuncionarios(int qtdFuncionario) {
		this.funcionarios = new Fazendeiro[100];
		this.qtdFuncionario = qtdFuncionario;
	}
	
	public Fazendeiro consultaFuncionario(int cpf) {
		for(int i = 0; i < 100; i++) {
			if (this.funcionarios[i] == null) {
				continue;
			}
			else if(this.funcionarios[i].getCpf() == cpf) {
				return this.funcionarios[i];
			}
		}
		return null;
	}
	
	public void adicionaFuncionario(Fazendeiro obj) {
		int i = 0;
		while(this.funcionarios[i] != null && i < 100) {
			i++;
		}
		if(i < 100) {
			this.funcionarios[i] = obj;
			this.qtdFuncionario = this.getQtdFuncionario() + 1;
		}
	}
	
	public void removeFuncionario(Fazendeiro obj) {
		for(int i = 0; i < 100; i++) {
			if (this.funcionarios[i] == null) {
				continue;
			}
			else if(this.funcionarios[i].equals(obj)) {
				this.funcionarios[i] = null;
				this.qtdFuncionario = this.getQtdFuncionario() - 1;
				break;
			}
		}
	}
	
	
	public int getQtdFuncionario() {
		return qtdFuncionario;
	}

	public void setQtdFuncionario(int qtdFuncionario) {
		this.qtdFuncionario = qtdFuncionario;
	}
	
}
