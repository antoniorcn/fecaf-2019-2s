package edu.curso;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class SistemaSolar extends Application {
	
	public double metadeImagemX(Image img, double x) { 
		return x - img.getWidth() / 2;
	}
	
	public double metadeImagemY(Image img, double y) { 
		return y - img.getHeight() / 2;
	}
	
	public double grausToRad(double graus) { 
		return graus / 180 * Math.PI;
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Image imgSpace = new Image(
				getClass().getResourceAsStream("/images/space.png"));
		Image imgSun = new Image(
				getClass().getResourceAsStream("/images/sun.png"));
		Image imgEarth = new Image(
				getClass().getResourceAsStream("/images/earth.png"));		
		double centerX = imgSpace.getWidth() / 2;
		double centerY = imgSpace.getHeight() / 2;
		Group grp = new Group();
		Scene scn = new Scene(grp, imgSpace.getWidth(), imgSpace.getHeight());
		
		Canvas canvas = new Canvas(imgSpace.getWidth(), imgSpace.getHeight());
		grp.getChildren().add(canvas);
		
		GraphicsContext ctx = canvas.getGraphicsContext2D();
		
		
		long nanoTime = System.nanoTime();
		
		new AnimationTimer() {
			@Override
			public void handle(long now) {
				double instante = (now - nanoTime) / 10000000;
				// System.out.println(instante);
				double centerSunX = metadeImagemX(imgSun, centerX);
				double centerSunY = metadeImagemY(imgSun, centerY);
				
				double centerEarthX = metadeImagemX(imgEarth, centerX);
				double centerEarthY = metadeImagemY(imgEarth, centerY);
				double angulo = grausToRad(instante);
				double earthX = centerEarthX + 250 * Math.sin(angulo);
				double earthY = centerEarthY + 100 * Math.cos(angulo);
				ctx.drawImage(imgSpace, 0, 0);
				ctx.drawImage(imgSun, centerSunX, centerSunY);
				ctx.drawImage(imgEarth, earthX, earthY);
			} 
		}.start();
		
		
		stage.setTitle("Sistema Solar");
		stage.setScene(scn);
		stage.show();
	}
	
	
	public static void main(String[] args) {
		SistemaSolar.launch(args);
	}

}
