package aula26;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class RelatorioBoundary implements BoundaryConteudo {

	@Override
	public Pane gerarTela() {
		GridPane grid = new GridPane();
		PieChart pie = new PieChart();
		ObservableList<PieChart.Data> pieChartData =
                FXCollections.observableArrayList(
                new PieChart.Data("A vencer em até 1 mês", 13),
                new PieChart.Data("A vencer em até 6 meses", 25),
                new PieChart.Data("A vencer em até 12 meses", 10),
                new PieChart.Data("Vencidos", 22),
                new PieChart.Data("Sem validade", 30));
		pie.setData(pieChartData);
		
		final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Mês");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Produtos vendidos, 2019");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("Vendas de produtos");
        //populating the series with data
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 36));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 45));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));
        lineChart.getData().add(series);
        
        grid.add(pie, 0, 0);
        grid.add(lineChart, 1,  0);

		return grid;
	}

}
