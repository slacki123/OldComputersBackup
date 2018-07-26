package mineSweeper;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class Main extends Application {

	
		

		

			private Stage mainPage;
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Application.launch(args);

			}

			@Override
			public void start(Stage startStage) throws Exception {
				this.mainPage = startStage;
				mainPage.setTitle("Mine Sweeper");
				mainPage.show();
				MineSweeperGrid gameGrid = new MineSweeperGrid(10,30);
				Scene scene = new Scene(gameGrid.getBombLayout());
				mainPage.setScene(scene);
				
				
			}
			
		
	}


