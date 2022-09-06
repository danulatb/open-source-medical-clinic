package lk.ijse.dep9.clinic.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileManagementFormController {
    public TableView tblDetails;
    public Button btnAddProfile;
    public Button btnModifyProfile;
    public Button btnDeleteProfile;

    public void btnAddProfileOnAction(ActionEvent actionEvent) throws IOException {
        Scene scene = new Scene(FXMLLoader.load(this.getClass().getResource("/view/AddProfileForm.fxml")));

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);
        stage.setTitle("Add New Profile");


        stage.show();


    }

    public void btnModifyProfileOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/AddProfileForm.fxml"));
        //AddProfileFormController ctrl = (AddProfileFormController) (fxmlLoader.getController());

        Stage stage = new Stage();
        stage.setScene(new Scene(fxmlLoader.load()));
        AddProfileFormController controller = (AddProfileFormController) fxmlLoader.getController();
        controller.initData(false);

        stage.setTitle("Modify Profile");
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();

    }

    public void btnDeleteProfileOnAction(ActionEvent actionEvent) {
    }
}
