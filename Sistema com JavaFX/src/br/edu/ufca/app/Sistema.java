package br.edu.ufca.app;

import java.io.IOException;

import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.basicas.Proprietario;
import br.edu.ufca.repositorio.RepositorioCliente;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Sistema extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/telaSistema.fxml"));
		Scene scene = new Scene(root, 400, 550);
		primaryStage.setMaximized(false);
		primaryStage.setResizable(false);
		primaryStage.setTitle("Sistema de Gerenciamento de Fazendas");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		RepositorioCliente n = new RepositorioCliente();
		Proprietario x = new Proprietario("Luiz", "123444", "123456");
		Proprietario y = new Proprietario("Alberto", "3345", "7777");
		Proprietario z = new Proprietario("Tales", "4567", "8802");
		n.adicionarCliente(x);
		n.adicionarCliente(y);
		n.adicionarCliente(z);
		n.consultaCliente("123444").criarFazenda();
		n.consultaCliente("123444").criarFazenda();
		n.consultaCliente("123444").comprarAnimaisF(1, "Gado", 150 ,13.0, 17.0, 11);
		n.consultaCliente("123444").comprarAnimaisF(1, "Pata", 321 ,13.0, 17.0, 11);
		n.consultaCliente("123444").comprarAnimaisF(2, "Galo", 321 ,13.0, 17.0, 11);
		Arquivo.gravarArquivo(n);
		
		launch(args);		
	}
}
