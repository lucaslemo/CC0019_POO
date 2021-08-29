package br.edu.ufca.basicas;

public class Dono {

	private String nome;
	private long CPF;
	private int Id;

	public Dono(String nome, int CPF, int Id) {
		this.nome = nome;
		this.CPF= CPF;
		this.Id= Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCPF() {
		return CPF;
	}

	public void setCPF(long cPF) {
		CPF = cPF;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
}
