package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.basicas.Proprietario;
import br.edu.ufca.repositorio.RepositorioCliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ControleSistemaListaCliente implements Initializable{

	private RepositorioCliente sistema = null;
	ObservableList<String> obsLista = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		if(Arquivo.lerArquivo() != null) {
			this.sistema = Arquivo.lerArquivo();
		}
		initialize();
	}

	@FXML
    private void initialize() {
		carregaLista();
    }

	void carregaLista(){
		Proprietario aux = null;
		obsLista.removeAll(obsLista);
		for(int i = 0; i < 20; i++) {
			aux = this.sistema.getClientes()[i];
			if(aux != null) {
				obsLista.add("Cliente: " + aux.toString());
			}
		}
		lista.getItems().addAll(obsLista);
	}

	@FXML
	ListView<String> lista;

	@FXML
	Button btn05 = new Button();

	@FXML
	public void func05() {
		Stage stage = (Stage) btn05.getScene().getWindow();
		stage.close();
	}
}
