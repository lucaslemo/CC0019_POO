package br.edu.ufca.repositorio;

import br.edu.ufca.basicas.Animal;

public class RepositorioAnimais {
	
	private Animal[] Animais;
	private int qtdAnimal;
	
	public RepositorioAnimais() {
		this.Animais = new Animal[10000];
		this.qtdAnimal = 0;
	}

	public int adicionarAnimal(Animal novo) {
		int i = 0;
		while(this.Animais[i] != null && i < 10000) {
			i++;
		}
		if (i < 10000) {
			this.Animais[i] = novo;
			this.qtdAnimal = this.getQtdAnimal() + 1;
			return 1;
		}
		return 0;
	}

	public void removerAnimais(String tipo) {
		int i = 0;
		while(i < 10000) {
			if (this.Animais[i] != null) {
				if(this.Animais[i].getNome().equals(tipo)) {
					this.Animais[i] = null;
					this.qtdAnimal = this.getQtdAnimal() - 1;
					break;
				}
			}
			i++;
		}
		
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
