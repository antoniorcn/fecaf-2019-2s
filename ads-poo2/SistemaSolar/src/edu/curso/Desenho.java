package edu.curso;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Desenho extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		Group grp = new Group();
		Scene scn = new Scene(grp, 640, 480);
		Canvas canvas = new Canvas(640, 480);
		grp.getChildren().add(canvas);
		GraphicsContext ctx = canvas.getGraphicsContext2D();
		ctx.setFill(Color.RED);
		ctx.fillRect(100, 100, 200, 100);
		ctx.setLineWidth(4);
		ctx.setStroke(Color.GREEN);
		ctx.beginPath();
		ctx.strokeOval(100, 100, 200, 100);
		ctx.moveTo(320, 240);
		ctx.lineTo(100, 100);
		ctx.stroke();
	
		stage.setScene(scn);
		stage.show();		
	}
	public static void main(String[] args) {
		Desenho.launch(args);
	}
}
