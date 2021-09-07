package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ufca.basicas.ArquivoProprietario;
import br.edu.ufca.basicas.Proprietario;
import br.edu.ufca.basicas.Fazenda;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ControleSistemaListaFazenda implements Initializable{

	private Proprietario usuario = null;
	ObservableList<String> obsLista = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(ArquivoProprietario.lerArquivo() != null) {
			this.usuario = ArquivoProprietario.lerArquivo();
		}
		initialize();
	}

	@FXML
    private void initialize() {
		carregaLista();
    }

	void carregaLista(){
		Fazenda aux = null;
		obsLista.removeAll(obsLista);
		for(int i = 0; i < 5; i++) {
			aux = this.usuario.getRepositorioFazendas().getFazendas()[i];
			if(aux != null) {
				obsLista.add("Fazenda " + aux.toString());
			}
		}
		lista.getItems().addAll(obsLista);
	}

	@FXML
	ListView<String> lista;
	
	@FXML
	Label total = new Label();

	@FXML
	Button btn01 = new Button();

	@FXML
	public void func01() {
		Stage stage = (Stage) btn01.getScene().getWindow();
		stage.close();
	}
}
