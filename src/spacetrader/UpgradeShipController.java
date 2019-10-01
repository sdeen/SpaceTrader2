package spacetrader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javax.swing.JOptionPane;
import model.Player;
import model.SSController;

/**
 * @author sdeen
 */
public class UpgradeShipController extends SSController {

    @FXML
    private void pulseLaserButton(ActionEvent event) throws IOException {
        if (Player.curShip.getWeaponSlot() > 0 && Player.getMoney() >= 10) {
            Player.curShip.updateWS();
            Player.addMoney(-10);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more space or don't have enough money :(");
        }
    }

    @FXML
    private void beamLaserButton(ActionEvent event) throws IOException {
        if (Player.curShip.getWeaponSlot() > 0 && Player.getMoney() >= 100) {
            Player.curShip.updateWS();
            Player.addMoney(-100);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more space or don't have enough money :(");
        }
    }

    @FXML
    private void militarytLaserButton(ActionEvent event) throws IOException {
        if (Player.curShip.getWeaponSlot() > 0 && Player.getMoney() >= 1000) {
            Player.curShip.updateWS();
            Player.addMoney(-1000);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more space or don't have enough money :(");
        }
    }

    @FXML
    private void energyShieldButton(ActionEvent event) throws IOException {
        if (Player.curShip.getShieldSlots() > 0 && Player.getMoney() >= 50) {
            Player.curShip.updateSS();
            Player.addMoney(-50);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more space or don't have enough money :(");
        }
    }

    @FXML
    private void reflectiveShieldButton(ActionEvent event) throws IOException {
        if (Player.curShip.getShieldSlots() > 0 && Player.getMoney() >= 500) {
            Player.curShip.updateSS();
            Player.addMoney(-500);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more space or don't have enough money :(");
        }
    }

    @FXML
    private void escapePodButton(ActionEvent event) throws IOException {
        if (Player.curShip.hasEscape()) {
            JOptionPane.showMessageDialog(null, "You already have this");
        } else if (Player.curShip.getGadgetSlots() > 0
                && Player.getMoney() >= 300) {
            Player.curShip.buyEscape();
            Player.curShip.updateGS();
            Player.addMoney(-300);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more gadget slots or don't have enough money :(");
        }
    }

    @FXML
    private void fiveCargoBayButton(ActionEvent event) throws IOException {
        if (Player.curShip.getNumBays() < 5 && Player.getMoney() >= 10) {
            Player.curShip.addBay();
            Player.addMoney(-10);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more bay space or don't have enough money :(");
        }
    }

    @FXML
    private void targettingSystemButton(ActionEvent event) throws IOException {
        if (Player.curShip.hasTargeting()) {
            JOptionPane.showMessageDialog(null, "You already have this");
        } else if (Player.curShip.getGadgetSlots() > 0
                && Player.getMoney() >= 150) {
            Player.curShip.buyTargeting();
            Player.curShip.updateGS();
            Player.addMoney(-150);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more gadget slots or don't have enough money :(");
        }
    }

    @FXML
    private void NavigatingSystemButton(ActionEvent event) throws IOException {
        if (Player.curShip.hasNav()) {
            JOptionPane.showMessageDialog(null, "You already have this");
        } else if (Player.curShip.getGadgetSlots() > 0
                && Player.getMoney() >= 70) {
            Player.curShip.buyNav();
            Player.curShip.updateGS();
            Player.addMoney(-70);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more gadget slots or don't have enough money :(");
        }
    }

    @FXML
    private void autoRepairButton(ActionEvent event) throws IOException {
        if (Player.curShip.hasRepair()) {
            JOptionPane.showMessageDialog(null, "You already have this");
        } else if (Player.curShip.getGadgetSlots() > 0
                && Player.getMoney() >= 100) {
            Player.curShip.buyRepair();
            Player.curShip.updateGS();
            Player.addMoney(-100);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(null,
                            "Sorry you don't have any more gadget slots or don't have enough money :(");
        }
    }

    @FXML
    private void clockingDeviceButton(ActionEvent event) throws IOException {
        if (Player.curShip.hasCloaking()) {
            JOptionPane.showMessageDialog(null, "You already have this");
        } else if (Player.curPlanet.getTechLevel() == Player.curPlanet
                .getTechLevel().HI_TECH
                && Player.curShip.getGadgetSlots() > 0
                && Player.getMoney() >= 500) {
            Player.curShip.buyCloaking();
            Player.curShip.updateGS();
            Player.addMoney(-500);
            JOptionPane.showMessageDialog(null, "You have upgraded your ship!");
        } else {
            JOptionPane
                    .showMessageDialog(
                            null,
                            "Sorry you don't have any more gadget slots or don't have enough money or you are not in a Hi tech planet :( :(");
        }

    }

    @FXML
    private void goBackToShipYard(ActionEvent event) throws IOException {
        if (Player.curPlanet.getTechLevel() == Player.curPlanet.getTechLevel().HI_TECH
                || Player.curPlanet.getTechLevel() == Player.curPlanet
                .getTechLevel().EARLY_INDUSTRIAL
                || Player.curPlanet.getTechLevel() == Player.curPlanet
                .getTechLevel().INDUSTRIAL
                || Player.curPlanet.getTechLevel() == Player.curPlanet
                .getTechLevel().POST_INDUSTRIAL) {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "ShipYard.fxml"));
            Parent parent = loader.load();
            ShipYardController controller = loader.getController();
            Scene scene = getScene();
            scene.setRoot(parent);
            controller.setScene(scene);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Sorry you cannot to the ship yard :(");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resource) {
        // TODO
    }

}
