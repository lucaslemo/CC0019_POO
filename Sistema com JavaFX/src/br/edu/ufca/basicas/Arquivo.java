package br.edu.ufca.basicas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import br.edu.ufca.repositorio.RepositorioCliente;

public class Arquivo {

	public static void gravarArquivo(RepositorioCliente clientes) {
		try {
			FileOutputStream arq = new FileOutputStream("/data/data.ser");
			ObjectOutputStream obj = new ObjectOutputStream(arq);
			obj.writeObject(clientes);
			obj.flush();
			obj.close();
			
		}catch(IOException erro){
			erro.printStackTrace();
			System.out.println("Erro na gravacao do arquivo!");
		}
	}
	
	public static RepositorioCliente lerArquivo() {
		RepositorioCliente clientes = null;
		try {
			FileInputStream arq = new FileInputStream("/data/data.ser");
			ObjectInputStream obj = new ObjectInputStream(arq);
			clientes = (RepositorioCliente) obj.readObject();
			obj.close();
			return clientes;
		}catch(IOException | ClassNotFoundException erro) {
			erro.printStackTrace();
			System.out.println("Erro na abertura do arquivo!");
			return null;
		}
	}
}
