module com.example.crudjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.rafael.crudJavafxJdbc to javafx.fxml;
    exports br.com.rafael.crudJavafxJdbc;
}