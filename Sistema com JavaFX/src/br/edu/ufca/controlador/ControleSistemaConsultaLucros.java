package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ufca.basicas.ArquivoProprietario;
import br.edu.ufca.basicas.Proprietario;
import br.edu.ufca.basicas.Ultilitarios;
import br.edu.ufca.basicas.Fazenda;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControleSistemaConsultaLucros implements Initializable{

	private Proprietario usuario = null;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.initialize();
	}

	@FXML
    private void initialize() {
		if(ArquivoProprietario.lerArquivo() != null) {
			this.usuario = ArquivoProprietario.lerArquivo();
		}
		total.setText("Seu lucro mensal total � de R$" + usuario.consultarLucroPrevisto() + "!");
    }

	@FXML
	Button btn01 = new Button();

	@FXML
	Button btn02 = new Button();

	@FXML
	TextField id = new TextField();

	@FXML
	Label total = new Label();

	@FXML
	Label fazenda = new Label();

	@FXML
	public void func01() {
		if(!id.getText().equals("")) {
			if(Ultilitarios.testaNumero(id.getText()) == 1) {
				Fazenda aux = this.usuario.getRepositorioFazendas().consultaFazenda(Integer.valueOf(id.getText()));
				if(aux != null) {
					fazenda.setText("Essa fazenda est� gerando um lucro mensal de R$" + usuario.consultarLucroPrevistoF(Integer.valueOf(id.getText())) + "!");
				}
				else {
					fazenda.setText("A fazenda com esse ID n�o existe");
					System.out.println("A fazenda com esse ID n�o existe");
				}
			}
			else {
				fazenda.setText("Este ID � inv�lido");
				System.out.println("Este ID � inv�lido");
			}
		}
		else {
			fazenda.setText("Preencha o campo com o ID da Fazenda!");
		}
	}

	@FXML
	public void func02() {
		Stage stage = (Stage) btn02.getScene().getWindow();
		stage.close();
	}
}
