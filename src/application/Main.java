package application;
	
import application.controller.TrailHistoryController;
import application.model.Repository;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			 Repository repository = new Repository();
			 FXMLLoader loader  =  new FXMLLoader();
			 loader.setLocation(getClass().getResource("Sample.fxml"));//this pointing to next view/// and it will change other screen depending on the conditon
			 
			 Parent parent = loader.load(); // --------------seating up for next screen
			 SampleController controller = loader.getController(); /// this will also change according to the scene required
			 controller.setData(repository);
			 Scene scene = new Scene(parent,800,600);
			 
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
