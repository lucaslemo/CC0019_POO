package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ufca.basicas.Proprietario;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controles implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	Button btn01 = new Button();
	
	@FXML
	Button btn02 = new Button();
	
	@FXML
	Button btn03 = new Button();
	
	@FXML
	TextField nome = new TextField();
	
	@FXML
	TextField cpf = new TextField("CPF");

	@FXML
	public void func01() {
		String novoNome = nome.getText();
		int novoCpf = Integer.valueOf(cpf.getText());
		Proprietario novo = new Proprietario(novoNome, novoCpf);
		System.out.println(novo.getNome());
	}
	
	@FXML
	public void func02() {
		System.out.println("Botao 02");
	}
	
	@FXML
	public void func03() {
		Stage stage = (Stage) btn03.getScene().getWindow();
		stage.close();
	}
}
