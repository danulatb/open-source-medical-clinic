package lk.ijse.dep9.clinic.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lk.ijse.dep9.clinic.security.SecurityContextHolder;
import lk.ijse.dep9.clinic.security.User;
import lk.ijse.dep9.clinic.security.UserRole;

import java.io.IOException;
import java.sql.*;

public class LoginFormController {
    public TextField txtUserName;
    public TextField txtPassword;
    public Button btnLogin;

    public void btnLoginOnAction(ActionEvent actionEvent) throws ClassNotFoundException, IOException {

        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        
        if (userName.isBlank()){
            new Alert(Alert.AlertType.ERROR,"User Name can not be empty").showAndWait();
            txtUserName.requestFocus();
            return;
        }else if (password.isBlank()){
            new Alert(Alert.AlertType.ERROR,"Password can not beb empty").showAndWait();
            txtPassword.requestFocus();
            return;
        } else if (!userName.matches("^[A-Za-z0-9]+$")) {
            new Alert(Alert.AlertType.ERROR,"Invalid username").showAndWait();
            return;
        }
        Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/medical_clinic", "root", "mysql")){
            System.out.println(connection);

            String sql = "SELECT role FROM User WHERE user_name =? AND password = ?";
//            sql = String.format(sql,userName,password);
//
//            Statement stm = connection.createStatement();
//            ResultSet rst = stm.executeQuery(sql);

            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1,userName);
            stm.setString(2,password);

            ResultSet rst = stm.executeQuery();



            if (rst.next()){
                String role = rst.getString("role");
                SecurityContextHolder.setPrincipal(new User(userName, UserRole.valueOf(role)));
                Scene scene = null;

                switch (role){
                    case "Admin":
                         scene = new Scene(FXMLLoader.load(this.getClass().getResource("/view/AdminDashboardForm.fxml")));
                         break;

                    case "Doctor":
                        scene = new Scene(FXMLLoader.load(this.getClass().getResource("/view/DoctorDashboardForm.fxml")));
                        break;

                    default:
                        scene = new Scene(FXMLLoader.load(this.getClass().getResource("/view/ReceptionistDashboardForm.fxml")));
                        break;
                }

                Stage stage = new Stage();
                stage.setTitle("Open Source Medical Clinic ");
                stage.setScene(scene);
                stage.show();
                stage.centerOnScreen();


            }else {
                new Alert(Alert.AlertType.ERROR,"Invalid login credentials").show();
                txtPassword.requestFocus();
                txtUserName.selectAll();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            new Alert(Alert.AlertType.ERROR,"can not connect with database").showAndWait();
        }

    }
    
    
    public void initialize(){
        btnLogin.setDefaultButton(true);

    }
    
    
}
