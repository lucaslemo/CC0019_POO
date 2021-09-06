package br.edu.ufca.basicas;

public class Ultilitarios {

	public static int testaNumero(String text) {
		if (text.matches("[0-9]+") && text.length() > 0) {
			return 1;
		}
		return 0;
	}
}
