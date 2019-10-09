package aula16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FormularioLayout extends Application {
	public void start(Stage stage) { 
		BorderPane painel = new BorderPane();
		Scene scn = new Scene(painel, 400, 300);
		Button btn1 = new Button("Botão 1");
		btn1.setStyle("-fx-background-color:red;");
		// btn1.setPrefWidth(200);
		Button btn2 = new Button("Botão 2");
		btn2.setStyle("-fx-background-color:yellow;");
		// btn2.setPrefWidth(200);
		
		FlowPane flowPainel = new FlowPane();
		flowPainel.setHgap(10);
		flowPainel.setPrefWidth(400);
		flowPainel.getChildren().addAll(btn1, btn2);
		painel.setBottom(flowPainel);
		//painel.setTop(btn1);
		//painel.setBottom(btn2);
		
		stage.setScene(scn);
		stage.setTitle("Formulario com Layouts");
		stage.show();
	}

	public static void main(String[] args) {
		FormularioLayout.launch(args);
	}

}
