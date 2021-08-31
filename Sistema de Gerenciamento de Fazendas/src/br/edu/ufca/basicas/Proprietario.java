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

	public void criarFazenda() {
		int id = this.fazendas.getQtdFazendas();
		if (id < 5) {
			Fazenda nova = new Fazenda(id + 1);
			this.fazendas.adicionarFazenda(nova);
		}
	}

	public void listaFazendas() {
		System.out.println("Voce possui: " + this.fazendas.getQtdFazendas() + " Fazendas");
		for (int i = 0; i < 5; i++) {
			if (this.fazendas.getFazendas()[i] == null) {
				continue;
			}
			else {
				System.out.println("Id: " + this.fazendas.getFazendas()[i].getId());
			}
		}		
	}

	public void removerFazenda(int id) {
		this.fazendas.removeFazenda(id);
	}

	public int consultarAnimaisF(int id) {
		return this.fazendas.consultaFazenda(id).getCeleiro().getAnimais();
	}

	public void comprarAnimaisF(int id, String tipo, int qtd, double lucroMensal ,int racaoMensal) {
		this.fazendas.consultaFazenda(id).getCeleiro().adicionaAnimal(tipo, qtd, lucroMensal, racaoMensal);
	}
	
	public void venderAnimaisF(int id, int qtd) {
		
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
}
