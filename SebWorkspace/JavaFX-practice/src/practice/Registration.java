package practice;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Registration {
	
	public void start(Stage primaryStage) throws Exception {

		Label usernameLabel = new Label("REGISTAR NOW PLS");
		usernameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		Button back = new Button("Back");
		Button nuttin = new Button("Nuttin'");
		Button nuttin1 = new Button("Nuttin'");
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10));
		grid.setHgap(10);
		grid.setVgap(10);
		grid.add(back,0, 0);
		grid.add(nuttin, 0, 1);
		grid.add(nuttin1, 1, 0);
		
		
//		HBox h1 = new HBox(10);
//		
//		h1.getChildren().addAll(usernameLabel);

		Scene scene = new Scene(grid, 300, 300);

		primaryStage.setTitle("Registration");
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
