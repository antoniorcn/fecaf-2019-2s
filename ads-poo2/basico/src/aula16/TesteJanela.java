package aula16;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class TesteJanela extends Application {
	public void start(Stage stage) { 
		Pane painel = new Pane();
		Scene scn = new Scene(painel);
		
		Button btn = new Button("Aperte-me");
		btn.relocate(100.0, 50.0);
		
		Label lbl = new Label("Hello World");
		lbl.relocate(0.0, 50.0);
		
		painel.getChildren().addAll(lbl, btn);
		
		stage.setScene(scn);
		stage.show();
	}
	public static void main(String args[]) { 
		TesteJanela.launch(args);
	}
}
