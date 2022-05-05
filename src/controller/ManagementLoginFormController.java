package controller;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ManagementLoginFormController {
    public AnchorPane managementLoginContext;
    public JFXTextField txtUsername;
    public JFXPasswordField pwdPassword;

    public void cancelOnAction(ActionEvent actionEvent) throws IOException {
        setUi("MainPageForm");
    }

    public void loginOnAction(ActionEvent actionEvent) throws IOException {

        String tempUsername = txtUsername.getText();
        String tempPassword = pwdPassword.getText();
        if(tempUsername.equals("abc")&&tempPassword.equals("123")){
            setUi("InParkingVehicleListForm");
        }
        else {
            new Alert(Alert.AlertType.WARNING,"Login fail...! Check your username and password.").show();
            txtUsername.clear();
            pwdPassword.clear();
        }
    }

    private void setUi (String location) throws IOException {
        Stage stage = (Stage) managementLoginContext.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/"+location+".fxml"))));
    }
}
