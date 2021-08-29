package teste;

import br.edu.ufca.basicas.Sistema;

//import br.edu.ufca.basicas.Celeiro;

public class Teste {
	public static void main(String[] args) {
		Sistema empressa = new Sistema();
		empressa.addCliente("Lucas", 1723, 0, 0);
		empressa.addCliente("Ruan", 4576, 0, 0);
		empressa.addCliente("Jeff", 4566, 0, 0);

		System.out.println(empressa.consultarCliente(0).getNome());
		System.out.println(empressa.consultarCliente(1).getNome());
		System.out.println(empressa.consultarCliente(2).getNome());

		empressa.rmCliente(0);

		if(empressa.consultarCliente(0) == null) {
			System.out.println("null");
		}
	}
}