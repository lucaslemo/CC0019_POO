package br.edu.ufca.basicas;

import br.edu.ufca.repositorio.RepositorioFazendas;

public class Proprietario{

	private String nome;
	private int CPF;
	private RepositorioFazendas fazendas;

	public Proprietario(String nome, int CPF) {
		this.nome = nome;
		this.CPF= CPF;
		this.fazendas = new RepositorioFazendas();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cpf) {
		CPF = cpf;
	}

	public int consultarAnimaisF(int id) {
		return this.fazendas.consultaFazenda(id).getCeleiro().getAnimais();
	}

	public void comprarAnimaisF(int id, String tipo, int qtd, double lucroMensal ,int racaoMensal) {
		this.fazendas.consultaFazenda(id).getCeleiro().adicionaAnimal(tipo, qtd, lucroMensal, racaoMensal);
	}
	
	public void venderAnimaisF(int id, int qtd) {
		
	}
}
