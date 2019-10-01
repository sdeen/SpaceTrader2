package spacetrader;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;
import model.*;

public class DialogScreenController extends SSController {

    @FXML
    private TextField name;
    @FXML
    private Label pilotLabel;
    @FXML
    private Label fighterLabel;
    @FXML
    private Label traderLabel;
    @FXML
    private Label engLabel;
    @FXML
    private Label investorLabel;

    /*
     * When the user presses the accept button, the method checks if all the
     * skills are allocated and a name is entered and proceeds to the Universe
     * screen
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void acceptButton(ActionEvent event) throws IOException {
        int allSkills = Player.skills.getSkillPilot()
                + Player.skills.getSkillFighter()
                + Player.skills.getSkillTrader()
                + Player.skills.getSkillEngineer()
                + Player.skills.getSkillInvestor();
        if (name.getText().isEmpty() || allSkills < 15) {
            JOptionPane.showMessageDialog(null,
                    " Please enter a name or allocated skills");

        } else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(
                    "UniverseScreen.fxml"));
            Parent parent = loader.load();
            UniverseScreenController udc = loader.getController();
            Scene scene = getScene();
            scene.setRoot(parent);
            udc.setScene(scene);
            new Player(name.getText());
            new Universe();
            JOptionPane.showMessageDialog(null, Player.String() + "\nShip: "
                    + Player.curShip.getName());

        }
    }

    /*
     * When the user presses the cancel button, it will go back to the beginning
     * New Screen
     * @param ActionEvent event handles the button press and connects it to the
     * FXML on Action.
     */
    @FXML
    private void cancelButton(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "NewScreen.fxml"));
        Parent parent = loader.load();
        NewScreenController controller = loader.getController();
        Scene scene = getScene();
        scene.setRoot(parent);
        controller.setScene(scene);
    }

    /*
     * This method checks if the the maximum skills of 15 are allocated first,
     * if not adds the pilot skills
     * @param MouseEvent event handles the button press and adds the pilot
     * skills in accordance with the number of add button presses
     */
    @FXML
    public void addPilotSkill(MouseEvent event) {
        int allSkills = Player.skills.getSkillPilot()
                + Player.skills.getSkillFighter()
                + Player.skills.getSkillTrader()
                + Player.skills.getSkillEngineer()
                + Player.skills.getSkillInvestor();
        int start = 0;
        if (allSkills < 15) {
            start++;
            Player.skills.addSkillPilot(start);
            pilotLabel.setText(" " + Player.skills.getSkillPilot());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Maximum skills are allocated!!!");
        }
    }

    /*
     * This method checks if there is 0 or less skills and decrements the pilot
     * skills
     * @param MouseEvent event handles the button press and decrements the pilot
     * skills in accordance with the number of minus button presses
     */
    @FXML
    public void decPilotSkill(MouseEvent event) {
        if (Player.skills.getSkillPilot() <= 0) {
            JOptionPane.showMessageDialog(null, "You did not add the skill....");
        } else {
            int start = 0;
            start--;
            Player.skills.addSkillPilot(start);
            pilotLabel.setText(" " + Player.skills.getSkillPilot());
        }

    }

    /*
     * This method checks if the the maximum skills of 15 are allocated first,
     * if not adds the fighter skills
     * @param MouseEvent event handles the button press and adds the fighter
     * skills in accordance with the number of presses
     */
    @FXML
    public void addSkillFighter(MouseEvent event) {
        int allSkills = Player.skills.getSkillPilot()
                + Player.skills.getSkillFighter()
                + Player.skills.getSkillTrader()
                + Player.skills.getSkillEngineer()
                + Player.skills.getSkillInvestor();
        int start = 0;
        if (allSkills < 15) {
            start++;
            Player.skills.addSkillFighter(start);
            fighterLabel.setText(" " + Player.skills.getSkillFighter());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Maximum skills are allocated!!");
        }
    }

    /*
     * This method checks if there is 0 or less skills and decrements the
     * fighter skills
     * @param MouseEvent event handles the button press and decrements the
     * fighter skills in accordance with the number of minus button presses
     */
    @FXML
    public void decSkillFighter(MouseEvent event) {
        if (Player.skills.getSkillFighter() <= 0) {
            JOptionPane.showMessageDialog(null, "You did not add the skill!!!");
        } else {
            int start = 0;
            start--;
            Player.skills.addSkillFighter(start);
            fighterLabel.setText(" " + Player.skills.getSkillFighter());
        }

    }

    /*
     * This method checks if the the maximum skills of 15 are allocated first,
     * if not adds the trader skills
     * @param MouseEvent event handles the button press and adds the trader
     * skills in accordance with the number of presses
     */
    @FXML
    public void addSkillTrader(MouseEvent event) {
        int allSkills = Player.skills.getSkillPilot()
                + Player.skills.getSkillFighter()
                + Player.skills.getSkillTrader()
                + Player.skills.getSkillEngineer()
                + Player.skills.getSkillInvestor();
        int start = 0;
        if (allSkills < 15) {
            start++;
            Player.skills.addSkillTrader(start);
            traderLabel.setText(" " + Player.skills.getSkillTrader());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Maximum skills are allocated!");
        }
    }

    /*
     * This method checks if there is 0 or less skills and decrements the trader
     * skills
     * @param MouseEvent event handles the button press and decrements the
     * trader skills in accordance with the number of minus button presses
     */
    @FXML
    public void decSkillTrader(MouseEvent event) {
        if (Player.skills.getSkillTrader() <= 0) {
            JOptionPane.showMessageDialog(null, "You did not add the skill!");
        } else {
            int start = 0;
            start--;
            Player.skills.addSkillTrader(start);
            traderLabel.setText(" " + Player.skills.getSkillTrader());
        }

    }

    /*
     * This method checks if the the maximum skills of 15 are allocated first,
     * if not adds the engineer skills
     * @param MouseEvent event handles the button press and adds the engineer
     * skills in accordance with the number of presses
     */
    @FXML
    public void addSkillEngineer(MouseEvent event) {
        int allSkills = Player.skills.getSkillPilot()
                + Player.skills.getSkillFighter()
                + Player.skills.getSkillTrader()
                + Player.skills.getSkillEngineer()
                + Player.skills.getSkillInvestor();
        int start = 0;
        if (allSkills < 15) {
            start++;
            Player.skills.addSkillEngineer(start);
            engLabel.setText(" " + Player.skills.getSkillEngineer());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Maximum skills are allocated");
        }
    }

    /*
     * This method checks if there is 0 or less skills and decrements the
     * engineer skills
     * @param MouseEvent event handles the button press and decrements the
     * engineer skills in accordance with the number of minus button presses
     */
    @FXML
    public void decSkillEngineer(MouseEvent event) {
        if (Player.skills.getSkillEngineer() <= 0) {
            JOptionPane.showMessageDialog(null, "You did not add the skill");
        } else {
            int start = 0;
            start--;
            Player.skills.addSkillEngineer(start);
            engLabel.setText(" " + Player.skills.getSkillEngineer());
        }

    }

    /*
     * This method checks if the the maximum skills of 15 are allocated first,
     * if not adds the investor
     * @param MouseEvent event handles the button press and adds the investor
     * skills in accordance with the number of add button presses
     */
    @FXML
    public void addSkillInvestor(MouseEvent event) {
        int allSkills = Player.skills.getSkillPilot()
                + Player.skills.getSkillFighter()
                + Player.skills.getSkillTrader()
                + Player.skills.getSkillEngineer()
                + Player.skills.getSkillInvestor();
        int start = 0;
        if (allSkills < 15) {
            start++;
            Player.skills.addSkillInvestor(start);
            investorLabel.setText(" " + Player.skills.getSkillInvestor());
        } else {
            JOptionPane.showMessageDialog(null,
                    "Maximum skills are allocated..");
        }
    }

    /*
     * This method checks if there is 0 or less skills and decrements the
     * investor skills
     * @param MouseEvent event handles the button press and decrements the
     * investor skills in accordance with the number of minus button presses
     */
    @FXML
    public void decSkillInvestor(MouseEvent event) {
        if (Player.skills.getSkillInvestor() <= 0) {
            JOptionPane.showMessageDialog(null, "You did not add the skill.");
        } else {
            int start = 0;
            start--;
            Player.skills.addSkillInvestor(start);
            investorLabel.setText(" " + Player.skills.getSkillInvestor());
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resource) {
        //
    }
}
