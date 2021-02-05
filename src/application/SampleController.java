package application;

import java.net.URL;
import java.util.ResourceBundle;

import application.controller.RegisterNowController;
import application.controller.TrailHistoryController;
import application.controller.TrailInformationController;
import application.model.Repository;
import application.model.User;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SampleController implements Initializable{ //-----
	
	@FXML
	private TextField usernamefld;
	@FXML
	private PasswordField passwordfld;
	@FXML 
	private Button loginbtn;
	@FXML 
	private Label wronglogin;
	@FXML
	private Button registernow;
	
	private Repository repository = new Repository();
	
	//userdata data = new userdata();
	
	public void initialize(URL url,ResourceBundle bd) {
		
		loginbtn.setOnAction((event)->{
			System.out.println("button press here");
			login(event);
		});
		
		registernow.setOnAction((event2)->{ // this code will help to take into new screen for registernow
			System.out.println("registernow press here");
			register(event2);
		});
		
	}
	
	
	
	
	
	/******************************************************Login Page username and passwrod**************************************************************/
	
	 private void login(Event event) { // is for the login to other page
		 try {
			 String username = usernamefld.getText();
			 String password = passwordfld.getText();
			// userdata.fetch(username);
			 if(username.equals("vivek") && password.equals("vivek123")) {
				 wronglogin.setText("Success");
				 
				 changeView(event);
			 }
			 
			 else if(username.isEmpty()&&password.isEmpty()) {
				 wronglogin.setText("Please enter your Password or Username");
				 
			 
				 
			 }
			 else {
				 wronglogin.setText("Invalid Username or password");
			 }
			
			 
		 }
		 catch(Exception e ){
			 
		 }
	 }
	 
	  /*private String getuserpassword(String Username) {
		 User user = (repository.getUsers().fetch(Username));
		 
		 return"";
		 }*/
	 
	/********************************************NEW Register login page********************************************************/
	 
	 
	 private void register(Event event2) {
		 changeview2(event2);
	 }
	 
	 /*****************************************************Login Page to Trail info page *******************************************************************************/
	 
	 
	 
	 private void changeView(Event event) { // this method is used to change scene from one to another
		 
		 try {
			
			 FXMLLoader loader  =  new FXMLLoader();
			 loader.setLocation(getClass().getResource("/application/view/TrailHistory.fxml"));//this pointing to next view/// and it will change other screen depending on the conditon
			 
			 Parent parent = loader.load(); // --------------seating up for next screen
			 TrailHistoryController controller = loader.getController(); /// this will also change according to the scene required
			 //controller.setData(repository);
			 Scene scene = new Scene(parent);
			 Stage window = (Stage)((Node)event.getSource()).getScene().getWindow(); ////here the line will change according the eventname given as parameter for the event
			 window.setScene(scene);
			 window.show();
			 
		 }
		 catch(Exception e ){
			 e.printStackTrace();
		 }
		 
		 
		 
		 /*******************************************Login page to New Register page*******************************************/
	 }
	 
	 private void changeview2(Event event2) {
		 try {
			 
			 FXMLLoader loader  =  new FXMLLoader();
			 loader.setLocation(getClass().getResource("/application/view/RegisterNow.fxml"));//this pointing to next view/// and it will change other screen depending on the conditon
			 
			 Parent parent = loader.load(); // --------------seating up for next screen
			 RegisterNowController controller = loader.getController();
			 controller.setData(repository);
			 Scene scene = new Scene(parent);
			 Stage window = (Stage)((Node)event2.getSource()).getScene().getWindow();
			 window.setScene(scene);
			 window.show();
			 
			 
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	
}
