package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TrailInformationController implements Initializable {

	@FXML
	private Button history;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		history.setOnAction((event)->{
			System.out.println("Button is pressed");
		});
		
		// TODO Auto-generated method stub

	}

	


	
		
	}


