package com.company;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class LogginController implements Initializable {
    LogginModule logginModule =new LogginModule();
    @FXML
    private Label dbstatus;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private ComboBox comboBox;
    @FXML
    private Button button;

    public void initialize (URL url, ResourceBundle rb){
        if (this.logginModule.isdatabaseconnected()){
            this.dbstatus.setText("CONNECTED TO DATABASE");

        }else {
            this.dbstatus.setText("NOT CONNECTED TO DATABASE");
        }
        this.comboBox.setItems(FXCollections.observableArrayList(Option.values()));
    }
}


