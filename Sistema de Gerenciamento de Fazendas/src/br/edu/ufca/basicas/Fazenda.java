package br.edu.ufca.basicas;

public class Fazenda {
	private int Id;
	private int Custos_Previstos;
	private int Lucros_Previstos;
	private Celeiro Celeiro;
	
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
}