package br.edu.ufca.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.basicas.ArquivoFuncionario;
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

public class ControleSistemaFuncionario implements Initializable{

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
	TextField id = new TextField();

	@FXML
	TextField senha = new TextField();

	@FXML
	Label valid = new Label();

	@FXML
	public void func01() throws IOException {
		if(!id.getText().equals("") && !senha.getText().equals("")) {
			if(Ultilitarios.testaNumero(id.getText()) == 1) {
				int novoId = Integer.parseInt(id.getText());
				Proprietario aux = this.sistema.consultaClientePorSenha(senha.getText());
				if(aux != null) {
					if(aux.consultaFazenda(novoId) != null) {
						ArquivoFuncionario.gravarArquivo(aux.consultaFazenda(novoId).getFuncionario());
						Stage s1 = (Stage) btn01.getScene().getWindow();
						s1.close();
						System.out.println("Login realizado com sucesso!");

					}
					else {
						valid.setText("Não existe fazenda com esse ID!");
						System.out.println("Não existe fazenda com esse ID!");
					}
				}
				else {
					valid.setText("Senha Incorreta!");
					System.out.println("Senha Incorreta!");
				}
			}
		}
		else {
			valid.setText("Preencher Campos Vazios!");
			System.out.println("Preencher Campos Vazios!");
		}
	}

	@FXML
	public void func02() {
		Stage stage = (Stage) btn02.getScene().getWindow();
		stage.close();
	}
}
