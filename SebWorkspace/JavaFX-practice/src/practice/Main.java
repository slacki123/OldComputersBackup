package practice;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label usernameLabel = new Label(" Username");
		usernameLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		TextField usernameField = new TextField("field");
		usernameField.setMaxWidth(500);
		
		Label passwordLabel = new Label(" Password ");
		passwordLabel.setFont(Font.font("tahoma", FontWeight.NORMAL, 20));
		
		TextField passwordField = new TextField("*********");
		passwordField.setMaxWidth(150);
		
		Hyperlink forgotPassword = new Hyperlink ("Forgot your password? Noob");
		forgotPassword.setFont(Font.font("tahoma", FontWeight.THIN, 10));
		
		
		Button btn1 = new Button("Log-in");
		Button btn2 = new Button("Register");
		
		HBox h1 = new HBox(10);
		HBox h2 = new HBox(10);
		HBox h3 = new HBox(10);
		HBox h4 = new HBox(10);
		VBox v = new VBox(10);
		
//		GridPane grid = new GridPane();
//		grid.setPadding(new Insets(20));
//		grid.setHgap(20);
//		grid.add(btn1, 0, 0);
//		grid.add(btn2, 0, 1);
		
		h1.getChildren().addAll(usernameLabel,usernameField);
		h2.getChildren().addAll(passwordLabel,passwordField);
		h3.getChildren().addAll(btn1,btn2);
		h4.getChildren().addAll(forgotPassword);
		v.getChildren().addAll(h1,h2,h4,h3);
		
		BorderPane border = new BorderPane();
		border.setPadding(new Insets(10,20,10,20));
		
		
		Scene scene = new Scene(v,300,300);
		
		
		primaryStage.setTitle("Login Page");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle (ActionEvent event) {
				primaryStage.close();
				try {
					new Welcome().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		
		
		btn2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle (ActionEvent event) {
				primaryStage.close();
				try {
					new Registration().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		
		forgotPassword.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle (ActionEvent event) {
				primaryStage.close();
				try {
					new ResetPassword().start(new Stage());
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			});
		
		
	}
	
		
	}

