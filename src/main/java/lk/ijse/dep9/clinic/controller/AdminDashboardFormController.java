package lk.ijse.dep9.clinic.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;


import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardFormController {
    public Button btnSettings;
    public Button btnLogOut;
    public Button btnProfileManagment;
    public Button btnViewRecords;

    public void btnProfileManagmentOnAction(ActionEvent actionEvent) throws IOException {

        Scene scene = new Scene(FXMLLoader.load(this.getClass().getResource("/view/ProfileManagementForm.fxml")));

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Profile Management");
        stage.show();
    }

    public void btnViewRecordsOnAction(ActionEvent actionEvent) {
    }

    public void btnSettingsOnAction(ActionEvent actionEvent) throws IOException {

        Scene scene = new Scene(FXMLLoader.load(this.getClass().getResource("/view/SettingsForm.fxml")));

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Settings");
        stage.show();

    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"))));
        stage.setTitle("Open Source MEDICARE");
        stage.setResizable(false);
        stage.show();
        stage.centerOnScreen();
        btnLogOut.getScene().getWindow().hide();
    }
}
