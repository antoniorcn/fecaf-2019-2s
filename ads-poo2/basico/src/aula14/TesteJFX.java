package aula14;
import javafx.application.Application;
import javafx.stage.Stage;

public class TesteJFX extends Application {
	
	@Override
	public void start(Stage stg) { 
		stg.setTitle("Minha primeira Janela Java FX");
		stg.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
