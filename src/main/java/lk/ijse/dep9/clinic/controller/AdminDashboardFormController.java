package lk.ijse.dep9.clinic.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardFormController {
    public void btnProfileManagmentOnAction(ActionEvent actionEvent) {
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

    public void btnLogOutOnAction(ActionEvent actionEvent) {
    }
}
