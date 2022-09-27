module crudjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens db to javafx.fxml;
    opens application to javafx.fxml;

    exports model.entities;
    exports application;
}