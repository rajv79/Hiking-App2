package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.model.HikingHistory;
import application.model.HikingHistorydata;
import application.model.Repository;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class TrailHistoryController implements Initializable {
	
	
	@FXML 
	private TextField searchfld;
	@FXML
	private Button addtrailbtn;
	@FXML
	private Button logoutbtn;
	@FXML
	private TableView historyview;
	@FXML
	private TableColumn namecol;
	@FXML
	private TableColumn startdatecol;
	@FXML
	private TableColumn starttimecol;
	
	@FXML
	private TableColumn endtimecol;
	@FXML
	private TableColumn distancecol;
	
	
	private HikingHistorydata history;// import the data strcture
	private ObservableList <HikingHistory> repo = FXCollections.observableArrayList();

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		namecol.setCellValueFactory(new PropertyValueFactory<HikingHistory,String>("Trail_name")); /// this will pull data from hikinghitory
		startdatecol.setCellValueFactory(new PropertyValueFactory<HikingHistory,String>("date_started"));
		starttimecol.setCellValueFactory(new PropertyValueFactory<HikingHistory,String>("Time_Strated"));
		
		endtimecol.setCellValueFactory(new PropertyValueFactory<HikingHistory,String>("Time_finshed"));
		distancecol.setCellValueFactory(new PropertyValueFactory<HikingHistory,String>("distance"));
		
		FilteredList<HikingHistory> flist = new FilteredList<>(repo,p->true);
		
		SortedList<HikingHistory> slist = new SortedList<>(flist);
		
		slist.comparatorProperty().bind(historyview.comparatorProperty());
		
		historyview.setItems(slist);
		
	}

	public void setData(Repository repository) {
		
		for(int i = 0; i<10;i++) {
			HikingHistory h = new HikingHistory("name"+i,i,(10*i),(10*i),i,(100*i));
			repo.add(h);
		}
	}
}
