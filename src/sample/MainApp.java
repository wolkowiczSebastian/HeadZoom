package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.opencv.core.Core;


public class MainApp extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        try
        {

            //System.setProperty("webdriver.chrome.driver", "chromedriver.linux");
            // load the FXML resource

            FXMLLoader loader = new FXMLLoader(getClass().getResource("Window.fxml"));
            BorderPane root = loader.load();
            // set a whitesmoke background
            root.setStyle("-fx-background-color: whitesmoke;");
            // create and style a scene
            Scene scene = new Scene(root, 800, 600);
            // create the stage with the given title and the previously created
            // scene
            primaryStage.setTitle("Face Detection and Tracking");
            primaryStage.setScene(scene);
            // show the GUI
            primaryStage.show();

            // init the controller
            Controller controller = loader.getController();
            controller.init();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }

    public static void main(String[] args)
    {
        // load the native OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        launch(args);
    }
}
