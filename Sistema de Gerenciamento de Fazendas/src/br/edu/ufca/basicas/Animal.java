package br.edu.ufca.basicas;

public class Animal {
	
	private String nome;
	private double lucroMensal;
	private double racaoMensal;
	
	public Animal(String tipo, double LucroMensal, int racaoMensal) {
		this.nome = tipo;
		this.lucroMensal = LucroMensal;
		this.racaoMensal = racaoMensal;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getLucro_Mensal() {
		return lucroMensal;
	}
	
	public void setLucro_Mensal(double lucroMensal) {
		this.lucroMensal = lucroMensal;
	}
	
	public double getRa�ao_Mensal() {
		return racaoMensal;
	}
	
	public void setRa�ao_Mensal(double ra�aoMensal) {
		this.racaoMensal = ra�aoMensal;
	}
}
