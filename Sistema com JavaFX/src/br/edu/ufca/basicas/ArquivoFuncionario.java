package br.edu.ufca.basicas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ArquivoFuncionario {

	public static void gravarArquivo(Fazendeiro usuario) {
		try {
			FileOutputStream arq = new FileOutputStream("resources/data/user_Fun_data.ser");
			ObjectOutputStream obj = new ObjectOutputStream(arq);
			obj.writeObject(usuario);
			obj.flush();
			obj.close();
			
		}catch(IOException erro){
			erro.printStackTrace();
			System.out.println("Erro na gravacao do arquivo!");
		}
	}
	
	public static Fazendeiro lerArquivo() {
		try {
			FileInputStream arq = new FileInputStream("resources/data/user_Fun_data.ser");
			ObjectInputStream obj = new ObjectInputStream(arq);
			Fazendeiro usuario = (Fazendeiro) obj.readObject();
			obj.close();
			return usuario;
		}catch(ClassNotFoundException erro) {
			erro.printStackTrace();
			System.out.println("Erro na abertura do arquivo!");
			return null;
		}catch(FileNotFoundException erro){
			erro.printStackTrace();
			System.out.println("Erro na abertura do arquivo!");
			return null;
		}catch(IOException erro) {
			erro.printStackTrace();
			System.out.println("Erro na abertura do arquivo!");
			return null;
		}
	}
}
