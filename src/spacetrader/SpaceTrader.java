package spacetrader;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author gilugeorge
 */
public class SpaceTrader extends Application {
    /*
     * sets the stage to the new screen
     */

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "NewScreen.fxml"));
        Parent parent = loader.load();
        NewScreenController nsc = loader.getController();
        Scene scene = new Scene(parent);
        nsc.setScene(scene);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
