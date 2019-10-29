package aula20.teste;

import java.util.ArrayList;
import java.util.List;

import com.sun.javafx.scene.control.skin.LabeledText;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TesteComponentes extends Application 
implements EventHandler<MouseEvent>{
	
	private LabeledText tempButton;
	private int count = 0;
	Pane principal = new Pane();

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scn = new Scene(principal, 800, 600);
		primaryStage.setScene(scn);
		principal.addEventHandler(MouseEvent.ANY, this);
		
		primaryStage.setTitle("Labels");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(MouseEvent e) {
		// System.out.println(e.getEventType());
		if (e.getEventType() == MouseEvent.MOUSE_CLICKED) { 
			Label temp = new Label("" + count);
			temp.relocate(e.getSceneX(), e.getSceneY());
			principal.getChildren().add(temp);
			count ++;
		} else if (e.getEventType() == MouseEvent.MOUSE_PRESSED) { 
			System.out.println(e.getTarget().getClass().getName());
			if (e.getTarget() instanceof LabeledText) { 
				tempButton = (LabeledText) e.getTarget();
				System.out.format("Botao %s pego", tempButton.getText() );
			}
		} else if (e.getEventType() == MouseEvent.MOUSE_RELEASED) {
			if (tempButton != null) {
				tempButton.relocate(e.getSceneX(), e.getSceneY());
				System.out.format("Botao %s solto", tempButton.getText() );
				tempButton = null;
			}
		}
	}
	

}
