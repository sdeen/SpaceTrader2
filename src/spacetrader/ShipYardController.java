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
public class ShipYardController extends SSController {

    /*
     * When the user presses the gobackToUniverse button, the method sets the
     * parent root to Universe screen and displayes the Universe Screen
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void goBackToUniverse(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "UniverseScreen.fxml"));
        Parent parent = loader.load();
        UniverseScreenController controller = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        controller.setScene(scene);
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the wasp ship, and if there is enough credit, allows user to buy a new
     * ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void waspButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(9).getPrice()) {
            Player.curShip = AirGarage.getShip(9);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: : "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the hornet ship, and if there is enough credit, allows user to buy a new
     * ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void hornetButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(6).getPrice()) {
            Player.curShip = AirGarage.getShip(6);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the grasshopper ship, and if there is enough credit, allows user to buy a
     * new ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void grasshopperButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(7).getPrice()) {
            Player.curShip = AirGarage.getShip(7);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the termite ship, and if there is enough credit, allows user to buy a new
     * ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void termiteButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(8).getPrice()) {
            Player.curShip = AirGarage.getShip(8);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the flea ship, and if there is enough credit, allows user to buy a new
     * ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void fleaButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(1).getPrice()) {
            Player.curShip = AirGarage.getShip(1);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the gnat ship, and if there is enough credit, allows user to buy a new
     * ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void gnatButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(0).getPrice()) {
            Player.curShip = AirGarage.getShip(0);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the firefly ship, and if there is enough credit, allows user to buy a new
     * ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void fireflyButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(2).getPrice()) {
            Player.curShip = AirGarage.getShip(2);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the mosquito ship, and if there is enough credit, allows user to buy a
     * new ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void mosquitoButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(3).getPrice()) {
            Player.curShip = AirGarage.getShip(3);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the bumblebee ship, and if there is enough credit, allows user to buy a
     * new ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void bumblebeeButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(4).getPrice()) {
            Player.curShip = AirGarage.getShip(4);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    /*
     * Checks if player has enough credit to buy a new ship, gets the price of
     * the beetle ship, and if there is enough credit, allows user to buy a new
     * ship while decrementing the player's credit
     * @param ActionEvent event handles the button press and checks if the
     * player can buy the particular ship
     */
    @FXML
    private void beetleButton(ActionEvent event) throws IOException {
        if (Player.getMoney() >= AirGarage.getShip(5).getPrice()) {
            Player.curShip = AirGarage.getShip(5);
            Player.addMoney(-Player.curShip.getPrice());
            JOptionPane.showMessageDialog(null, "bought ship: "
                    + Player.curShip.getName());
        } else {
            JOptionPane.showMessageDialog(null, "not enough money");
        }
    }

    @FXML
    private void goToBuyUpgrades(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "UpgradeShip.fxml"));
        Parent parent = loader.load();
        UpgradeShipController controller = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        controller.setScene(scene);
    }

    @Override
    public void initialize(URL url, ResourceBundle resource) {
        // TODO
    }

}
