package classes;

import java.util.ArrayList;

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
		pane.getChildren().addAll();

		Scene scene = new Scene(pane, 800, 800, true, SceneAntialiasing.BALANCED);
		scene.setFill(Color.rgb(20, 4, 40));

		primaryStage.setScene(scene);
		primaryStage.centerOnScreen();
		primaryStage.setFullScreenExitHint("Press F11 to toggle Fullscreen.");
		
		ArrayList<String> keys = new ArrayList<String>();
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if(!keys.contains(event.toString())) {
					keys.add(event.toString());
				}
			}
		});
		scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				keys.remove(event.toString());
			}
		});
		
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
