package teste;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.edu.ufca.basicas.Proprietario;
import br.edu.ufca.repositorio.RepositorioCliente;

public class Teste {
	public static void main(String[] args) throws IOException {
			RepositorioCliente clientes= new RepositorioCliente();
			Proprietario novo = new Proprietario("Augusto", 123);
			clientes.adicionarCliente(novo);
			clientes.buscarCliente(123).criarFazenda();
			clientes.buscarCliente(123).criarFazenda();
			clientes.buscarCliente(123).listaFazendas();
			clientes.buscarCliente(123).comprarAnimaisF(1, "Gado", 100, 30.0, 10.0);
			clientes.buscarCliente(123).comprarAnimaisF(1, "Galinha", 100, 15.0, 10.0);
			clientes.buscarCliente(123).venderAnimaisF(1, 50, "Gado");
			clientes.buscarCliente(123).comprarAnimaisF(1, "Gado", 83, 30.0, 10.0);
			clientes.buscarCliente(123).venderAnimaisF(1, 50, "Galinha");
			clientes.buscarCliente(123).comprarAnimaisF(1, "Gado", 88, 30.0, 10.0);
			clientes.buscarCliente(123).venderAnimaisF(1, 120, "Gado");
			clientes.buscarCliente(123).comprarAnimaisF(2, "Pato", 300, 20.0, 16.0);
			clientes.buscarCliente(123).comprarAnimaisF(2, "Gado", 300, 30.0, 1.0);
			int boi = clientes.buscarCliente(123).consultarAnimais(1, "Gado");
			int pinto = clientes.buscarCliente(123).consultarAnimais(1, "Galinha");
			int total = clientes.buscarCliente(123).consultarAnimais(null);
			double valor = clientes.buscarCliente(123).consultarCustosPrevistos(1);
			double venda = clientes.buscarCliente(123).consultarLucroPrevisto("Gado", 10);
			
			/*System.out.println("O celeiro possui: " + boi + " Gados");
			System.out.println("O celeiro possui: " + pinto + " Galinhas");
			System.out.println("O celeiro possui: " + total + " Animais");
			System.out.println("Os custos previsto para 1 mes: " + valor);
			System.out.println("O custo de venda de 10 Bois: " + venda);*/
			
			try {
				FileOutputStream arq = new FileOutputStream("RepositorioCliente.ser");
				ObjectOutputStream obj = new ObjectOutputStream(arq);
				obj.writeObject(clientes);
				obj.flush();
			} catch (Exception erro) {
				System.out.println("Erro durante gravacao");
			}
			
			
	}
}