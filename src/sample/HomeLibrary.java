package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeLibrary extends Application {
    GraphicsUserInterface graphicsUserInterface = new GraphicsUserInterface();


    @Override
    public void start(Stage primaryStage) throws Exception{

    }


    public static void main(String[] args) {
        launch(args);
    }
}
