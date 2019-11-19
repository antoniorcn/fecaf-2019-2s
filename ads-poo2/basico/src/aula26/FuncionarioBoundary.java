package aula26;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class FuncionarioBoundary implements 
	BoundaryConteudo, EventHandler<ActionEvent>{
	private TextField txtId = new TextField();
	private TextField txtMatricula = new TextField();
	private TextField txtNome = new TextField();
	private TextField txtCpf = new TextField();
	private TextField txtTempoServico = new TextField();
	private ComboBox<String> cmbDept = new ComboBox<>();
	private DatePicker dtpContratacao = new DatePicker();
	private Button btnAdicionar = new Button("Adicionar");
	private FuncionarioControl control = new FuncionarioControl();
	
	@Override
	public Pane gerarTela() {
		GridPane pane = new GridPane();
	
		pane.add(new Label("Id"), 0, 0);
		pane.add(txtId, 1, 0);
		pane.add(new Label("Matricula"), 0, 1);
		pane.add(txtMatricula, 1, 1);
		pane.add(new Label("Nome"), 0, 2);
		pane.add(txtNome, 1, 2);
		pane.add(new Label("CPF"), 0, 3);
		pane.add(txtCpf, 1, 3);
		pane.add(new Label("Data de Contratação"), 0, 4);
		pane.add(dtpContratacao, 1, 4);
		pane.add(new Label("Tempo de Servico"), 0, 5);
		pane.add(txtTempoServico, 1, 5);
		pane.add(new Label("Departamento"), 0, 6);
		pane.add(cmbDept, 1, 6);
		pane.add(btnAdicionar, 0, 7);
		
		ObservableList<String> departamentos = 
				FXCollections.observableArrayList("Vendas", "RH", "TI", "Ativos");
		cmbDept.setItems( departamentos );
		
		btnAdicionar.addEventHandler(ActionEvent.ANY, this);
		return pane;
	}
	
	public void handle(ActionEvent e) { 
		if (e.getTarget() == btnAdicionar) { 
			Funcionario f = new Funcionario();
			f.setMatricula(txtMatricula.getText());
			f.setCpf(txtCpf.getText());
			f.setNome(txtNome.getText());
			f.setTempoServico(
				Integer.parseInt(txtTempoServico.getText()));
			f.setId(Long.parseLong(txtId.getText()));
			LocalDate d = dtpContratacao.getValue();
			Date data = Date.from(
					d.atStartOfDay(ZoneId.systemDefault()).toInstant());
			f.setContratacao(data);
			control.adicionar( f );
		}
	}

}
