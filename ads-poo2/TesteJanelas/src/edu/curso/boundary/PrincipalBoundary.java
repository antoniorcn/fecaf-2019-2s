package edu.curso.boundary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class PrincipalBoundary extends Application 
						implements EventHandler<ActionEvent>{

	private BorderPane panPrincipal;
	private MenuItem mnuPet = new MenuItem("Pet");
	private MenuItem mnuAgenda = new MenuItem("Agenda");
	//private MenuItem mnuHardware = new MenuItem("Hardware");
	private Map<MenuItem, BoundaryContent> telas = new HashMap<>();

	@Override
	public void start(Stage stage) throws Exception {
		panPrincipal = new BorderPane();
		gerarMenu();
		Scene scn = new Scene(panPrincipal, 800, 600);
		stage.setScene(scn);
		stage.setTitle("Gestão de Pet Shop");
		stage.show();
	}
	
	private void gerarMenu() {
		MenuBar mnuBar = new MenuBar();
		Menu mnuArquivo = new Menu("Arquivo");
		Menu mnuGerenciar = new Menu("Gerenciar");
		Menu mnuAjuda = new Menu("Ajuda");
		
		telas.put(mnuPet, new PetBoundary());
		telas.put(mnuAgenda, new AgendaBoundary());
		// telas.put(mnuHardware, new HardwareBoundary());
		Set<MenuItem> menus = telas.keySet();
		for (MenuItem m : menus) {
			m.addEventHandler(ActionEvent.ANY, this);
			mnuGerenciar.getItems().add(m);
		}
		//mnuGerenciar.getItems().addAll(menus);
		
		mnuBar.getMenus().addAll(mnuArquivo, mnuGerenciar, mnuAjuda);
		panPrincipal.setTop(mnuBar);
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void handle(ActionEvent event) {
		BoundaryContent tela = telas.get(event.getTarget());
		if (tela != null) { 
			panPrincipal.setCenter(tela.gerarTela());
		}
	}

}
