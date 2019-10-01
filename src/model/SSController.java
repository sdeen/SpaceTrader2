package model;

import javafx.fxml.Initializable;
import javafx.scene.Scene;

/**
 * @author gilugeorge
 */
public abstract class SSController implements Initializable {
    /*
     * @return scene, returns the main scene where the controllers can
     * correspond with fxml
     */

    private Scene scene;

    public Scene getScene() {
        return scene;
    }

    /*
     * @param scene, setsScene according to the coders fxml files
     */
    public void setScene(Scene scene) {
        this.scene = scene;
    }
}
