package teste;

import br.edu.ufca.basicas.Proprietario;

public class Teste {
	public static void main(String[] args) {
			Proprietario [] clientes;
			clientes = new Proprietario[10];
			Proprietario novo = new Proprietario("Augusto", 123);
			clientes[0] = novo;
			clientes[0].criarFazenda();
			clientes[0].criarFazenda();
			clientes[0].listaFazendas();
			clientes[0].comprarAnimaisF(1, "Gado", 100, 30.0, 10.0);
			clientes[0].comprarAnimaisF(1, "Galinha", 100, 15.0, 10.0);
			clientes[0].venderAnimaisF(1, 50, "Gado");
			clientes[0].comprarAnimaisF(1, "Gado", 83, 30.0, 10.0);
			clientes[0].venderAnimaisF(1, 50, "Galinha");
			clientes[0].comprarAnimaisF(1, "Gado", 88, 30.0, 10.0);
			clientes[0].venderAnimaisF(1, 120, "Gado");
			clientes[0].comprarAnimaisF(2, "Pato", 300, 20.0, 16.0);
			clientes[0].comprarAnimaisF(2, "Gado", 300, 30.0, 1.0);
			int boi = clientes[0].consultarAnimais(1, "Gado");
			int pinto = clientes[0].consultarAnimais(1, "Galinha");
			int total = clientes[0].consultarAnimais(null);
			double valor = clientes[0].consultarCustosPrevistos(1);
			double venda = clientes[0].consultarLucroPrevisto("Gado", 10);
			
			System.out.println("O celeiro possui: " + boi + " Gados");
			System.out.println("O celeiro possui: " + pinto + " Galinhas");
			System.out.println("O celeiro possui: " + total + " Animais");
			System.out.println("Os custos previsto para 1 mes: " + valor);
			System.out.println("O custo de venda de 10 Bois: " + venda);
	}
}