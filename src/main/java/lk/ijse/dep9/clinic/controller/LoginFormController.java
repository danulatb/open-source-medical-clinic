package lk.ijse.dep9.clinic.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;
    public Button btnLogin;

    public void btnLoginOnAction(ActionEvent actionEvent) {

        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        
        if (userName.isBlank()){
            new Alert(Alert.AlertType.ERROR,"User Name can not be empty").showAndWait();
            txtUserName.requestFocus();
        }else if (password.isBlank()){
            new Alert(Alert.AlertType.ERROR,"Password can not beb empty").showAndWait();
            txtPassword.requestFocus();
        } else if (!userName.matches("^[A-Za-z0-9]+$")) {
            new Alert(Alert.AlertType.ERROR,"Invalid username").showAndWait();

        }

    }
    
    
    public void initialize(){
        btnLogin.setDefaultButton(true);

    }
    
    
}
