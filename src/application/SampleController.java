package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.controller.TrailInformationController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SampleController implements Initializable{ //-----
	
	@FXML
	private TextField usernamefld;
	@FXML
	private TextField passwordfld;
	@FXML 
	private Button loginbtn;
	
	//userdata data = new userdata();
	
	public void initialize(URL url,ResourceBundle bd) {
		
		loginbtn.setOnAction((event)->{
			System.out.println("button press here");
			login(event);
		});
	}
	
	 private void login(Event event) { // is for the login to other page
		 try {
			 String username = usernamefld.getText();
			 String password = passwordfld.getText();
			// userdata.fetch(username);
			 if(username.equals("vivek")) {
				 changeView(event);
			 }
			
			 
		 }
		 catch(Exception e ){
			 
		 }
	 }
	 private void changeView(Event event) { // this method is used to change scene from one to another
		 
		 try {
			
			 FXMLLoader loader  =  new FXMLLoader();
			 loader.setLocation(getClass().getResource("/application/view/TrailInformation.fxml"));//this pointing to next view 
			 Parent parent = loader.load(); // --------------seating up for next stat
			 TrailInformationController controller = loader.getController();
			 
			 Scene scene = new Scene(parent);
			 Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			 window.setScene(scene);
			 window.show();
			 
		 }
		 catch(Exception e ){
			 
		 }
		 
		 
		 
		 
	 }
	
}
