package edu.curso.boundary;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class AgendaBoundary implements BoundaryContent {
	private TextField txtId = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtTelefone = new TextField();
	@Override
	public Pane gerarTela() {
		GridPane pane = new GridPane();
		pane.add(new Label("Id"), 0, 0);
		pane.add(txtId, 1, 0);
		pane.add(new Label("Nome Completo"), 0, 1);
		pane.add(txtNome, 1, 1);
		pane.add(new Label("Telefone"), 0, 2);
		pane.add(txtTelefone, 1, 2);
		return pane;
	}

}
