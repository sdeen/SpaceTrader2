package spacetrader;

import java.io.IOException;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import model.*;
import javax.swing.JOptionPane;

/**
 * @author Sultana Deen
 */
public class NewScreenController extends SSController {

    @FXML
    /*
     * When the User clicks the start button, Configuration screen will the
     * displayed
     * @param ActionEvent event handles the button press and connects it to the
     * onAction in Java FXML
     */
    private void handleStartButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "DialogScreen.fxml"));
        Parent parent = loader.load();
        DialogScreenController dsc = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        dsc.setScene(scene);
    }

    /*
     * @param ActionEvent event handles the button press and loads the game to
     * the previous saved state. It saves all the data of the Player and where
     * in the Universe he/she currently resides.
     */
    @FXML
    private void handleContinueButton(ActionEvent event) throws IOException {
        Object[] objs = SaveLoad.load();
        Universe.ss = (SolarSystem[]) objs[0];
        Player.curPlanet = (Planet) objs[1];
        Player.curShip = (Ship) objs[2];
        Player.addMoney((int) objs[3] - 10000);
        Player.setName((String) objs[4]);
        Player.skills.addSkillEngineer((int) objs[5]);
        Player.skills.addSkillFighter((int) objs[6]);
        Player.skills.addSkillInvestor((int) objs[7]);
        Player.skills.addSkillPilot((int) objs[8]);
        Player.skills.addSkillTrader((int) objs[9]);
        Inventory.goods = (Item[]) objs[10];
        Player.stuff = (Inventory) objs[11];
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "UniverseScreen.fxml"));
        Parent parent = loader.load();
        UniverseScreenController udc = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        udc.setScene(scene);
        JOptionPane.showMessageDialog(null, Player.String());
    }

    @Override
    public void initialize(URL url, ResourceBundle resource) {
        // TODO
    }
}
