package controller;

import com.jfoenix.controls.JFXComboBox;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.VehiclesInParking;
import view.tm.VehiclesInParkingTM;

import java.io.IOException;
import java.net.URL;

public class InParkingVehicleListFormController{
    public AnchorPane inParkingVehicleContext;
    public TableView tblInParking;
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn colParkingSlot;
    public TableColumn colParkedTime;
    public JFXComboBox<String> cmbVehicleListType;

    public void initialize(){

        cmbVehicleListType.getItems().add("In Parking");
        cmbVehicleListType.getItems().add("On Delivery");

        colVehicleNumber.setCellValueFactory(new PropertyValueFactory("vehicleNumber"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory("vehicleType"));
        colParkingSlot.setCellValueFactory(new PropertyValueFactory("parkingSlot"));
        colParkedTime.setCellValueFactory(new PropertyValueFactory("parkedTime"));
        loadAllVehiclesInParking();
    }

    public void loadAllVehiclesInParking() {
        ObservableList<VehiclesInParkingTM> obList3 = FXCollections.observableArrayList();

        for (VehiclesInParking v: Database.vehiclesInParkingTable
        ) {
            VehiclesInParkingTM tm=new VehiclesInParkingTM(v.getVehicleNumber(),v.getVehicleType(),v.getParkingSlot(),v.getParkedTime());
            obList3.add(tm);
        }
        tblInParking.setItems(obList3);
    }

    public void addVehicleOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddVehicleForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void addDriverOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddDriverForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        inParkingVehicleContext.getChildren().clear();
        Parent parent=FXMLLoader.load(getClass().getResource("../view/MainPageForm.fxml"));
        inParkingVehicleContext.getChildren().add(parent);
    }

    public void vehicleListTypeOnAction(ActionEvent actionEvent) throws IOException {
        if(cmbVehicleListType.getValue().equals("On Delivery")){

            inParkingVehicleContext.getChildren().clear();
            Parent parent= FXMLLoader.load(getClass().getResource("../view/OnDeliveryVehicleListForm.fxml"));
            inParkingVehicleContext.getChildren().add(parent);
        }
        else {

        }
    }
}
