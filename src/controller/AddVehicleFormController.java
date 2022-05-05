package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Bus;
import model.Lorry;
import model.Van;
import model.Vehicle;
import view.tm.VehicleTM;

import java.util.ArrayList;

public class AddVehicleFormController{
    public AnchorPane addVehicleContext;
    public JFXTextField txtVehicleNo;
    public JFXTextField txtMaxWeight;
    public JFXTextField txtNoOfPassengers;
    public JFXComboBox<String> cmbVehicleType;
    public TableView<VehicleTM> tblVehicle;
    public TableColumn colVehicleNumber;
    public TableColumn colVehicleType;
    public TableColumn colMaximumWeight;
    public TableColumn colNoOfPassengers;



    public void initialize(){

        cmbVehicleType.getItems().add("Van");
        cmbVehicleType.getItems().add("Cargo Lorry");
        cmbVehicleType.getItems().add("Bus");
    }

    public void addVehicleOnAction(ActionEvent actionEvent) {
        ArrayList<Vehicle> vehicle = new ArrayList<>();
        String selectType  = cmbVehicleType.getSelectionModel().getSelectedItem();
        Vehicle v1=null;

        if(selectType.equals("Van")) {
            v1 = new Van(txtVehicleNo.getText(), cmbVehicleType.getValue(), txtMaxWeight.getText(), txtNoOfPassengers.getText());
        }
        if(selectType.equals("Bus")) {
            v1 = new Bus(txtVehicleNo.getText(), cmbVehicleType.getValue(), txtMaxWeight.getText(), txtNoOfPassengers.getText());
        }
        if(selectType.equals("CargoLorry")) {
            v1 = new Lorry(txtVehicleNo.getText(), cmbVehicleType.getValue(), txtMaxWeight.getText(), txtNoOfPassengers.getText());
        }

        vehicle.add(v1);
        Database.vehicleTable.add(v1);
    }

}
