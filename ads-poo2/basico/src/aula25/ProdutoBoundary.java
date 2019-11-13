package aula25;

import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ProdutoBoundary implements BoundaryConteudo {
	private TextField txtId = new TextField();
	private TextField txtCodigo = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtPeso = new TextField();
	private TextField txtPreco = new TextField();
	private DatePicker dtpValidade = new DatePicker();
	private Button btnAdicionar = new Button("Adicionar");
	
	public Pane gerarTela() {
		GridPane pane = new GridPane();
		pane.add(new Label("Id"), 0, 0);
		pane.add(txtId, 1, 0);
		pane.add(new Label("Codigo"), 0, 1);
		pane.add(txtCodigo, 1,  1);
		pane.add(new Label("Nome"), 0, 2);
		pane.add(txtNome, 1, 2);
		pane.add(new Label("Peso"), 0, 3);
		pane.add(txtPeso, 1, 3);
		pane.add(new Label("Preço"), 0, 4);
		pane.add(txtPreco, 1, 4);
		pane.add(new Label("Data de Validade"), 0, 5);
		pane.add(dtpValidade, 1,  5);
		pane.add(btnAdicionar, 0, 6);
		return pane;
	}

}
