package br.com.rafael.crudJavafxJdbc;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("main-view.fxml"));
        ScrollPane sc = fxmlLoader.load();

        sc.setFitToHeight(true);
        sc.setFitToWidth(true);

        Scene scene = new Scene(sc);
        stage.setScene(scene);
        stage.setTitle("Sample JavaFX application");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}