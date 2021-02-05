package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.SampleController;
import application.model.HikingHistory;
import application.model.HikingHistorydata;
import application.model.Repository;
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
    private ObservableList<HikingHistory> repo = FXCollections.observableArrayList();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        namecol.setCellValueFactory(new PropertyValueFactory<HikingHistory, String>("Trail_name")); /// this will pull data from hikinghitory
        startdatecol.setCellValueFactory(new PropertyValueFactory<HikingHistory, String>("date_started"));
        starttimecol.setCellValueFactory(new PropertyValueFactory<HikingHistory, String>("Time_Strated"));

        endtimecol.setCellValueFactory(new PropertyValueFactory<HikingHistory, String>("Time_finshed"));
        distancecol.setCellValueFactory(new PropertyValueFactory<HikingHistory, String>("distance"));

        FilteredList<HikingHistory> flist = new FilteredList<>(repo, p -> true);

        SortedList<HikingHistory> slist = new SortedList<>(flist);

        slist.comparatorProperty().bind(historyview.comparatorProperty());

        historyview.setItems(slist);

        logoutbtn.setOnAction((event) -> {
            logout(event);
        });

        addtrailbtn.setOnAction((event) -> {
            addtrail(event);
        });

    }

    public void setData(Repository repository) {

        for (int i = 0; i < 10; i++) {
            HikingHistory h = new HikingHistory("name" + i, i, (10 * i), (10 * i), i, (100 * i));
            repo.add(h);
        }
    }

    private void logout(Event event) {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/application/Sample.fxml"));//this pointing to next view/// and it will change other screen depending on the conditon

            Parent parent = loader.load(); // --------------seating up for next screen
            SampleController controller = loader.getController();
            //controller.setData(repository);
            Scene scene = new Scene(parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addtrail(Event event) {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/application/view/TrailInformation.fxml"));//this pointing to next view/// and it will change other screen depending on the conditon

            Parent parent = loader.load(); // --------------seating up for next screen
            TrailInformationController controller = loader.getController();
            //controller.setData(repository);
            Scene scene = new Scene(parent);
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(scene);
            window.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
