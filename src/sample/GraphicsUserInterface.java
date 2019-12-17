package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.io.IOException;


public class GraphicsUserInterface {
    Stage stage = new Stage();
    public Button mediaButton = new Button();
    public Button uploadMediaButton = new Button();
    public Button settings = new Button();


    public void addMediaToCollectionButton(){}

    public void chooseActionFromList() {

        mediaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("mediaLib.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.close();
                stage.setTitle("Медиа");
                stage.setScene(new Scene(root));
                stage.show();
            }
        });

        uploadMediaButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("uploadMedia.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.close();
                stage.setTitle("Загрузить медиа");
                stage.setScene(new Scene(root));
                stage.show();
            }
        });

        settings.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Parent root = null;
                try {
                    root = FXMLLoader.load(getClass().getResource("systemConfig.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                stage.close();
                stage.setTitle("Настройки системы");
                stage.setScene(new Scene(root));
                stage.show();
            }
        });


    }

    public void commentFrom() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mediaObject.fxml"));
        stage.close();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void createCollectionFrom() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("createCollection.fxml"));
        stage.close();
        stage.setTitle("Создать коллекцию");
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void deleteCollection(){}

    public void editCollectionFrom (Collection collection){}

    public void editMedia(Media media){}

    public void editProfileButton() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("userSettings.fxml"));
        stage.close();
        stage.setTitle("Настройки профиля");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void rateMedia(CollectionMedia collectionMedia){}

    public void signInForm() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("registration.fxml"));
        stage.close();
        stage.setTitle("Регистрация");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void signOut(){}

    public void submitForm(Object object){}

    public void uploadMediaForm(Media media){}

    public void validateForm() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("userProfile.fxml"));
        stage.close();
        stage.setTitle("Профиль пользователя");
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void viewCollection(Collection collection){}
    public void viewCollectionMedia(CollectionMedia collectionMedia){}
    public void viewProfileButton() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("userProfile.fxml"));
        stage.close();
        stage.setTitle("Профиль пользователя");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
