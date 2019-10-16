package aula17.form;

import aula17.entidade.Aluno;
import aula18.control.AlunoControl;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AlunoForm extends Application {
	
	private AlunoControl controle = new AlunoControl();
	
	private Label lblId = new Label("Id");
	private TextField txtId = new TextField();
	private Label lblRa = new Label("RA");
	private TextField txtRa = new TextField();		
	private Label lblNome = new Label("Nome");
	private TextField txtNome = new TextField();
	private Label lblCurso = new Label("Curso");
	private TextField txtCurso = new TextField();
	private Label lblNascimento = new Label("Nascimento");
	private TextField txtNascimento = new TextField();
	private Label lblTelefone = new Label("Telefone");
	private TextField txtTelefone = new TextField();
	private Button btnAdicionar = new Button("Adicionar"); 
	private Button btnPesquisar = new Button("Pesquisar");
	
	private BorderPane criarJanela() { 
		BorderPane painelPrincipal = new BorderPane();
		GridPane painelCampos = new GridPane();
		FlowPane painelBotoes = new FlowPane();
		painelPrincipal.setCenter(painelCampos);
		painelPrincipal.setBottom(painelBotoes);
		painelPrincipal.setStyle("-fx-background-color: yellow;");
		ColumnConstraints col1 = new ColumnConstraints();
		col1.setPercentWidth(30);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(70);
		painelCampos.getColumnConstraints().addAll(col1, col2);
		painelCampos.add(lblId, 0, 0);
		painelCampos.add(txtId, 1, 0);
		painelCampos.add(lblRa, 0, 1);
		painelCampos.add(txtRa, 1, 1);
		painelCampos.add(lblNome, 0, 2);
		painelCampos.add(txtNome, 1, 2);
		painelCampos.add(lblCurso, 0, 3);
		painelCampos.add(txtCurso, 1, 3);
		painelCampos.add(lblNascimento, 0, 4);
		painelCampos.add(txtNascimento, 1, 4);	
		painelCampos.add(lblTelefone, 0, 5);
		painelCampos.add(txtTelefone, 1, 5);
		painelBotoes.getChildren().addAll(btnAdicionar, btnPesquisar);
		return painelPrincipal;
	}
	
	public Aluno doFormularioParaAluno() { 
		Aluno a = new Aluno();
		a.setRa(txtRa.getText());
		a.setNome(txtNome.getText());	
		return a;
	}
	
	public void doAlunoParaFormulario(Aluno a) { 
		txtRa.setText(a.getRa());
		txtNome.setText(a.getNome());
	}
	
	@Override
	public void start(Stage stage) { 
		BorderPane painel = criarJanela();
		btnAdicionar.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						Aluno a = doFormularioParaAluno();
						controle.adicionar(a);
					} 
				});
		btnPesquisar.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						String nome = txtNome.getText();
						Aluno a = controle.pesquisaPorNome(nome);
						if (a != null) { 
							doAlunoParaFormulario(a);
						}

					} 
				});		
		Scene scn = new Scene(painel, 600, 300);
		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");
		stage.show();
	}
	public static void main(String[] args) {
		AlunoForm.launch(args);
	}

}
