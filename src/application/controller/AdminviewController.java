package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AdminviewController {
	
	@FXML
	private TextField adminuser;
	@FXML
	private TextField adminpass;
	
	@FXML
	private  Button adminbtn;
	
	@FXML
	private Label wronglogin1;
	
	
	
	public void initialize(URL url,ResourceBundle bd) {
		
		adminbtn.setOnAction((event)->{
			System.out.println("button press here");
			login(event);
		});
		
	}
	
	
	 private void login(Event event) { // is for the login to other page
		 try {
			 String username = adminuser.getText();
			 String password = adminpass.getText();
			 
			 if(username.equals("vivek")&& password.equals("vivek123")) {
				 wronglogin1.setText("username not found ");
			 }
			 else if(password.equals(null)) {
				 wronglogin1.setText("Success");
				 
				 changeview4(event);
			 }
			 

			 else {
				 wronglogin1.setText("Invalid  password");
			 }
			
			 
		 }
		 catch(Exception e ){
			 e.printStackTrace();
		 }
	 }
	 
	 private void changeview4(Event event) {
		 try {
			 
			 FXMLLoader loader  =  new FXMLLoader();
			 loader.setLocation(getClass().getResource("/application/view/RegisterNow.fxml"));//this pointing to next view/// and it will change other screen depending on the conditon
			 
			 Parent parent = loader.load(); // --------------seating up for next screen
			 RegisterNowController controller = loader.getController();
			 //controller.setData(repository);
			 Scene scene = new Scene(parent);
			 Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
			 window.setScene(scene);
			 window.show();
			 
			 
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	
	
	

}
