package br.edu.ufca.basicas;

import java.io.Serializable;

public class Fazenda implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Id;
	private int Lucros_Previstos;
	private int Custos_Previstos;
	private Fazendeiro Funcionario;

	public Fazenda(int Id, String senha) {
		this.Id = Id;
		this.Lucros_Previstos = 0;
		this.Custos_Previstos = 0;
		this.Funcionario = new Fazendeiro(senha);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getLucros_Previstos() {
		return Lucros_Previstos;
	}
	
	public void adicionarLucros(int lucroMensal) {
		this.Lucros_Previstos += lucroMensal;
	}
	
	public void removerLucros(int lucroMensal) {
		this.Lucros_Previstos -= lucroMensal;
	}
	
	public int getCustos_Previstos() {
		return Custos_Previstos;
	}
	
	public void adicionarCustos(int racao) {
		this.Custos_Previstos += racao;
	}
	
	public void removerCustos(int racao) {
		this.Custos_Previstos -= racao;
	}
	
	public Fazendeiro getFuncionario() {
		return Funcionario;
	}

	public void setFuncionario(Fazendeiro funcionario) {
		Funcionario = funcionario;
	}
	
	@Override
	public String toString() {
		return this.getId() + ", Lucros: " + this.getLucros_Previstos() + " Possui: " +  this.Funcionario.getCeleiro().getRepositorio().getQtdAnimal() + " Animais.";
	}
	
	@Override
	public boolean equals(Object o) {
		boolean result = false;
		if(o instanceof Fazenda) {
			if(this.Id == ((Fazenda) o).Id) {
				result = true;
			}
		}
		return result;
	}
}