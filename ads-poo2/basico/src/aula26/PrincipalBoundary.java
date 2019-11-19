package aula26;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PrincipalBoundary extends Application {
	private MenuBar mnuBarra = new MenuBar();
	private Menu mnuArquivo = new Menu("Arquivo");
	private Menu mnuCadastro = new Menu("Cadastro");
	private MenuItem mnuFuncionario = new MenuItem("Funcionario");
	private MenuItem mnuProduto = new MenuItem("Produto");
	private MenuItem mnuRelatorios = new MenuItem("Relatorios");
	private ImageView imgView;
	public void start(Stage stage) { 
		BorderPane pane = new BorderPane();
		Scene scn = new Scene(pane, 640, 480);
		
		Image image = new Image("file:images/supermercado.jpg");
		imgView = new ImageView(image);
		imgView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				BoundaryConteudo tela = new ProdutoBoundary();
				if (event.getX() > 310) { 
					tela = new FuncionarioBoundary();
				}
				Pane p = tela.gerarTela();
				pane.setCenter(p);
			} 
		});
				
		mnuBarra.getMenus().addAll(mnuArquivo, mnuCadastro);
		mnuCadastro.getItems().addAll(mnuFuncionario, mnuProduto, mnuRelatorios);
		pane.setTop(mnuBarra);
		pane.setCenter(imgView);
		
		mnuFuncionario.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) { 
				FuncionarioBoundary funcBoundary = 
						new FuncionarioBoundary();
				Pane p = funcBoundary.gerarTela();
				pane.setCenter(p);
			}
		});
		
		mnuProduto.setOnAction(new EventHandler<ActionEvent>() { 
			public void handle(ActionEvent e) { 
				ProdutoBoundary prodBoundary = new ProdutoBoundary();
				pane.setCenter(prodBoundary.gerarTela());
			}
		});
		
		mnuRelatorios.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) { 
				RelatorioBoundary relBoundary = new RelatorioBoundary();
				pane.setCenter(relBoundary.gerarTela());
			}
		});
		
		stage.setScene(scn);
		stage.setTitle("Sistema de Supermercado");
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(PrincipalBoundary.class, args);
	}
	

}
