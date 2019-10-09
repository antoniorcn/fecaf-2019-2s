package edu.curso;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class TesteJanela extends Application {
	public void start(Stage stage) { 
		Pane painel = new Pane();
		Scene scn = new Scene(painel);
		
		Button btn = new Button("Aperte-me");
		
		painel.getChildren().add(btn);
		
		stage.setScene(scn);
		stage.show();
	}
	public static void main(String args[]) { 
		TesteJanela.launch(args);
	}
}
