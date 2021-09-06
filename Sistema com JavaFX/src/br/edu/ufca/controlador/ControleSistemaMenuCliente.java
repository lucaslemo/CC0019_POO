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
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControleSistemaMenuCliente implements Initializable{

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
	public void func01() throws Exception {
		if(Ultilitarios.testaNumero(cpf.getText()) == 1) {
			if (!nome.getText().equals("")) { 
				String loginNome = nome.getText();
				String loginCpf = cpf.getText();
				Proprietario login = this.sistema.consultaCliente(loginCpf);
				if(login == null || !login.getNome().equals(loginNome)) {
					valid.setText("Nome ou CPF Invalido!");
					System.out.println("Nome ou CPF Invalido!");
					this.initialize();
				}
				else {
					Stage stage = (Stage) btn02.getScene().getWindow();
					stage.close();
					System.out.println("Login realizado com sucesso");
					Stage s1 = new Stage();
			        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/menuCliente.fxml"));
			        s1.initModality(Modality.APPLICATION_MODAL);
			        Scene scene = new Scene(root, 400, 400);
			        s1.setMaximized(false);
					s1.setResizable(false);
					s1.setTitle("Menu do Cliente");
			        s1.setScene(scene);
			        s1.show(); 
				}
			}
			else {
				valid.setText("Nome Invalido!");
				System.out.println("Nome Invalido!");
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
}
