package aula20.boundary;

import java.text.SimpleDateFormat;
import java.util.Date;

import aula20.control.ClienteControl;
import aula20.entidade.Cliente;
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

public class ClienteBoundary extends Application 
			implements EventHandler<ActionEvent> {
	
	@Override
	public void handle(ActionEvent e) { 
		if (e.getTarget() == btnAdicionar) {
			Cliente cliente = formularioParaEntidade();
			control.adicionar(cliente);
		} else if (e.getTarget() == btnPesquisarNome) {
			Cliente c = control.pesquisarPorNome(txtNome.getText()); 
			entidadeParaFormulario(c);
		} else if (e.getTarget() == btnPesquisarId) {
			Cliente c = 
				control.pesquisarPorId(Long.parseLong(txtId.getText()));
			entidadeParaFormulario(c);
		}
	}
		
	private void entidadeParaFormulario(Cliente c) {
		if (c != null) {
			// txtId.setText( "" + c.getId() );
			txtId.setText( String.valueOf( c.getId() ) );
			txtCpf.setText( c.getCpf() );
			txtNome.setText( c.getNome() );
			txtTelefone.setText( c.getTelefone() );
			txtNascimento.setText( sdf.format( c.getNascimento() ) );
		}
	}

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
	private Button btnPesquisarNome = new Button("Pesquisar por Nome");
	private Button btnPesquisarId = new Button("Pesquisar por Id");
	
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
		stage.addEventHandler(ActionEvent.ANY, this);
		
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
		
		panBotoes.getChildren().addAll(btnAdicionar, btnPesquisarNome, btnPesquisarId);
				
		Scene scn = new Scene(panPrincipal, 300, 200);
		stage.setScene(scn);
		stage.setTitle("Gerenciamento de Clientes");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
