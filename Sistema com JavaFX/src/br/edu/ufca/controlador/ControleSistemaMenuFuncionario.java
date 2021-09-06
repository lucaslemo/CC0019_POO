package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.repositorio.RepositorioCliente;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleSistemaMenuFuncionario implements Initializable{

	private RepositorioCliente sistema = null;
	
	public ControleSistemaMenuFuncionario(RepositorioCliente sistema) {
		this.sistema = sistema;
	}
	
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
	Button btn04 = new Button();

	@FXML
	Button btn05 = new Button();

	@FXML
	TextField tipoAnimal = new TextField();

	@FXML
	TextField qtdRacao = new TextField();

	@FXML
	Label qtdAnimais = new Label();

	@FXML
	public void func01() {
		if(!tipoAnimal.getText().equals("")) {
			String tipo = tipoAnimal.getText().toUpperCase();
		}
		else {
			qtdAnimais.setText("Preencha o campo com o Tipo de Animal!");
		}
	}

	@FXML
	public void func02() {
		
	}

	@FXML
	public void func03() {
		
	}

	@FXML
	public void func04() {
		
	}

	@FXML
	public void func05() {
		
	}
}
