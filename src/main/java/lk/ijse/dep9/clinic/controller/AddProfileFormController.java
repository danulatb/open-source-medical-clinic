package lk.ijse.dep9.clinic.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import lk.ijse.dep9.clinic.security.UserRole;

public class AddProfileFormController {
    public ComboBox cmbProfileType;
    public TextField txtName;
    public TextField txtUserName;
    public ComboBox cmbField;
    public ComboBox cmbGender;
    public TextField txtNIC;
    public TextField txtContact;
    public TextField txtAddress;
    public Button btnSave;
    public Label lblHeading;
    public VBox container;
    public VBox vBoxField;


    public void initialize() {
        UserRole[] roles = UserRole.values();
        for (UserRole role : roles) {
            cmbProfileType.getItems().add(role);
        }


        cmbGender.getItems().add("Male");
        cmbGender.getItems().add("Female");
        Platform.runLater(cmbProfileType::requestFocus);

        container.getChildren().remove(vBoxField);

    }


    public void initData(boolean newProfile) {
        if (!newProfile) {
            lblHeading.setText("Edit Profile");
        }
    }


    public void btnSaveOnAction(ActionEvent actionEvent) {
    }

    public void btnResetOnAction(ActionEvent actionEvent) {
    }


    public void cmbProfileTypeOnAction(ActionEvent actionEvent) {


        if (cmbProfileType.getSelectionModel().getSelectedItem().equals(UserRole.Doctor)) {
            System.out.println(cmbProfileType.getSelectionModel().getSelectedItem());

            container.getChildren().add(8, vBoxField);



        } else {
            container.getChildren().remove(vBoxField);

        }


    }
}
