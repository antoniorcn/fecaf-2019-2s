package aula25;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PrincipalBoundary extends Application {
	private MenuBar mnuBarra = new MenuBar();
	private Menu mnuArquivo = new Menu("Arquivo");
	private Menu mnuCadastro = new Menu("Cadastro");
	private MenuItem mnuFuncionario = new MenuItem("Funcionario");
	private MenuItem mnuProduto = new MenuItem("Produto");
	public void start(Stage stage) { 
		BorderPane pane = new BorderPane();
		Scene scn = new Scene(pane, 640, 480);
		
		mnuBarra.getMenus().addAll(mnuArquivo, mnuCadastro);
		mnuCadastro.getItems().addAll(mnuFuncionario, mnuProduto);
		pane.setTop(mnuBarra);
		
		stage.setScene(scn);
		stage.setTitle("Sistema de Supermercado");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(PrincipalBoundary.class, args);
	}
	

}
