package spacetrader;

import java.io.IOException;
import java.util.ResourceBundle;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;
import model.*;

/**
 * @author gilugeorge
 */
public class UniverseScreenController extends SSController {

    @FXML
    private Label playerStatus;

    /*
     * When the user presses the 'go to start screen' button, the Dialog screen
     * will be displayed
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void handleGoToStartScreen(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "DialogScreen.fxml"));
        Parent parent = loader.load();
        DialogScreenController dsc = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        dsc.setScene(scene);
    }

    /*
     * When the user presses the Dojutsu button, Solar system 1 with it's 5
     * planets will be displayed
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void goToSolarSystem1(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "SolarSystem1.fxml"));
        Parent parent = loader.load();
        SolarSystem1Controller controller = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        controller.setScene(scene);
    }

    /*
     * When the user presses the Bijuu button, Solar system 2 with it's 5
     * planets will be displayed
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void goToSolarSystem2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "SolarSystem2.fxml"));
        Parent parent = loader.load();
        SolarSystem2Controller controller = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        controller.setScene(scene);
    }

    /*
     * When the user presses the Kamui button, Solar system 3 with it's 5
     * planets will be displayed
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void goToSolarSystem3(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "SolarSystem3.fxml"));
        Parent parent = loader.load();
        SolarSystem3Controller controller = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        controller.setScene(scene);
    }

    /*
     * When the user presses the Akatsuki button, Solar system 4 with it's 5
     * planets will be displayed
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void goToSolarSystem4(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "SolarSystem4.fxml"));
        Parent parent = loader.load();
        SolarSystem4Controller controller = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        controller.setScene(scene);
    }

    /*
     * When the user presses the Uchiha button, Solar system 5 with it's 5
     * planets will be displayed
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void goToSolarSystem5(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "SolarSystem5.fxml"));
        Parent parent = loader.load();
        SolarSystem5Controller controller = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        controller.setScene(scene);
    }

    /*
     * The save game button allows the player to save the current state of the
     * game including the name, current ship, current plant, credits they have,
     * and skills
     * @param ActionEvent event handles the button press and saves the game
     */
    @FXML
    private void saveGameButton(ActionEvent event) {
        SaveLoad.save(Universe.ss, Player.curPlanet, Player.curShip,
                Player.getMoney(), Player.getName(),
                Player.skills.getSkillEngineer(),
                Player.skills.getSkillFighter(),
                Player.skills.getSkillInvestor(),
                Player.skills.getSkillPilot(), Player.skills.getSkillTrader(),
                Inventory.goods, Player.stuff);

    }

    /*
     * The method calls the Player's toString() method and in addition to that
     * displays the remaining fuel in the ship
     * @param ActionEvent event handles the button press and saves the game
     */
    @FXML
    private void playerStatusButton(ActionEvent event) {
        playerStatus.setText("Player Status: " + "\n" + Player.String() + "\n"
                + "Fuel: " + Player.curShip.getRemainingFuel()
                + "\nInventory: \n" + Player.stuff.toString() + "Money: "
                + Player.getMoney() + "\nShip: " + Player.curShip.getName());
    }

    /*
     * Allows the player to buy fuel for 100 credits if there is enough credits
     * left
     * @param ActionEvent event handles the button press and buys fuel
     */
    @FXML
    private void buyFuel(ActionEvent event) {
        if (Player.getMoney() >= 100) {
            Player.curShip.addFuel(100);
            Player.addMoney(-100);
//            System.out.println("bought 100 fuel");
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resource) {
        // TODO
    }

}
