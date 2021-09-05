package br.edu.ufca.basicas;

import br.edu.ufca.repositorio.RepositorioFuncionarios;

public class Fazenda {
	private int Id;
	private int Lucros_Previstos;
	private Celeiro Celeiro;
	private RepositorioFuncionarios Funcionarios;
	
	public Fazenda(int Id) {
		this.Id = Id;
		this.Lucros_Previstos = 0;
		this.Celeiro = new Celeiro();
		this.Funcionarios = new RepositorioFuncionarios(0);
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
	
	public Celeiro getCeleiro() {
		return Celeiro;
	}

	public RepositorioFuncionarios getFuncionarios() {
		return Funcionarios;
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