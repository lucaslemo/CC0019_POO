package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import br.edu.ufca.basicas.ArquivoFazenda;
import br.edu.ufca.basicas.Fazenda;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControleSistemaConsultaAnimais implements Initializable{

	private Fazenda fazenda = null;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.initialize();
	}

	@FXML
    private void initialize() {
		if(ArquivoFazenda.lerArquivo() != null) {
			this.fazenda = ArquivoFazenda.lerArquivo();
		}
		total.setText("Essa fazenda possui " + fazenda.getFuncionario().consultarAnimais() + " animais no total!");
    }

	@FXML
	Button btn01 = new Button();

	@FXML
	Button btn02 = new Button();

	@FXML
	TextField animal = new TextField();

	@FXML
	Label total = new Label();

	@FXML
	Label tipo = new Label();

	@FXML
	public void func01() {
		if(!animal.getText().equals("")) {
			String tipoAnimal = animal.getText().toUpperCase();
			int qtd = this.fazenda.getFuncionario().getCeleiro().getAnimais(tipoAnimal);
			tipoAnimal = tipoAnimal.substring(0,1).concat(tipoAnimal.substring(1, tipoAnimal.length()).toLowerCase());
			tipo.setText("A Fazenda possui: " + qtd + " animais do tipo: " + tipoAnimal);
		}
		else {
			tipo.setText("Preencha o campo com o Tipo de Animal!");
		}
	}

	@FXML
	public void func02() {
		Stage stage = (Stage) btn02.getScene().getWindow();
		stage.close();
	}
}
