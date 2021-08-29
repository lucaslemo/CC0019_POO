package br.edu.ufca.basicas;

public class Animal {
	
	private String Nome;
	private double Lucro_Mensal;
	private double Raçao_Mensal;
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public double getLucro_Mensal() {
		return Lucro_Mensal;
	}
	
	public void setLucro_Mensal(double lucroMensal) {
		Lucro_Mensal = lucroMensal;
	}
	
	public double getRaçao_Mensal() {
		return Raçao_Mensal;
	}
	
	public void setRaçao_Mensal(double raçaoMensal) {
		Raçao_Mensal = raçaoMensal;
	}
}
