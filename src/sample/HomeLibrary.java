package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeLibrary extends Application {


    public HomeLibrary() throws IOException {
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        GraphicsUserInterface graphicsUserInterface = new GraphicsUserInterface();
        Parent root = FXMLLoader.load(getClass().getResource("homeLibraryStartWndw.fxml"));

        primaryStage.setTitle("Home Library");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
