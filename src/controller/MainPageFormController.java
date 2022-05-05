package controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import db.Database;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import model.Driver;
import model.Vehicle;
import model.VehiclesInParking;
import view.tm.VehicleTM;

import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
//import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

public class MainPageFormController extends InParkingVehicleListFormController implements Initializable {
    public AnchorPane MainPageContext;
    public JFXComboBox<String> cmbSelectVehicle;
    public JFXComboBox<String> cmbDriver;
    public JFXTextField txtVehicleType;
    public TextField txtParkingSlotNumber;
    public AnchorPane mainPageContext;
    public Label lblTime;
    public Label lblDate;
    public JFXTextField txtSlotNo;



/*
    public void displayTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm aa");
        Date date = new Date();
        lblTime.setText(formatter.format(date));
    }
    public void displayDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        lblDate.setText(formatter.format(date));
    }
*/
    public String[] busSlot=new String[1];
    public String[] vanSlot=new String[6];
    public String[] lorrySlot=new String[7];

    public String[] addAllBusToSlotArray(){
        String[] bus=new String[busSlot.length];
        for (int x=0; x< bus.length-1; x++){

            bus[x]=busSlot[x];

        }
        return bus;
    }

    public String[] addAllVanToSlotArray(){
        String[] van=new String[vanSlot.length];
        for (int y=0; y< van.length-1; y++){

            van[y]=vanSlot[y];

        }
        return van;
    }

    public String[] addAllLorryToSlotArray(){
        String[] lorry=new String[lorrySlot.length];
        for (int z=0; z< lorry.length-1; z++){

            lorry[z]=lorrySlot[z];

        }
        return lorry;
    }


    public void parkVehicleOnAction(ActionEvent actionEvent) {


        if (busSlot[0]==null && txtVehicleType.getText().equals("Bus")){
            busSlot=addAllBusToSlotArray();
            busSlot[0]=cmbSelectVehicle.getValue();
            txtSlotNo.setText(String.valueOf(14));

        }

        for (int i=0; i<6; i++){

            if (vanSlot[i]==null && txtVehicleType.getText().equals("Van")){
                if (i==4 || i==5){

                    vanSlot=addAllVanToSlotArray();
                    vanSlot[i]=cmbSelectVehicle.getValue();
                    txtSlotNo.setText(String.valueOf(i+8));
                    break;

                }else {

                    vanSlot=addAllVanToSlotArray();
                    vanSlot[i]=cmbSelectVehicle.getValue();
                    txtSlotNo.setText(String.valueOf(i+1));
                    break;

                }
            }

        }


        for (int j=0; j<7; j++){

            if (lorrySlot[j]==null && txtVehicleType.getText().equals("Cargo Lorry")){
                lorrySlot=addAllLorryToSlotArray();
                lorrySlot[j]=cmbSelectVehicle.getValue();
                txtSlotNo.setText(String.valueOf(j+5));
                break;

            }

        }

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy   HH:mm");
        Date date = new Date();

        if (!cmbSelectVehicle.getSelectionModel().isEmpty() && !txtVehicleType.getText().equals("")) {
            Database.vehiclesInParkingTable.add(new VehiclesInParking(cmbSelectVehicle.getSelectionModel().getSelectedItem(), txtVehicleType.getText(), txtSlotNo.getText(), formatter.format(date)));
        }

    }

    public void onDeliveryShiftOnAction(ActionEvent actionEvent) {

        if (cmbSelectVehicle.getValue().equals(busSlot[0])){

            busSlot=addAllBusToSlotArray();
            busSlot[0]=null;
            txtSlotNo.clear();

        }

        for (int i=0; i<6; i++){

            if (cmbSelectVehicle.getValue().equals(vanSlot[i])){

                vanSlot=addAllVanToSlotArray();
                vanSlot[i]=null;
                txtSlotNo.clear();

            }

        }
        for (int i=0; i<6; i++){

            if (cmbSelectVehicle.getValue().equals(lorrySlot[i])){

                lorrySlot=addAllLorryToSlotArray();
                lorrySlot[i]=null;
                txtSlotNo.clear();

            }

        }

    }

    public void managementLoginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ManagementLoginForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        Stage stage=new Stage();
        stage.setScene(scene);
        stage.show();
    }



    private void setDateTime() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
                    lblTime.setText(LocalDateTime.now().format(formatter));

                    SimpleDateFormat formatter2 = new SimpleDateFormat("dd/MM/yyyy");
                    Date date = new Date();
                    lblDate.setText(formatter2.format(date));
                }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<String> obList1=FXCollections.observableArrayList();
        for (Vehicle v:Database.vehicleTable)
        {
            if(v!=null){
                obList1.add(v.getVehicleNo());
            }
        }
        cmbSelectVehicle.setItems(obList1);

        ObservableList<String> obList2=FXCollections.observableArrayList();
        for (Driver d:Database.driverTable)
        {
            if(d!=null){
                obList2.add(d.getDriverName());
            }
        }
        cmbDriver.setItems(obList2);

        setDateTime();

    }


    public void selectVehicleOnAction(ActionEvent actionEvent) {
        if(cmbSelectVehicle.getValue().equals("NA-3434")){

            txtVehicleType.setText("Bus");

        }
        else if (cmbSelectVehicle.getValue().equals("KA-4563")||cmbSelectVehicle.getValue().equals("58-3567")||cmbSelectVehicle.getValue().equals("GF-4358")||cmbSelectVehicle.getValue().equals("CCB-3568")||cmbSelectVehicle.getValue().equals("LM-6679")||cmbSelectVehicle.getValue().equals("QA-3668")){

            txtVehicleType.setText("Van");

        }
        else if (cmbSelectVehicle.getValue().equals("KB-3668")||cmbSelectVehicle.getValue().equals("JJ-9878")||cmbSelectVehicle.getValue().equals("GH-5772")||cmbSelectVehicle.getValue().equals("XY-4456")||cmbSelectVehicle.getValue().equals("YQ-3536")||cmbSelectVehicle.getValue().equals("CBB-3566")||cmbSelectVehicle.getValue().equals("QH-3444")){

            txtVehicleType.setText("Cargo Lorry");

        }
    }

    public void driverOnAction(ActionEvent actionEvent) {
    }
}
