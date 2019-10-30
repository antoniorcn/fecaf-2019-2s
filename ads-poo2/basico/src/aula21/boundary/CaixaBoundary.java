package aula21.boundary;

import aula21.entidade.Caixa;
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

public class CaixaBoundary extends Application {
	private TextField txtId = new TextField();
	private TextField txtMatricula = new TextField();
	private TextField txtNome = new TextField();
	
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	
	public Caixa boundaryParaEntidade() { 
		Caixa c = new Caixa();
		c.setMatricula(txtMatricula.getText());
		c.setNome(txtNome.getText());
		c.setId(Long.parseLong(txtId.getText()));
		return c;
	}
	
	public void entidadeParaBoundary(Caixa c) { 
		txtId.setText(String.valueOf(c.getId()));
		txtNome.setText(c.getNome());
		txtMatricula.setText(c.getMatricula());
	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane panPrincipal = new BorderPane();
		GridPane panCampos = new GridPane();
		FlowPane panBotoes = new FlowPane();
		
		panPrincipal.setCenter(panCampos);
		panPrincipal.setBottom(panBotoes);
		
		panCampos.add(new Label("Id"), 0, 0);
		panCampos.add(txtId,  1,  0);
		panCampos.add(new Label("Matricula"), 0, 1);
		panCampos.add(txtMatricula,  1,  1);
		panCampos.add(new Label("Nome"), 0, 2);
		panCampos.add(txtNome,  1,  2);
		
		panBotoes.getChildren().addAll(btnAdicionar, btnPesquisar);
		
		btnPesquisar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Caixa c = new Caixa();
				c.setMatricula("123456");
				c.setNome("João da Silva");
				c.setId(2l);
				
				entidadeParaBoundary(c);
			} 
		});
		
		Scene scn = new Scene(panPrincipal);
		stage.setScene(scn);
		
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
