package aula17.form;

import java.util.ArrayList;
import java.util.List;

import aula17.entidade.Aluno;
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
	
	private List<Aluno> lista = new ArrayList<>();
	
	@Override
	public void start(Stage stage) { 
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
		
		Label lblId = new Label("Id");
		TextField txtId = new TextField();
		Label lblRa = new Label("RA");
		TextField txtRa = new TextField();		
		Label lblNome = new Label("Nome");
		TextField txtNome = new TextField();
		Label lblCurso = new Label("Curso");
		TextField txtCurso = new TextField();
		Label lblNascimento = new Label("Nascimento");
		TextField txtNascimento = new TextField();
		Label lblTelefone = new Label("Telefone");
		TextField txtTelefone = new TextField();
		
		Button btnAdicionar = new Button("Adicionar");
		Button btnPesquisar = new Button("Pesquisar");
		
		painelBotoes.getChildren().addAll(btnAdicionar, btnPesquisar);
		
		
		btnAdicionar.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						Aluno a = new Aluno();
						a.setRa(txtRa.getText());
						a.setNome(txtNome.getText());	
						lista.add(a);
					} 
				});
		
		btnPesquisar.setOnAction(
				new EventHandler<ActionEvent>() {
					@Override
					public void handle(ActionEvent event) {
						String nome = txtNome.getText();
						for (Aluno a : lista) { 
							if( a.getNome().contains(nome)) {
								txtRa.setText(a.getRa());
								txtNome.setText(a.getNome());
							}
						}
					} 
				});		
	
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
		Scene scn = new Scene(painelPrincipal, 600, 300);
		stage.setScene(scn);
		stage.setTitle("Gestão de Alunos");
		stage.show();
	}
	public static void main(String[] args) {
		AlunoForm.launch(args);
	}

}
