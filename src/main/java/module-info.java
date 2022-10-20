module com.example.appointmentbook {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appointmentbook to javafx.fxml;
    exports com.example.appointmentbook;
}