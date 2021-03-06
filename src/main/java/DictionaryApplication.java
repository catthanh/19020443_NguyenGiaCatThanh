import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class DictionaryApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Dictionary Application");
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("Dictionary.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }


    public static void runApplication(String[] args) {
        Application.launch(args);
    }


    public static void main(String[] args) {
        runApplication(args);
    }
}
