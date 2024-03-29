package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.basicas.ArquivoProprietario;
import br.edu.ufca.basicas.ArquivoFazenda;
import br.edu.ufca.basicas.Fazenda;
import br.edu.ufca.basicas.Proprietario;
import br.edu.ufca.basicas.Ultilitarios;
import br.edu.ufca.repositorio.RepositorioCliente;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControleSistemaVendaAnimais implements Initializable{
	
	private RepositorioCliente sistema = null;
	private Fazenda fazenda = null;
	private Proprietario usuario = null;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		this.initialize();
	}

	@FXML
    private void initialize() {
		if(ArquivoFazenda.lerArquivo() != null) {
			this.sistema = Arquivo.lerArquivo();
			this.usuario = ArquivoProprietario.lerArquivo();
			this.fazenda = ArquivoFazenda.lerArquivo();
		}
    }

	@FXML
	Button btn01 = new Button();

	@FXML
	Button btn02 = new Button();

	@FXML
	TextField tipo = new TextField();

	@FXML
	TextField qtd = new TextField();

	@FXML
	Label valid = new Label();
	
	@FXML
	public void func01() {
		if(Ultilitarios.testaNumero(qtd.getText()) == 1) {
			if (!tipo.getText().equals("") && !qtd.getText().equals("")) { 
				String tipoAnimal = tipo.getText();
				int qtdAnimal = Integer.valueOf(qtd.getText());
					if(this.usuario.venderAnimaisF(this.fazenda.getId(), tipoAnimal, qtdAnimal) == 1) {
						this.sistema.atualizaCliente(this.usuario.getCPF(), this.usuario);
						Arquivo.gravarArquivo(sistema);
						ArquivoProprietario.gravarArquivo(usuario);
						ArquivoFazenda.gravarArquivo(fazenda);
						valid.setText("Animais Vendidos com sucesso!");
						System.out.println("Animais Vendidos com sucesso!");
						this.initialize();	
					}
					else {
						valid.setText("N�o existem animais suficientes desse tipo para vender!");
						System.out.println("N�o existem animais suficientes desse tipo para vender!");
					}
			}
			else {
				valid.setText("Preencher Campos Vazios!");
				System.out.println("Preencher Campos Vazios!");
			}
		}
		else {
			valid.setText("Valores Invalidos!");
			System.out.println("Valores Invalido!");
		}
	}

	@FXML
	public void func02() {
		Stage stage = (Stage) btn02.getScene().getWindow();
		stage.close();
	}
}
