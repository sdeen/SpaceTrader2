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
public class SolarSystem2Controller extends SSController {

    @FXML
    private Shape kuramaPlanet;
    @FXML
    private Shape gyukiPlanet;
    @FXML
    private Shape shukakuPlanet;
    @FXML
    private Shape isobuPlanet;
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

    @FXML
    /*
     * When the user presses the gobackToUniverse button, the method sets the
     * parent root to Universe screen and displayes the Universe Screen
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
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
    private void namekButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(1).getPlanet(0).getPoint()) > Player.curShip
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
                    + Player.curShip.getRemainingFuel() + " fuel remaining."
                    + "\nWould you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(1).getPlanet(0).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem2.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem2Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(1).getPlanet(0);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());
//            System.out.println("Current Fuel: "
//                    + Player.curShip.getRemainingFuel());
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
    private void vegetaButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(1).getPlanet(1).getPoint()) > Player.curShip
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
            Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                    .getSolarSystem(1).getPlanet(1).getPoint());
            int result = JOptionPane.showConfirmDialog(null, " Radical Event: "
                    + Planet.getRadicalEvent() + "\nYou will have "
                    + Player.curShip.getRemainingFuel() + " fuel remaining."
                    + "\nWould you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(1).getPlanet(1).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem2.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem2Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(1).getPlanet(1);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());
//            System.out.println("Current Fuel: "
//                    + Player.curShip.getRemainingFuel());
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
    private void kaiButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(1).getPlanet(2).getPoint()) > Player.curShip
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
                    + Player.curShip.getRemainingFuel() + " fuel remaining."
                    + "\nWould you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(1).getPlanet(2).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem2.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem2Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(1).getPlanet(2);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());
//            System.out.println("Current Fuel: "
//                    + Player.curShip.getRemainingFuel());
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
    private void shenronButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(1).getPlanet(3).getPoint()) > Player.curShip
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
                    + Player.curShip.getRemainingFuel() + " fuel remaining."
                    + "\nWould you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(1).getPlanet(3).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem2.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem2Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(1).getPlanet(3);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());
//            System.out.println("Current Fuel: "
//                    + Player.curShip.getRemainingFuel());
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
    private void gokuButton(ActionEvent event) throws IOException {
        if (Player.curPlanet.getPoint().distance(
                Universe.getSolarSystem(1).getPlanet(4).getPoint()) > Player.curShip
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
                    + Player.curShip.getRemainingFuel() + " fuel remaining."
                    + "\nWould you like to proceed?", null,
                    JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                Player.curShip.useFuel(Player.curPlanet.getPoint(), Universe
                        .getSolarSystem(1).getPlanet(4).getPoint());
            }
            if (result == JOptionPane.NO_OPTION) {
                FXMLLoader loader1 = new FXMLLoader(getClass().getResource(
                        "SolarSystem2.fxml"));
                Parent parent1 = loader1.load();
                SolarSystem2Controller controller1 = loader1.getController();
                Scene scene1 = getScene();
                scene1.setRoot(parent1);
                controller1.setScene(scene1);
            }
            Player.curPlanet = Universe.getSolarSystem(1).getPlanet(4);
            Player.curShip.useFuel(Player.getLocation(),
                    Player.curPlanet.getPoint());
//            System.out.println("Current Fuel: "
//                    + Player.curShip.getRemainingFuel());
        }
    }

    /*
     * When the player hover over each planet in Solar System 2, the current
     * planet's toString will be called and displayed
     * @param MouseEvent event handles the Mouse action
     */
    @FXML
    private void showInfo(MouseEvent event) {
        {
            planetOne = Universe.getSolarSystem(1).getPlanet(0);
            planetTwo = Universe.getSolarSystem(1).getPlanet(1);
            planetThree = Universe.getSolarSystem(1).getPlanet(2);
            planetFour = Universe.getSolarSystem(1).getPlanet(3);
            planetFive = Universe.getSolarSystem(1).getPlanet(4);
            if (kuramaPlanet.isHover()) {
                infoLabel.setText("Planet Information: \n"
                        + planetOne.toString());
            } else if (gyukiPlanet.isHover()) {
                infoLabel.setText("Planet Information: \n"
                        + planetTwo.toString());
            } else if (shukakuPlanet.isHover()) {
                infoLabel.setText("Planet Information: \n"
                        + planetThree.toString());
            } else if (isobuPlanet.isHover()) {
                infoLabel.setText("Planet Information: \n"
                        + planetFour.toString());
            } else {
                infoLabel.setText("Planet Information: \n"
                        + planetFive.toString());
            }

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
