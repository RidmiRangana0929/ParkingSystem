package controller;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class AddDriverFormController {
    public AnchorPane addDriverContext;
    public JFXTextField txtDriverName;
    public JFXTextField txtNic;
    public JFXTextField txtDrivingLicenseNo;
    public JFXTextField txtContactNo;
    public JFXTextArea txtAddress;
    public TableView tblDriver;
    public TableColumn colDriverName;
    public TableColumn colNic;
    public TableColumn colDrivingLicenseNo;
    public TableColumn colContactNo;
    public TableColumn colAddress;

    public void addDriverOnAction(ActionEvent actionEvent) {
    }
}
