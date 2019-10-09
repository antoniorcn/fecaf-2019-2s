package aula16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Formulario extends Application {
	public void start(Stage stage) { 
		Pane painel = new Pane();
		Scene scn = new Scene(painel);
		
		Button btn = new Button("Cadastrar");
		btn.relocate(0.0, 100.0);
		
		Label lbl = new Label("Nome Completo");
		lbl.relocate(0.0, 50.0);
		
		TextField txt = new TextField();
		txt.relocate(150.0, 50.0);
		txt.setPrefWidth(400.0);
		
		painel.getChildren().addAll(lbl, btn, txt);
		
		stage.setScene(scn);
		stage.show();
	}
	public static void main(String[] args) {
		Formulario.launch(args);
	}
}
