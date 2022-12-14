package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends javafx.application.Application {

    private static Scene mainScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/application/main-view.fxml"));
        ScrollPane sc = fxmlLoader.load();

        sc.setFitToHeight(true);
        sc.setFitToWidth(true);

        mainScene = new Scene(sc);
        stage.setScene(mainScene);
        stage.setTitle("Sample JavaFX application");
        stage.show();
    }

    public static Scene getMainScene() {
        return mainScene;
    }

    public static void main(String[] args) {
        launch();
    }
}