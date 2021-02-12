package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.SampleController;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegisterNowController implements Initializable {

	@FXML
	private TextField firstnamefld;
	@FXML
	private TextField lastnamefld;
	@FXML
	private TextField pnumberfld;
	@FXML
	private TextField Nusernamefld;
	@FXML
	private TextField Npaswordfld;
	@FXML
	private Button savebtn;
	@FXML
	private Button log;

	private Repository repository;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		// TODO Auto-generated method stub
		String nfirstname = firstnamefld.getText();
		String nlastname = lastnamefld.getText();
		String nphonenumber = pnumberfld.getText();
		String newusername = Nusernamefld.getText();
		String newpassword = Npaswordfld.getText();

		
		System.out.println("Register Now");
		savebtn.setOnAction((event) -> {
			
			save(event);
		});
		log.setOnAction((event) -> {
			logout(event);
		});

	}

	// read textfield to get all of userinformation from registerpage

	// User users = new User(first name,lastname,username,...);
	// User user = new
	// User(nfirstname,nlastname,nphonenumber,newusername,newpassword,history);
	// repository.getUsers().insert(user);
	
	
	
	public void setData(Repository repository) {
		this.repository = repository;
	}

	private void save(Event event) {
		String nfirstname = firstnamefld.getText();
		String nlastname = lastnamefld.getText();
		String nphonenumber = pnumberfld.getText();
		String newusername = Nusernamefld.getText();
		String newpassword = Npaswordfld.getText();
		
		User user = new User(newusername,newpassword,nfirstname,nlastname,nphonenumber, newpassword); // check here the constrctutre
		repository.setCurrentUser(user);
		repository.getUsers().insert(user);// this will add users in repo
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/view/TrailHistory.fxml"));// this pointing to next
																								// view/// and it will
																								// change other screen
																								// depending on the
																								// conditon

			Parent parent = loader.load(); // --------------seating up for next screen
			TrailHistoryController controller = loader.getController();
			controller.setData(repository);
			Scene scene = new Scene(parent);
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(scene);
			window.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void logout(Event event) {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("/application/Sample.fxml"));// this pointing to next view/// and
																					// it will change other screen
																					// depending on the conditon

			Parent parent = loader.load(); // --------------seating up for next screen
			SampleController controller = loader.getController();
			controller.setData(repository);
			Scene scene = new Scene(parent);
			Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
			window.setScene(scene);
			window.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
