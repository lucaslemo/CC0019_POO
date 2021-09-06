package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import br.edu.ufca.basicas.Arquivo;
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
import javafx.stage.Stage;

public class ControleSistemaCliente implements Initializable{

	private RepositorioCliente sistema = null;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.initialize();
	}

	@FXML
    private void initialize() {
		if(Arquivo.lerArquivo() != null) {
			this.sistema = Arquivo.lerArquivo();
		}
    }

	@FXML
	Button btn01 = new Button();

	@FXML
	Button btn02 = new Button();

	@FXML
	TextField nome = new TextField();

	@FXML
	TextField cpf = new TextField();

	@FXML
	Label valid = new Label();

	@FXML
	public void func01() {
		if(Ultilitarios.testaNumero(cpf.getText()) == 1) {
			long novoCpf = Long.parseLong(cpf.getText());
			if(this.sistema.consultaCliente(novoCpf) == null) {
				String novoNome = nome.getText();
				Proprietario novo = new Proprietario(novoNome, novoCpf);
				this.sistema.adicionarCliente(novo);
				Arquivo.gravarArquivo(sistema);
				valid.setText("Cadastrado com Sucesso!");
				System.out.println("Cadastrado com Sucesso!");
				this.initialize();
			}
			else {
				valid.setText("CPF ja Cadastrado!");
				System.out.println("CPF ja Cadastrado!");
			}
		}
		else {
			valid.setText("CPF Invalido!");
			System.out.println("CPF Invalido!");
		}
	}

	@FXML
	public void func02() {
		Stage stage = (Stage) btn02.getScene().getWindow();
		stage.close();
	}

	@FXML
	public void func04() throws Exception {
		Stage s1 = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/listaSistema.fxml"));
        Scene scene = new Scene(root);
        s1.setScene(scene);
        s1.show(); 
	}
}
