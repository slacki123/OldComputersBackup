package practice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class ResetPassword {
	
	public void start(Stage primaryStage) throws Exception {
		
	Label usernameLabel = new Label(" SHOULDVE \n REMEMBERED UR PASSWORD \n BUT NOW URE FUKD M8");
	usernameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	
	Button back = new Button("Back");
	
	HBox h2 = new HBox(10);
	HBox h1 = new HBox(10);
	VBox h3 = new VBox(10);
	
	h1.getChildren().addAll(usernameLabel);
	h2.getChildren().addAll(back);
	h3.getChildren().addAll(h1,h2);

	Scene scene = new Scene(h3, 300, 300);

	primaryStage.setTitle("Secondary Page");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	back.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle (ActionEvent event) {
			primaryStage.close();
			try {
				new Main().start(new Stage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		});

}}
