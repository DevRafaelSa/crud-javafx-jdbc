module com.example.crudjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crudjavafxjdbc to javafx.fxml;
    exports com.example.crudjavafxjdbc;
}