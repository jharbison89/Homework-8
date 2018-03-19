import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Exercise_14_6 extends Application{

	/* Created by James Harbison
	 * this program creates a Checkerboard using JavaFX
	 */
	
	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane();
		// create squares and add to the pane
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				// shift the starting location of each square based to create a checkerboard
				Rectangle s1 = new Rectangle(100 * i, 100 * j, 100, 100);
				s1.setStroke(Color.BLACK);
				// alternates colors between white and black for based on the values of i and j which directly 
				// translate to the location of the square in the checkerboard grid
				if((j + i) % 2 == 1) {
					s1.setFill(Color.BLACK);
				}
				else {
					s1.setFill(Color.WHITE);
				}
				pane.getChildren().add(s1);
			}
		}
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 800, 800);
		primaryStage.setTitle("Exercise 14-6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
