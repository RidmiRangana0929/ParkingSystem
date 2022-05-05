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
import model.VehiclesOnDelivery;
import view.tm.VehiclesInParkingTM;
import view.tm.VehiclesOnDeliveryTM;

import java.io.IOException;
import java.net.URL;

public class OnDeliveryVehicleListFormController {
    public AnchorPane onDeliveryVehicleContext;
    public TableView tblOnDeliveryContext;
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn colDriverName;
    public TableColumn colLeftTime;
    public JFXComboBox<String> cmbVehicleListType;
    public TableView tblOnDelivery;

    public void initialize(){
        cmbVehicleListType.getItems().add("In Parking");
        cmbVehicleListType.getItems().add("On Delivery");

        colVehicleNumber.setCellValueFactory(new PropertyValueFactory("vehicleNumber"));
        colVehicleType.setCellValueFactory(new PropertyValueFactory("vehicleType"));
        colDriverName.setCellValueFactory(new PropertyValueFactory("driverName"));
        colLeftTime.setCellValueFactory(new PropertyValueFactory("leftTime"));
        loadAllVehiclesOnDelivery();
    }

    public void loadAllVehiclesOnDelivery() {
        ObservableList<VehiclesOnDeliveryTM> obList4 = FXCollections.observableArrayList();

        for (VehiclesOnDelivery v: Database.vehiclesOnDeliveryTable
        ) {
            VehiclesOnDeliveryTM tm1=new VehiclesOnDeliveryTM(v.getVehicleNumber(),v.getVehicleType(),v.getDriverName(),v.getLeftTime());
            obList4.add(tm1);
        }
        tblOnDelivery.setItems(obList4);
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

    public void vehicleListTypeOnAction(ActionEvent actionEvent) throws IOException {
        if(cmbVehicleListType.getValue().equals("In Parking")){

            onDeliveryVehicleContext.getChildren().clear();
            Parent parent= FXMLLoader.load(getClass().getResource("../view/InParkingVehicleListForm.fxml"));
            onDeliveryVehicleContext.getChildren().add(parent);
        }
        else {

        }
    }
}
