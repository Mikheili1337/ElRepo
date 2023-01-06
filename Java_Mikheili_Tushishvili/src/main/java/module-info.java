module com.example.java_mikheili_tushishvili {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java_mikheili_tushishvili to javafx.fxml;
    exports com.example.java_mikheili_tushishvili;
}