package br.edu.ufca.basicas;

import br.edu.ufca.repositorio.RepositorioFuncionarios;

public class Fazenda {
	private int Id;
	private String nome;
	private int Custos_Previstos;
	private int Lucros_Previstos;
	private Celeiro Celeiro;
	private RepositorioFuncionarios Funcionarios;
	
	public Fazenda(int Id, int tamCeleiro, int qtdFuncionarios) {
		this.Id = Id;
		this.Custos_Previstos = 0;
		this.Lucros_Previstos = 0;
		this.Celeiro = new Celeiro(tamCeleiro);
		this.Funcionarios = new RepositorioFuncionarios(qtdFuncionarios);
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public int getCustos_Previstos() {
		return Custos_Previstos;
	}
	
	public void setCustos_Previstos(int custos_Previstos) {
		Custos_Previstos = custos_Previstos;
	}
	
	public int getLucros_Previstos() {
		return Lucros_Previstos;
	}
	
	public void setLucros_Previstos(int lucros_Previstos) {
		Lucros_Previstos = lucros_Previstos;
	}
	
	public Celeiro getCeleiro() {
		return Celeiro;
	}
	
	public void setCeleiro(Celeiro celeiro) {
		Celeiro = celeiro;
	}

	public RepositorioFuncionarios getFuncionarios() {
		return Funcionarios;
	}

	public void setFuncionarios(RepositorioFuncionarios funcionarios) {
		Funcionarios = funcionarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}