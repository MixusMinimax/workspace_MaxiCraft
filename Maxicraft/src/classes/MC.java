package classes;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneAntialiasing;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MC extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Group root = new Group();
		
		Pane pane = new Pane();
		pane.getChildren().addAll(bGroup);

		Scene scene = new Scene(pane, 800, 800, true, SceneAntialiasing.BALANCED);
		scene.setFill(Color.rgb(20, 4, 40));

		primaryStage.setScene(scene);
		primaryStage.centerOnScreen();
		primaryStage.setFullScreenExitHint("Press F11 to toggle Fullscreen.");
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			
		}
	}
	
	public void main(String[] args) {
		launch(args);
	}
}

















