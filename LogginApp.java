package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LogginApp extends Application {
    public void start (Stage stage) throws Exception{
        Parent root=(Parent) FXMLLoader.load(getClass().getResource("Login.fxml"));

        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setTitle("SCHOOL MANAGEMENT SYSTEM");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}
