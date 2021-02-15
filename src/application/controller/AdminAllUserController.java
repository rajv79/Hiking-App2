package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.SampleController;
import application.model.HikingHistory;
import application.model.HikingHistorydata;
import application.model.Repository;
import application.model.User;
import application.model.Userdata;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AdminAllUserController implements Initializable {
	
	@FXML
	private Button logbtn;
	@FXML
	private TableView allview;
	@FXML
	private TableColumn name;
	@FXML
	private TableColumn phnumber;
	@FXML
	private TableColumn username;
	@FXML
	private TextField searchfld ;
	
	// ..\Img\snoew forest.jpg
	
	
	
	//private Userdata user;
	private ObservableList<User> repo = FXCollections.observableArrayList();
	
	private Repository  repository;
	
	
	
	public void initialize(URL arg ,ResourceBundle arg1) {
		
		name.setCellValueFactory(new PropertyValueFactory<User,String>("firstname"));
		username.setCellValueFactory(new PropertyValueFactory<User,String>("username"));
		phnumber.setCellValueFactory(new  PropertyValueFactory<User,String>("phonenumber"));
		
		FilteredList<User> flist = new FilteredList<>(repo,p->true);
		SortedList<User>slist = new SortedList<>(flist);
		slist.comparatorProperty().bind(allview.comparatorProperty());
		
		allview.setItems(slist);
		
		
		
		   searchfld.textProperty().addListener(obs->{
        	String filter = searchfld.getText();
        	if(filter== null||"".equals(filter.trim())) {
        		flist.setPredicate(p-> true);
        		
        	}
        	else {
        		flist.setPredicate(p-> p.contains(filter));
        	}
        });
        
		 
		
		logbtn.setOnAction((event) -> {
			logout(event);
		});
		
		
		
	}
	
	public void setData(Repository repository) {
		
		this.repository = repository;
		for(int i =0; i<repository.getUsers().toArray().length; i++) {
			User user = repository.getUsers().toArray()[i];
			
			System.out.println(user);
			repo.add(user);
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
