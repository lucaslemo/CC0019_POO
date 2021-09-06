package br.edu.ufca.basicas;

import java.io.Serializable;
import br.edu.ufca.repositorio.RepositorioFazendas;

public class Proprietario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nome;
	private String CPF;
	private RepositorioFazendas fazendas;
	private String senha;

	public Proprietario(String nome, String CPF) {
		this.nome = nome;
		this.CPF= CPF;
		this.fazendas = new RepositorioFazendas();
	}

	public int criarFazenda() {
		int id = this.fazendas.getQtdFazendas();
		if (id < 5) {
			Fazenda nova = new Fazenda(id + 1);
			this.fazendas.adicionarFazenda(nova);
			return 1;
		}
		return 0;
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

	public int consultarAnimais(String tipo) {
		int qtdAll = 0;
		Fazenda aux = null;
		if(tipo == null) {
			for (int i = 0; i < 5; i++) {
				aux = this.fazendas.getFazendas()[i];
				if (aux != null) {
					qtdAll += aux.getFuncionario().getCeleiro().getRepositorio().getQtdAnimal();
				}
			}
		}
		else {
			for (int i = 0; i < 5; i++) {
				aux = this.fazendas.getFazendas()[i];
				if (aux != null) {
					qtdAll += aux.getFuncionario().getCeleiro().getAnimais(tipo);
				}
			}
		}
		return qtdAll;
	}
	
	public int consultarAnimais(int id, String tipo) {
		return this.fazendas.consultaFazenda(id).getFuncionario().getCeleiro().getAnimais(tipo);
	}

	public void comprarAnimaisF(int id, String tipo, int qtd, double lucroMensal ,double racaoMensal, int qtdRacaoDiaria) {
		this.fazendas.consultaFazenda(id).getFuncionario().getCeleiro().adicionaAnimal(tipo, qtd, lucroMensal, racaoMensal, qtdRacaoDiaria);
	}
	
	public int venderAnimaisF(int id, int qtd, String tipo) {
		int teste = this.consultarAnimais(id, tipo);
		if (qtd <= teste) {
			this.fazendas.consultaFazenda(id).getFuncionario().getCeleiro().removerAnimal(tipo, qtd);
			return 1;
		}
		return 0;
	}

	public double consultarCustosPrevistos(int qtdMes) {
		Animal aux = null;
		int i = 0;
		double custosPrevistos = 0;
		for (int n = 0; n < 5; n++) {
			if (this.fazendas.getFazendas()[n] != null) {
				while (i < 10000) {
					aux = this.fazendas.getFazendas()[n].getFuncionario().getCeleiro().getRepositorio().getAnimais()[i];
					if(aux != null) {
						custosPrevistos += aux.getRacaoMensal() * qtdMes;
					}
					i++;
				}
			}
		}
		return custosPrevistos;
	}

	public double consultarCustosPrevistosF(int id, int qtdMes) {
		Animal aux = null;
		int i = 0;
		double custosPrevistos = 0;
		while(i < 10000) {
			aux = this.fazendas.consultaFazenda(id).getFuncionario().getCeleiro().getRepositorio().getAnimais()[i];
			if (aux != null) {
				custosPrevistos += aux.getRacaoMensal() * qtdMes;
			}
			i++;
		}
		return custosPrevistos;
	}

	public double consultarLucroPrevisto(String tipo, int qtd) {
		int teste = this.consultarAnimais(tipo);
		if(qtd <= teste) {
			Animal aux = null;
			int i = 0, j = 0;
			double lucroPrevisto = 0;
			for (int n = 0; n < 5; n++) {
				if (this.fazendas.getFazendas()[n] != null) {
					while (i < 10000) {
						aux = this.fazendas.getFazendas()[n].getFuncionario().getCeleiro().getRepositorio().getAnimais()[i];
						if(aux != null) {
							if(aux.getNome().equals(tipo) && j < qtd) {
								lucroPrevisto += aux.getPrecoVenda();
								j++;
							}
						}
						i++;
					}
				}
			}
			return lucroPrevisto;
		}
		return -1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cpf) {
		CPF = cpf;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public RepositorioFazendas getRepositorioFazendas() {
		return fazendas;
	}

	public void setRepositorioFazendas(RepositorioFazendas fazendas) {
		this.fazendas = fazendas;
	}

	@Override
	public String toString() {
		return this.getNome() + ", CPF: " + this.getCPF() + " Possui: " +  this.fazendas.getQtdFazendas() + " Fazendas.";
	}
}
