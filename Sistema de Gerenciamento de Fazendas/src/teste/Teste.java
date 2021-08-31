package teste;

import br.edu.ufca.basicas.Proprietario;

public class Teste {
	public static void main(String[] args) {
			Proprietario [] clientes;
			clientes = new Proprietario[10];
			Proprietario novo = new Proprietario("Augusto", 123);
			clientes[0] = novo;
			clientes[0].criarFazenda();
			clientes[0].listaFazendas();
			clientes[0].removerFazenda(1);
			clientes[0].listaFazendas();
		}
}
