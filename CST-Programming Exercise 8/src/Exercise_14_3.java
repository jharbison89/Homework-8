import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.stage.image.Image;
import javafx.scene.image.ImageView;

public class Exercise_14_3 extends Application {

	/* Created by James Harbison
	 * this program draws and displays 3 random cards.  the card image files are named 1.png,
	 * 2.png, ... , 52.png and are in the image/card directory.
	 */
	@Override
	public void start(Stage primaryStage) {
		// Create a pane to hold the images
		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));
		int[] cards = new int[3];
		
		int i = 0;
		
		// creates a random number between 1 and 52 and adds it to the array cards if the number is not already present
		if(i < 3){
			int doubleChoice = 0;
			int selection = (int)(Math.random() * 52) + 1;
			for(int j = 0; j < i; j ++) {
				if(cards[j] == selection) {
					doubleChoice ++;
				}
				if(doubleChoice == 0) {
					cards[i] = selection;
					i++;
				}
			}
		} 
		
		// adds the images to the pane to display
		for(i = 0; i < 3; i ++ ) {
			Image image = new Image("image/card" + cards[i] + ".png");
			pane.getChildren().add(new ImageView(image));
		}
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 250);
		primaryStage.setTitle("Excercise 14-3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
