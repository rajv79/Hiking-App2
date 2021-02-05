package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.SampleController;
import application.model.HikingHistory;
import application.model.HikingHistorydata;
import application.model.Trail;
import application.model.Traildata;
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

public class TrailInformationController implements Initializable {

	@FXML
    private TextField startdatefld;
    @FXML
    private TextField starttimefld;
    @FXML
    private TextField finshtime;
    @FXML
    private TextField trailnamefld;
    @FXML
    private TextField diffcultfld;
    @FXML
    private TextField trailheadfld;
    @FXML
    private TextField lengthfld;
    @FXML
    private TextField typefld;
    @FXML
    private TableView newinfoview;

    @FXML
    private Button savebtn;
    @FXML
    private Button addbtn;
    @FXML
    private Button logbtn;
    @FXML
    private TableColumn trailnamecol;
    @FXML
    private TableColumn difficultycol;
    @FXML
    private TableColumn trailheadcol;
    @FXML
    private TableColumn lengthcol;
    @FXML
    private TableColumn typecol;

    private Traildata history;// import the data strcture
    private ObservableList<Trail> repo = FXCollections.observableArrayList();

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        trailnamecol.setCellValueFactory(new PropertyValueFactory<Trail, String>("Trail_Name"));
        difficultycol.setCellValueFactory(new PropertyValueFactory<Trail, String>("diffculity_levels"));
        trailheadcol.setCellValueFactory(new PropertyValueFactory<Trail, String>("trail_Head_Address"));
        lengthcol.setCellValueFactory(new PropertyValueFactory<Trail, String>("length_miles"));

        FilteredList<Trail> flist = new FilteredList<>(repo, p -> true);

        SortedList<Trail> slist = new SortedList<>(flist);

        slist.comparatorProperty().bind(newinfoview.comparatorProperty());

        newinfoview.setItems(slist);

        //logbtn.setOnAction((event) -> {
          //  logout(event);
        //});

        addbtn.setOnAction((event) -> {
            addtrail(event);
        });

        savebtn.setOnAction((event) -> {
            save(event);
        });

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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void save(Event event) {
        try {

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/application/view/TrailHistory.fxml"));//this pointing to next view/// and it will change other screen depending on the conditon

            Parent parent = loader.load(); // --------------seating up for next screen
            TrailHistoryController controller = loader.getController();
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
