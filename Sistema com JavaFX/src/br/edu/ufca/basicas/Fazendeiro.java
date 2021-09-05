package br.edu.ufca.basicas;

import java.io.Serializable;

public class Fazendeiro implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private int cpf;
	
	public Fazendeiro(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if(o instanceof Fazendeiro) {
			if(this.cpf == ((Fazendeiro) o).cpf) {
				result = true;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "Funcionario: " + this.getNome()+ ", " + "CPF: " + this.getCpf();
	}
}
