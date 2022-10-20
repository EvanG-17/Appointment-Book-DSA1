package com.example.appointmentbook;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("appointmentMenu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Appointment App");
        stage.setScene(scene);
        stage.show();
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
       // Scene s=new Scene(root,400,300);
       // s.getStylesheets().add(getClass().getResource("whatever.css").toExternalForm());
    }

    public static void main(String[] args) {
        launch();
    }
}