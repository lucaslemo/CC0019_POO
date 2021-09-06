package br.edu.ufca.basicas;

import java.io.Serializable;

public class Animal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private double precoVenda;
	private double racaoMensal;
	private int qtdRacaoDiaria;

	public Animal(String tipo, double precoVenda, double racaoMensal, int qtdRacaoDiaria) {
		this.nome = tipo;
		this.precoVenda = precoVenda;
		this.racaoMensal = racaoMensal;
		this.qtdRacaoDiaria = qtdRacaoDiaria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoVenda() {
		return this.precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public double getRacaoMensal() {
		return this.racaoMensal;
	}

	public void setRašaoMensal(double racaoMensal) {
		this.racaoMensal = racaoMensal;
	}

	public int getQtdRacaoDiaria() {
		return qtdRacaoDiaria;
	}

	public void setQtdRacaoDiaria(int qtdRacaoDiaria) {
		this.qtdRacaoDiaria = qtdRacaoDiaria;
	}
}
