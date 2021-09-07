package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ufca.basicas.Animal;
import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.basicas.ArquivoFazenda;
import br.edu.ufca.basicas.Fazenda;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ControleSistemaListaAnimais implements Initializable{
	
	private Fazenda sistema = null;
	ObservableList<String> obsLista = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(Arquivo.lerArquivo() != null) {
			this.sistema = ArquivoFazenda.lerArquivo();
		}
		initialize();
	}

	@FXML
    private void initialize() {
		carregaLista();
    }

	void carregaLista(){
		Animal aux = null;
		obsLista.removeAll(obsLista);
		for(int i = 0; i < 10000; i++) {
			aux = this.sistema.getFuncionario().getCeleiro().getRepositorio().getAnimais()[i];
			if(aux != null) {
				obsLista.add("N°: "+ (i + 1) + " - " + aux.toString());
			}
		}
		lista.getItems().addAll(obsLista);
	}

	@FXML
	ListView<String> lista;

	@FXML
	Label info = new Label();
	
	@FXML
	Button btn05 = new Button();

	@FXML
	public void func05() {
		Stage stage = (Stage) btn05.getScene().getWindow();
		stage.close();
	}
}
