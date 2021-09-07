package br.edu.ufca.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import br.edu.ufca.basicas.Arquivo;
import br.edu.ufca.basicas.ArquivoFazenda;
import br.edu.ufca.basicas.ArquivoProprietario;
import br.edu.ufca.basicas.Proprietario;
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
	TextField idFazendas = new TextField();
	
	@FXML
	TextField idCompra = new TextField();
	
	@FXML
	TextField idConsulta = new TextField();
	
	@FXML
	TextField idVenda = new TextField();

	@FXML
	Label fazenda = new Label();
	
	@FXML
	Label animal = new Label();

	@FXML
	public void func01() {
		Proprietario aux = null;
		for (int i = 0; i < 20; i++) {
			aux = this.sistema.getClientes()[i];
			if(aux != null) {
				if(aux.equals(usuario)) {	
					aux.criarFazenda();
					this.sistema.atualizaCliente(aux.getCPF(), aux);
					Arquivo.gravarArquivo(sistema);
					usuario = aux;
					ArquivoProprietario.gravarArquivo(usuario);
					fazenda.setText("Fazenda adicionada com sucesso!");
					System.out.println("Fazenda adicionada com sucesso!");
					this.initialize();
				}
			}
		}
	}
	
	@FXML
	public void func02() throws Exception {
		this.initialize();
		System.out.println("Lista de Fazendas");
		Stage s1 = new Stage();
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/listaFazendas.fxml "));
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
		if(!idFazendas.getText().equals("")) {
			if(Ultilitarios.testaNumero(idFazendas.getText()) == 1) {
				Proprietario aux = null;
				for (int i = 0; i < 20; i++) {
					aux = this.sistema.getClientes()[i];
					if(aux != null) {
						if(aux.equals(usuario)) {
							if(aux.removerFazenda(Integer.valueOf(idFazendas.getText())) == 1) {
								this.sistema.atualizaCliente(aux.getCPF(), aux);
								Arquivo.gravarArquivo(sistema);
								usuario = aux;
								ArquivoProprietario.gravarArquivo(usuario);
								fazenda.setText("Fazenda removida com sucesso!");
								System.out.println("Fazenda removida com sucesso!");
								this.initialize();
							}
							else {
								fazenda.setText("A fazenda com esse ID não existe");
								System.out.println("A fazenda com esse ID não existe");
							}
						}
					}
				}
			}
			else {
				fazenda.setText("Este ID é inválido");
				System.out.println("Este ID é inválido");
			}
		}
		else {
			fazenda.setText("ERRO! Não deixe a caixa do ID vazio.");
			System.out.println("ERRO! Não deixe a caixa do ID vazio.");
		}
	}
	
	@FXML
	public void func04() throws Exception {
		this.initialize();
		if(!idCompra.getText().equals("")) {
			if(Ultilitarios.testaNumero(idCompra.getText()) == 1) {
				Proprietario aux = null;
				for (int i = 0; i < 20; i++) {
					aux = this.sistema.getClientes()[i];
					if(aux != null) {
						if(aux.equals(usuario)) {
							if(aux.getRepositorioFazendas().consultaFazenda(Integer.valueOf(idCompra.getText())) != null) {
								Fazenda fazenda = aux.getRepositorioFazendas().consultaFazenda(Integer.valueOf(idCompra.getText()));
								ArquivoFazenda.gravarArquivo(fazenda);
								System.out.println("Compra de Animais");
								Stage s1 = new Stage();
						        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/compraAnimais.fxml"));
						        s1.initModality(Modality.APPLICATION_MODAL);
						        Scene scene = new Scene(root, 400, 400);
						        s1.setMaximized(false);
								s1.setResizable(false);
								s1.setTitle("Compra de Animais");
						        s1.setScene(scene);
						        s1.show(); 
							}
							else {
								animal.setText("A fazenda com esse ID não existe");
								System.out.println("A fazenda com esse ID não existe");
							}
						}
					}
				}
			}
			else {
				animal.setText("Este ID é inválido");
				System.out.println("Este ID é inválido");
			}
		}
		else {
			animal.setText("ERRO! Não deixe a caixa do ID vazio.");
			System.out.println("ERRO! Não deixe a caixa do ID vazio.");
		}
	}
	
	@FXML
	public void func05() throws Exception {
		this.initialize();
		if(!idConsulta.getText().equals("")) {
			if(Ultilitarios.testaNumero(idConsulta.getText()) == 1) {
				Proprietario aux = null;
				for (int i = 0; i < 20; i++) {
					aux = this.sistema.getClientes()[i];
					if(aux != null) {
						if(aux.equals(usuario)) {
							if(aux.getRepositorioFazendas().consultaFazenda(Integer.valueOf(idConsulta.getText())) != null) {
								Fazenda fazenda = aux.getRepositorioFazendas().consultaFazenda(Integer.valueOf(idConsulta.getText()));
								ArquivoFazenda.gravarArquivo(fazenda);
								System.out.println("Consulta de Animais");
								Stage s1 = new Stage();
						        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/consultaAnimais.fxml"));
						        s1.initModality(Modality.APPLICATION_MODAL);
						        Scene scene = new Scene(root, 400, 300);
						        s1.setMaximized(false);
								s1.setResizable(false);
								s1.setTitle("Consulta de Animais");
						        s1.setScene(scene);
						        s1.show(); 
							}
							else {
								animal.setText("A fazenda com esse ID não existe");
								System.out.println("A fazenda com esse ID não existe");
							}
						}
					}
				}
			}
			else {
				animal.setText("Este ID é inválido");
				System.out.println("Este ID é inválido");
			}
		}
		else {
			animal.setText("ERRO! Não deixe a caixa do ID vazio.");
			System.out.println("ERRO! Não deixe a caixa do ID vazio.");
		}
	}

	@FXML
	public void func06() throws Exception {
		this.initialize();
		if(!idVenda.getText().equals("")) {
			if(Ultilitarios.testaNumero(idVenda.getText()) == 1) {
				Proprietario aux = null;
				for (int i = 0; i < 20; i++) {
					aux = this.sistema.getClientes()[i];
					if(aux != null) {
						if(aux.equals(usuario)) {
							if(aux.getRepositorioFazendas().consultaFazenda(Integer.valueOf(idVenda.getText())) != null) {
								System.out.println("Venda de Animais");
								Fazenda fazenda = aux.getRepositorioFazendas().consultaFazenda(Integer.valueOf(idVenda.getText()));
								ArquivoFazenda.gravarArquivo(fazenda);
								Stage s1 = new Stage();
							    Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/vendaAnimais.fxml "));
							    s1.initModality(Modality.APPLICATION_MODAL);
							    Scene scene = new Scene(root, 400, 400);
							    s1.setMaximized(false);
								s1.setResizable(false);
								s1.setTitle("Venda de Animais");
							    s1.setScene(scene);
							    s1.show(); 
							}
							else {
								animal.setText("A fazenda com esse ID não existe");
								System.out.println("A fazenda com esse ID não existe");
							}
						}
					}
				}
			}
			else {
				animal.setText("Este ID é inválido");
				System.out.println("Este ID é inválido");
			}
		}
		else {
			animal.setText("ERRO! Não deixe a caixa do ID vazio.");
			System.out.println("ERRO! Não deixe a caixa do ID vazio.");
		}
	}
	
	@FXML
	public void func07() throws Exception{
		this.initialize();
		System.out.println("Lucros Previstos");
		Stage s1 = new Stage();
        Parent root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/consultaLucros.fxml "));
        s1.initModality(Modality.APPLICATION_MODAL);
        Scene scene = new Scene(root, 400, 300);
        s1.setMaximized(false);
		s1.setResizable(false);
		s1.setTitle("Lucros Previstos");
        s1.setScene(scene);
        s1.show();
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
