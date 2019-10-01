/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Shape;
import javax.swing.JOptionPane;
import model.SSController;
import model.*;

/**
 * FXML Controller class
 *
 * @author gilugeorge
 */
public class SolarSystem1Controller extends SSController {

    // Market m = new Market();

    @FXML
    private Shape mangekyoPlanet;
    @FXML
    private Shape byakuganPlanet;
    @FXML
    private Shape rinneganPlanet;
    @FXML
    private Shape sharinganPlanet;
    @FXML
    private Label infoLabel;
    @FXML
    private Planet planetOne;
    @FXML
    private Planet planetTwo;
    @FXML
    private Planet planetThree;
    @FXML
    private Planet planetFour;
    @FXML
    private Planet planetFive;

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
     * Checks if the distance to the point of planet the player wants to travel
     * to is greater than the remaining fuel, if there is enough fuel, allows
     * the player to travel and also displays the current planet information
     * @param ActionEvent event handles the button press and displays a dialog
     * box that contains the Random radical event of the planet and the confirms
     * if the player wants to travel by showing how much fuel will be left
     */
    @FXML
    private void byakuganButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(0).getPlanet(0).getPoint()) > Player.curShip
                .getRemainingFuel()) {
            JOptionPane.showMessageDialog(null, "Not enough fuel :(");
        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "Market.fxml"));
            Parent parent = loader.load();
            MarketController controller = loader.getController();
            Scene scene = getScene();
            scene.setRoot(parent);
            controller.setScene(scene);
            Planet.setEvent();
            int result = JOptionPane.showConfirmDialog(null, " Radical Event: "
                    + Planet.getRadicalEvent() + "\nYou will have "
                    + Player.curShip.getRemainingFuel() + " fuel rmaining."
                    + "\n Would you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(0).getPlanet(0).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem1.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem1Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }

            Player.curPlanet = Universe.getSolarSystem(0).getPlanet(0);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());
        }

    }

    /*
     * Checks if the distance to the point of planet the player wants to travel
     * to is greater than the remaining fuel, if there is enough fuel, allows
     * the player to travel and also displays the current planet information
     * @param ActionEvent event handles the button press and displays a dialog
     * box that contains the Random radical event of the planet and the confirms
     * if the player wants to travel by showing how much fuel will be left
     */
    @FXML
    private void sharinganButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(0).getPlanet(1).getPoint()) > Player.curShip
                .getRemainingFuel()) {
            JOptionPane.showMessageDialog(null, "Not enough fuel :(");
        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "Market.fxml"));
            Parent parent = loader.load();
            MarketController controller = loader.getController();
            Scene scene = getScene();
            scene.setRoot(parent);
            controller.setScene(scene);
            Planet.setEvent();

            int result = JOptionPane.showConfirmDialog(null, " Radical Event: "
                    + Planet.getRadicalEvent() + "\nYou will have "
                    + Player.curShip.getRemainingFuel() + " fuel rmaining."
                    + "\n Would you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(0).getPlanet(1).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem1.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem1Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(0).getPlanet(1);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());

        }

    }

    /*
     * Checks if the distance to the point of planet the player wants to travel
     * to is greater than the remaining fuel, if there is enough fuel, allows
     * the player to travel and also displays the current planet information
     * @param ActionEvent event handles the button press and displays a dialog
     * box that contains the Random radical event of the planet and the confirms
     * if the player wants to travel by showing how much fuel will be left
     */
    @FXML
    private void rinneganButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(0).getPlanet(2).getPoint()) > Player.curShip
                .getRemainingFuel()) {
            JOptionPane.showMessageDialog(null, "Not enough fuel :(");
        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "Market.fxml"));
            Parent parent = loader.load();
            MarketController controller = loader.getController();
            Scene scene = getScene();
            scene.setRoot(parent);
            controller.setScene(scene);
            Planet.setEvent();

            int result = JOptionPane.showConfirmDialog(null, " Radical Event: "
                    + Planet.getRadicalEvent() + "\nYou will have "
                    + Player.curShip.getRemainingFuel() + " fuel rmaining."
                    + "\n Would you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(0).getPlanet(2).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem1.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem1Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(0).getPlanet(2);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());
            ;
        }

    }

    /*
     * Checks if the distance to the point of planet the player wants to travel
     * to is greater than the remaining fuel, if there is enough fuel, allows
     * the player to travel and also displays the current planet information
     * @param ActionEvent event handles the button press and displays a dialog
     * box that contains the Random radical event of the planet and the confirms
     * if the player wants to travel by showing how much fuel will be left
     */
    @FXML
    private void mangekyoButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(0).getPlanet(3).getPoint()) > Player.curShip
                .getRemainingFuel()) {
            JOptionPane.showMessageDialog(null, "Not enough fuel :(");
        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "Market.fxml"));
            Parent parent = loader.load();
            MarketController controller = loader.getController();
            Scene scene = getScene();
            scene.setRoot(parent);
            controller.setScene(scene);
            Planet.setEvent();

            int result = JOptionPane.showConfirmDialog(null, " Radical Event: "
                    + Planet.getRadicalEvent() + "\nYou will have "
                    + Player.curShip.getRemainingFuel() + " fuel rmaining."
                    + "\nWould you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(0).getPlanet(3).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem1.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem1Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(0).getPlanet(3);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());

        }
    }

    /*
     * Checks if the distance to the point of planet the player wants to travel
     * to is greater than the remaining fuel, if there is enough fuel, allows
     * the player to travel and also displays the current planet information
     * @param ActionEvent event handles the button press and displays a dialog
     * box that contains the Random radical event of the planet and the confirms
     * if the player wants to travel by showing how much fuel will be left
     */
    @FXML
    private void tsukiButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(0).getPlanet(4).getPoint()) > Player.curShip
                .getRemainingFuel()) {
            JOptionPane.showMessageDialog(null, "Not enough fuel :(");
        } else {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "Market.fxml"));
            Parent parent = loader.load();
            MarketController controller = loader.getController();
            Scene scene = getScene();
            scene.setRoot(parent);
            controller.setScene(scene);
            Planet.setEvent();

            int result = JOptionPane.showConfirmDialog(null, " Radical Event: "
                    + Planet.getRadicalEvent() + "\nYou will have "
                    + Player.curShip.getRemainingFuel() + " fuel rmaining."
                    + "\n Would you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(0).getPlanet(4).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem1.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem1Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(0).getPlanet(4);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());
        }
    }

    /*
     * When the player hover over each planet in Solar System 1, the current
     * planet's toString will be called and displayed
     * @param MouseEvent event handles the Mouse action
     */
    @FXML
    private void showInfo(MouseEvent event) {
        planetOne = Universe.getSolarSystem(0).getPlanet(0);
        planetTwo = Universe.getSolarSystem(0).getPlanet(1);
        planetThree = Universe.getSolarSystem(0).getPlanet(2);
        planetFour = Universe.getSolarSystem(0).getPlanet(3);
        planetFive = Universe.getSolarSystem(0).getPlanet(4);
        if (byakuganPlanet.isHover()) {
            infoLabel.setText("Planet Information: \n" + planetOne.toString());
        } else if (sharinganPlanet.isHover()) {
            infoLabel.setText("Planet Information: \n" + planetTwo.toString());
        } else if (rinneganPlanet.isHover()) {
            infoLabel
                    .setText("Planet Information: \n" + planetThree.toString());
        } else if (mangekyoPlanet.isHover()) {
            infoLabel.setText("Planet Information: \n" + planetFour.toString());
        } else {
            infoLabel.setText("Planet Information: \n" + planetFive.toString());
        }

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle resource) {
        // TODO
    }

}
