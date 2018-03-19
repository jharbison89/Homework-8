import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;

public class Exercise_14_4 extends Application {
	/* Created by James Harbison
	 * this program creates the text of "Java" in Times New Roman font bold and italicized and in a random color.
	 * the text is then rotated 90 degrees.  this process is repeated 5 times then displayed 
	 */
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane to hold the texts
		Pane pane = new Pane();
		pane.setPadding(new Insets(5, 5, 5, 5));
		for(int i = 0; i < 5; i ++) {
			Text text1 = new Text((50 * i) + 20, 45, "Java");
			text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
			text1.setFill(Color.color(Math.random(), Math.random(), Math.random()));
			text1.setRotate(90);
			pane.getChildren().add(text1);
		}
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise 14-4");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}
