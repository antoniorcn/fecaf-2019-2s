package aula26;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class ProdutoBoundary implements BoundaryConteudo, 
				EventHandler<ActionEvent> {
	private TextField txtId = new TextField();
	private TextField txtCodigo = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtPeso = new TextField();
	private TextField txtPreco = new TextField();
	private DatePicker dtpValidade = new DatePicker();
	private Button btnAdicionar = new Button("Adicionar");
	private Button btnPesquisar = new Button("Pesquisar");
	private ProdutoControl control = new ProdutoControl();
	private TableView<Produto> table = new TableView<>();
	private ListView<String> listView = new ListView<>();
	
	public Pane gerarTela() {
		ObservableList<String> elementosList = 
				FXCollections.observableArrayList("Item 1", "Item 2", "Item 3", "Item 4");
		listView.setItems(elementosList);
		listView.setPrefHeight(100);
		BorderPane border = new BorderPane();
		GridPane pane = new GridPane();
		Button btnUp = new Button("Up");
		Button btnDown = new Button("Down");
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
		pane.add(new Label("Ordem de Opções"), 0, 6);
		pane.add(listView, 1, 6, 1, 3);
		pane.add(btnUp, 2, 6);
		pane.add(btnDown, 2, 8);
		pane.add(btnAdicionar, 0, 9);
		pane.add(btnPesquisar, 1, 9);
		
		btnUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				int selecionado = listView.getSelectionModel().selectedIndexProperty().get();
				if (selecionado > 0) { 
					String strSelecionado = elementosList.get(selecionado);
					elementosList.remove(selecionado);
					elementosList.add(selecionado - 1, strSelecionado);
				}
			}
		});
		
		
		
		TableColumn<Produto, Long> colId = new TableColumn<>("Id");
		colId.setCellValueFactory(
			new PropertyValueFactory<Produto, Long>("id") );
		
		TableColumn<Produto, String> colNome = new TableColumn<>("Nome");
		colNome.setCellValueFactory(
				new PropertyValueFactory<Produto, String>("nome") );
		
		TableColumn<Produto, Double> colPreco = new TableColumn<>("Preço");
		colPreco.setCellValueFactory(
				new PropertyValueFactory<Produto, Double>("preco") );
		
		table.getColumns().addAll(colId, colNome, colPreco);
		
		table.setItems(control.getLista());
		
		border.setTop(pane);
		border.setCenter(table);
		
		btnAdicionar.addEventHandler(ActionEvent.ANY, this);
		btnPesquisar.addEventHandler(ActionEvent.ANY, this);
		return border;
	}
	
	public Produto boundaryParaEntidade() { 
		Produto p = new Produto();
		p.setCodigo(txtCodigo.getText());
		p.setNome(txtNome.getText());
		p.setId(Long.parseLong(txtId.getText()));
		p.setPreco(Double.parseDouble(txtPreco.getText()));
		p.setPeso(Double.parseDouble(txtPeso.getText()));
		
		LocalDate d = dtpValidade.getValue();
		Date data = Date.from(
				d.atStartOfDay(ZoneId.systemDefault()).toInstant());
		p.setValidade(data);
		return p;
	}
	
	public void entidadeParaBoundary(Produto p) { 
		txtCodigo.setText(p.getCodigo());
		txtNome.setText(p.getNome());
		txtId.setText(String.valueOf(p.getId()));
		txtPreco.setText(String.valueOf(p.getPreco()));
		txtPeso.setText(String.valueOf(p.getPeso()));
		
		LocalDate localDate = p.getValidade()
				.toInstant()
				.atZone(ZoneId.systemDefault())
				.toLocalDate();
		dtpValidade.setValue(localDate);
	}
	
	public void handle(ActionEvent e) { 
		if (e.getTarget() == btnAdicionar) {
			Produto p = boundaryParaEntidade();
			control.adicionar(p);
		} else if (e.getTarget() == btnPesquisar)  { 
			List<Produto> lista = 
				control.pesquisarPorNome(txtNome.getText());
			if (lista.size() > 0) {
				entidadeParaBoundary(lista.get(0));
			}
		}
	}

}
