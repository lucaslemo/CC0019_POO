package br.edu.ufca.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.basicas.ArquivoFazenda;
import br.edu.ufca.basicas.Fazenda;
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

public class ControleSistemaMenuFuncionario implements Initializable{

	private RepositorioCliente sistema = null;
	private Fazenda funcionario = null;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.initialize();
	}

	@FXML
    private void initialize() {
		if(ArquivoFazenda.lerArquivo() != null) {
			this.funcionario = ArquivoFazenda.lerArquivo();
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
	TextField tipoAnimal = new TextField();

	@FXML
	TextField qtdRacao = new TextField();

	@FXML
	Label qtdAnimais = new Label();

	@FXML
	Label qtdRacaoCons = new Label();

	@FXML
	public void func01() {
		if(!tipoAnimal.getText().equals("")) {
			String tipo = tipoAnimal.getText().toUpperCase();
			int qtd = this.funcionario.getFuncionario().getCeleiro().getAnimais(tipo);
			tipo = tipo.substring(0,1).concat(tipo.substring(1, tipo.length()).toLowerCase());
			qtdAnimais.setText("A Fazenda possui: " + qtd + " animais do tipo: " + tipo);
		}
		else {
			qtdAnimais.setText("Preencha o campo com o Tipo de Animal!");
		}
	}

	@FXML
	public void func02() {
		int qtd = this.funcionario.getFuncionario().getCeleiro().getRacao();
		qtdRacaoCons.setText("A fazenda possui: " + qtd + " porções de ração");
	}

	@FXML
	public void func03() {
		if(!qtdRacao.getText().equals("")) {
			if(Ultilitarios.testaNumero(qtdRacao.getText()) == 1) {
				int qtd = Integer.parseInt(qtdRacao.getText());
				int racao = this.funcionario.getFuncionario().getCeleiro().getRacao();
				this.funcionario.getFuncionario().getCeleiro().setRacao(racao + qtd);
			}
			else {
				qtdRacaoCons.setText("Entrada Inválida!");
			}
		}
		else {
			qtdRacaoCons.setText("Preencha o campo com o quantidade de ração!");
		}
	}

	@FXML
	public void func04() {
		
	}

	@FXML
	public void func05() throws IOException {
		RepositorioCliente saveRef = Arquivo.lerArquivo();
		Stage s1 = (Stage) btn05.getScene().getWindow();
		s1.close();
		System.out.println("Deslogando...");
		Stage s2 = new Stage();
	    Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/loginCliente.fxml"));
	    s2.initModality(Modality.APPLICATION_MODAL);
	    Scene scene = new Scene(root, 400, 450);
	    s2.setMaximized(false);
	    s2.setResizable(false);
		s2.setTitle("Menu do Funcionario");
	    s2.setScene(scene);
	    s2.show(); 
	}

	@FXML
	public void func06() {
		
	}
}
