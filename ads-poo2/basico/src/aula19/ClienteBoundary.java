package aula19;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ClienteBoundary extends Application {
	private Label lblId = new Label("Id");
	private Label lblCpf = new Label("Cpf");
	private Label lblNome = new Label("Nome");
	private Label lblNascimento = new Label("Nascimento");
	private Label lblTelefone = new Label("Telefone");
	private TextField txtId = new TextField();
	private TextField txtCpf = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtNascimento = new TextField();
	private TextField txtTelefone = new TextField();
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private ClienteControl control = new ClienteControl();
	
	public Cliente formularioParaEntidade() {
		Cliente c = new Cliente();
		try { 
			c.setCpf( txtCpf.getText() );
			c.setNome( txtNome.getText() );
			c.setTelefone( txtTelefone.getText() );
			Date d = sdf.parse(txtNascimento.getText());
			c.setNascimento( d );
			c.setId( Long.parseLong(txtId.getText()) );
		} catch (Exception e) { 
			e.printStackTrace();
		}
		return c;
	}
	
	@Override
	public void start(Stage stage) { 
		BorderPane panPrincipal = new BorderPane();
		GridPane panCampos = new GridPane();
		FlowPane panBotoes = new FlowPane();
		
		panPrincipal.setBottom(panBotoes);
		panPrincipal.setCenter(panCampos);
		
		panCampos.add(lblId, 0, 0);
		panCampos.add(txtId, 1, 0);
		panCampos.add(lblCpf, 0, 1);
		panCampos.add(txtCpf, 1, 1);
		panCampos.add(lblNome, 0, 2);
		panCampos.add(txtNome, 1, 2);
		panCampos.add(lblNascimento, 0, 3);
		panCampos.add(txtNascimento, 1, 3);
		panCampos.add(lblTelefone, 0, 4);
		panCampos.add(txtTelefone, 1, 4);
		
		panBotoes.getChildren().addAll(btnAdicionar, btnPesquisar);
		
		btnAdicionar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Cliente cliente = formularioParaEntidade();
				control.adicionar(cliente);
			} 
		});
		
		Scene scn = new Scene(panPrincipal, 300, 200);
		stage.setScene(scn);
		stage.setTitle("Gerenciamento de Clientes");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
