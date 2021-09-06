package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.basicas.ArquivoProprietario;
import br.edu.ufca.basicas.Proprietario;
import br.edu.ufca.basicas.Ultilitarios;
import br.edu.ufca.repositorio.RepositorioCliente;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControleSistemaMenuCliente implements Initializable{

	private RepositorioCliente sistema = null;
	private Proprietario usuario = null;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.initialize();
	}

	@FXML
    private void initialize() {
		if(Arquivo.lerArquivo() != null && ArquivoProprietario.lerArquivo() != null) {
			this.sistema = Arquivo.lerArquivo();
			this.usuario = ArquivoProprietario.lerArquivo();
		}
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
	Button btn06 = new Button();
	
	@FXML
	Button btn07 = new Button();
	
	@FXML
	Button btn08 = new Button();

	@FXML
	Button btn09 = new Button();

	@FXML
	TextField id = new TextField();

	@FXML
	Label fazenda = new Label();
	
	@FXML
	Label animal = new Label();

	@FXML
	public void func01() {
	}
	
	@FXML
	public void func02() throws Exception {
		System.out.println("Lista de Fazendas");
		Stage s1 = new Stage();
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/listaFazendas.fxml"));
        s1.initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(root, 400, 400);
        s1.setMaximized(false);
		s1.setResizable(false);
		s1.setTitle("Lista de Fazendas");
        s1.setScene(scene);
        s1.show(); 
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
	
	@FXML
	public void func06() {
	}
	
	@FXML
	public void func07() {
	}
	
	@FXML
	public void func08() {
	}
	
	@FXML
	public void func09() throws Exception {
		Stage s1 = (Stage) btn09.getScene().getWindow();
		s1.close();
		System.out.println("Deslogando...");
		Stage s2 = new Stage();
	    Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/loginCliente.fxml"));
	    s2.initModality(Modality.APPLICATION_MODAL);
	    Scene scene = new Scene(root, 400, 450);
	    s2.setMaximized(false);
	    s2.setResizable(false);
		s2.setTitle("Menu do Cliente");
	    s2.setScene(scene);
	    s2.show(); 
	}
}
