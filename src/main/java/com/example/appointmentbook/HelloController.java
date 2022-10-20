package com.example.appointmentbook;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class HelloController {
    public CheckBox orientcheck;
    public ListView apt;
    public ComboBox time;
    public ChoiceBox day;
    public TextField note;

    public static HelloController hc;

    public void addAppointment(ActionEvent actionEvent) {
        apt.getItems().add(day.getValue()+" at "
                +time.getValue()+"  " + note.getText());

    }

    public void deleteAppointment(KeyEvent keyEvent) {
        if(keyEvent.getCode()== KeyCode.DELETE &&
                apt.getSelectionModel().getSelectedIndex()>=0)
            apt.getItems().remove(apt.getSelectionModel()
                    .getSelectedIndex()); }



    public void changeOrientation(ActionEvent actionEvent) {
        apt.setOrientation(orientcheck.isSelected() ?
                Orientation.HORIZONTAL :
                Orientation.VERTICAL);


    }
    public void addNote(ActionEvent actionEvent){
        apt.getItems().add(note.getText());


    }

    public void initialize() {                 //makes sure everything is safely loaded before the application runs, works mainly
                                               // in the background. Stops nullPointerException Errors
        day.getItems().addAll("Monday","Tuesday",
                "Wednesday","Thursday","Friday");
        time.getItems().addAll("09:00","10:00","11:00",
                "12:00","13:00","14:00","15:00","16:00");
        time.setEditable(true); //Can edit for custom time

        hc=this;
    }
}