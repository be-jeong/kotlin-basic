module com.example.kotlinbasic {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.kotlinbasic to javafx.fxml;
    exports com.example.kotlinbasic;
}