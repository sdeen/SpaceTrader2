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
import model.SSController;
import model.*;

/**
 * @author gilugeorge
 */
public class MarketController extends SSController {

    Market mk = new Market();
    @FXML
    private Label printR;

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
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of water. Calls the buySellGoods
     * method from Market class to sell water (1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell water button
     */
    @FXML
    private void sellWater(ActionEvent event) throws IOException {

        mk.BuySellGoods(0, 1);
        Player.curPlanet.toString();
        printR.setText("Inventory: \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of water.Calls the buySellGoods method
     * from Market class to buy water(-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy water button
     */
    @FXML
    private void buyWater(ActionEvent event) throws IOException {
        mk.BuySellGoods(0, -1);
        Player.curPlanet.toString();
        printR.setText("Inventory : \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell fur(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell fur button
     */
    @FXML
    private void sellFur(ActionEvent event) throws IOException {
        mk.BuySellGoods(1, 1);
        Player.curPlanet.toString();
        /*System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory: \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy fur(-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy fur button
     */
    @FXML
    private void buyFur(ActionEvent event) throws IOException {
        mk.BuySellGoods(1, -1);
        Player.curPlanet.toString();
        /*System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory: \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell food(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell food button
     */
    @FXML
    private void sellFood(ActionEvent event) throws IOException {
        mk.BuySellGoods(2, 1);
        Player.curPlanet.toString();
       /* System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory: \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy food(-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy food button
     */
    @FXML
    private void buyFood(ActionEvent event) throws IOException {
        mk.BuySellGoods(2, -1);
        Player.curPlanet.toString();
//        System.out.println(Player.curPlanet.toString());
//        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
//        System.out.println("Remaining Capacity "
//                + Player.curShip.getRemainingCapacity());
//        System.out.println("Ship Name: " + Player.curShip.getName());
//        System.out.println("Credit: " + Player.getMoney());
        printR.setText("Inventory : \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell ore(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell ore button
     */
    @FXML
    private void sellOre(ActionEvent event) throws IOException {
        mk.BuySellGoods(3, 1);
        Player.curPlanet.toString();
//        System.out.println(Player.curPlanet.toString());
//        System.out.println("Max Capacity: " + Player.curShip.getMaxCapacity());
//        System.out.println("Remaining Capacity "
//                + Player.curShip.getRemainingCapacity());
//        System.out.println("Ship Name : " + Player.curShip.getName());
        printR.setText("Inventory : \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy ore (-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy orebutton
     */
    @FXML
    private void buyOre(ActionEvent event) throws IOException {
        mk.BuySellGoods(3, -1);
        Player.curPlanet.toString();
       /* System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney()); */
        printR.setText("Inventory:: \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell games(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell games button
     */
    @FXML
    private void sellGames(ActionEvent event) throws IOException {
        mk.BuySellGoods(4, 1);
        Player.curPlanet.toString();
//        System.out.println(Player.curPlanet.toString());
//        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
//        System.out.println("Remaining Capacity "
//                + Player.curShip.getRemainingCapacity());
//        System.out.println("Ship Name: " + Player.curShip.getName());
//        System.out.println("Credit: " + Player.getMoney());
        printR.setText("Inventory : \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy games (-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy games button
     */
    @FXML
    private void buyGames(ActionEvent event) throws IOException {
        mk.BuySellGoods(4, -1);
        Player.curPlanet.toString();
//        System.out.println(Player.curPlanet.toString());
//        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
//        System.out.println("Remaining Capacity "
//                + Player.curShip.getRemainingCapacity());
//        System.out.println("Ship Name: " + Player.curShip.getName());
//        System.out.println("Credit: " + Player.getMoney());
        printR.setText("Inventory: \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell firearm(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell firearm button
     */
    @FXML
    private void sellFirearms(ActionEvent event) throws IOException {
        mk.BuySellGoods(5, 1);
        Player.curPlanet.toString();
       /* System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory  : \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy firearms(-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy firearm button
     */
    @FXML
    private void buyFirearms(ActionEvent event) throws IOException {
        mk.BuySellGoods(5, -1);
        Player.curPlanet.toString();
        /*System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name : " + Player.curShip.getName());
        System.out.println("Credit : " + Player.getMoney());*/
        printR.setText("Inventory: \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell medicine(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell medicine button
     */
    @FXML
    private void sellMedicine(ActionEvent event) throws IOException {
        mk.BuySellGoods(6, 1);
        Player.curPlanet.toString();
       /* System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name : " + Player.curShip.getName());
        System.out.println("Credit : " + Player.getMoney());*/
        printR.setText("Inventory  : \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy medicine(-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy medicine button
     */
    @FXML
    private void buyMedicine(ActionEvent event) throws IOException {
        mk.BuySellGoods(6, -1);
        Player.curPlanet.toString();
        /*System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory:- \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell machines(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell machines button
     */
    @FXML
    private void sellMachines(ActionEvent event) throws IOException {
        mk.BuySellGoods(7, 1);
        Player.curPlanet.toString();
       /* System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory : \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy machines(-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy machine button
     */
    @FXML
    private void buyMachines(ActionEvent event) throws IOException {
        mk.BuySellGoods(7, -1);
        Player.curPlanet.toString();
       /* System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory: \n" + Player.stuff.toString());
    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell narcotics(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell narcotics button
     */
    @FXML
    private void sellNarcotics(ActionEvent event) throws IOException {
        mk.BuySellGoods(8, 1);
        Player.curPlanet.toString();
        /*System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory: \n" + Player.stuff.toString());

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy narcotics(-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy narcotics button
     */
    @FXML
    private void buyNarcotics(ActionEvent event) throws IOException {
        mk.BuySellGoods(8, -1);
        Player.curPlanet.toString();
        /*System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Inventory : \n" + Player.stuff.toString());*/
    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to sell robots(1)
     * @param ActionEvent event handles the button event when the user presses
     * the sell robots button
     */
    @FXML
    private void sellRobots(ActionEvent event) throws IOException {
        mk.BuySellGoods(9, 1);
        Player.curPlanet.toString();
      /*  System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Inventory: \n" + Player.stuff.toString());*/

    }

    /*
     * The method calls the toString method of the current planet the Player is
     * in and displays the player's stock of fur.Calls the buySellGoods method
     * from Market class to buy robots(-1)
     * @param ActionEvent event handles the button event when the user presses
     * the buy robots button
     */
    @FXML
    private void buyRobots(ActionEvent event) throws IOException {
        mk.BuySellGoods(9, -1);
        Player.curPlanet.toString();
        /*System.out.println(Player.curPlanet.toString());
        System.out.println("Max Capacity " + Player.curShip.getMaxCapacity());
        System.out.println("Remaining Capacity "
                + Player.curShip.getRemainingCapacity());
        System.out.println("Ship Name: " + Player.curShip.getName());
        System.out.println("Credit: " + Player.getMoney());*/
        printR.setText("Inventory: \n" + Player.stuff.toString());

    }

    /*
     * Checks if the current Planet has a high tech level, and only allows the
     * Player to go to the ship yard if so. If the Planet is not high tech, it
     * will display an error message
     * @param ActionEvent event handles the button press and takes the Player to
     * the ShipYard
     */
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
