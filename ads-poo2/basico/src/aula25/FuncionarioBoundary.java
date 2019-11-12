package aula25;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FuncionarioBoundary extends Application 
			implements EventHandler<ActionEvent>{
	private TextField txtId = new TextField();
	private TextField txtMatricula = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtCpf = new TextField();
	private TextField txtTempoServico = new TextField();
	
	private Button btnAdicionar = new Button("Adicionar");
	
	private FuncionarioControl control = new FuncionarioControl();
	
	@Override
	public void start(Stage stage) throws Exception {
		GridPane pane = new GridPane();
		Scene scn = new Scene(pane, 400, 200);
		
		pane.add(new Label("Id"), 0, 0);
		pane.add(txtId, 1, 0);
		pane.add(new Label("Matricula"), 0, 1);
		pane.add(txtMatricula, 1, 1);
		pane.add(new Label("Nome"), 0, 2);
		pane.add(txtNome, 1, 2);
		pane.add(new Label("CPF"), 0, 3);
		pane.add(txtCpf, 1, 3);
		pane.add(new Label("Tempo de Servico"), 0, 4);
		pane.add(txtTempoServico, 1, 4);
		pane.add(btnAdicionar, 0, 5);
		
		btnAdicionar.addEventHandler(ActionEvent.ANY, this);
		
		stage.setScene(scn);
		stage.setTitle("Gestão de Funcionarios");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(FuncionarioBoundary.class, args);
	}
	
	public void handle(ActionEvent e) { 
		if (e.getTarget() == btnAdicionar) { 
			Funcionario f = new Funcionario();
			f.setMatricula(txtMatricula.getText());
			f.setCpf(txtCpf.getText());
			f.setNome(txtNome.getText());
			f.setTempoServico(
				Integer.parseInt(txtTempoServico.getText()));
			f.setId(Long.parseLong(txtId.getText()));
			
			control.adicionar( f );
		}
	}

}
