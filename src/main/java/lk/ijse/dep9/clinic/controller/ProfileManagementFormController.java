package lk.ijse.dep9.clinic.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileManagementFormController {
    public TableView tblDetails;
    public Button btnAddProfile;
    public Button btnModifyProfile;
    public Button btnDeleteProfile;

    public void btnAddProfileOnAction(ActionEvent actionEvent) throws IOException {
        Scene scene = FXMLLoader.load(this.getClass().getResource("/view/AddProfileForm.fxml"));

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setTitle("Add New Profile");
        stage.show();


    }

    public void btnModifyProfileOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteProfileOnAction(ActionEvent actionEvent) {
    }
}
