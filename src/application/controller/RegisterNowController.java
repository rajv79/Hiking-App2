package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.Repository;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RegisterNowController implements Initializable {
	

	private Repository repository;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	 }

	// String name = firstnamefld.getText();
	
	// read textfield to get all of userinfo 
	
	
	//creat new user = new User(data from textfield);
	//User users = new User(first name,lastname,username,...);
	
	//repository.getUsers().insert(user);
	
	public void setData(Repository repository) {
		this.repository = repository;
		
	}
}
