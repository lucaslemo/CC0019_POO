package br.edu.ufca.repositorio;

import br.edu.ufca.basicas.Animal;

public class RepositorioAnimais {
	
	private Animal[] Animais;
	private int qtdAnimal;
	
	public RepositorioAnimais() {
		this.Animais = new Animal[10000];
		this.qtdAnimal = 0;
	}

	public void adicionarAnimal(Animal novo) {
		int i = 0;
		while(this.Animais[i] != null && i < 10000) {
			i++;
		}
		if (i < 10000) {
			this.Animais[i] = novo;
			this.qtdAnimal = this.getQtdAnimal() + 1;
		}
	}

	public void removerAnimais(String tipo, int qtd) {
		
	}

	public Animal [] getAnimais() {
		return Animais;
	}

	public void setAnimais(Animal[] animais) {
		Animais = animais;
	}

	public int getQtdAnimal() {
		return qtdAnimal;
	}

	public void setQtdAnimal(int qtdAnimal) {
		this.qtdAnimal = qtdAnimal;
	}
}
