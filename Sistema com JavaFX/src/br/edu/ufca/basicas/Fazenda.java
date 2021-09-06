package br.edu.ufca.basicas;

import java.io.Serializable;

public class Fazenda implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int Id;
	private int Lucros_Previstos;
	private Fazendeiro Funcionario;

	public Fazenda(int Id) {
		this.Id = Id;
		this.Lucros_Previstos = 0;
		this.Funcionario = new Fazendeiro();
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

	public Fazendeiro getFuncionario() {
		return Funcionario;
	}

	public void setFuncionario(Fazendeiro funcionario) {
		Funcionario = funcionario;
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