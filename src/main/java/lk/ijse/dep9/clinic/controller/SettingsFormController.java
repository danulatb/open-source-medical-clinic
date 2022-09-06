package lk.ijse.dep9.clinic.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class SettingsFormController {
    public Button btnAbout;
    public AnchorPane pneDetails;
    public Button btnManagePrices;
    public Button btnDiscount;
    public Button btnManageFields;
    public Button btnChangePassword;

    public void btnManagePricesOnAction(ActionEvent actionEvent) {
    }

    public void btnManageFieldsOnAction(ActionEvent actionEvent) throws IOException {

       pneDetails.getChildren().add(FXMLLoader.load(this.getClass().getResource("/view/ManageFieldForm.fxml")));


    }

    public void btnAboutOnAction(ActionEvent actionEvent) {
        pneDetails.getChildren().clear();
    }

    public void btnDiscountOnAction(ActionEvent actionEvent) {
        pneDetails.getChildren().clear();
    }

    public void btnChangePasswordOnAction(ActionEvent actionEvent) {
        pneDetails.getChildren().clear();
    }
}
