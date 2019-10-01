package model;

/**
 * @author Arjun
 */
public class Skill implements java.io.Serializable {

protected int pilot, fighter, trader, engineer, investor;

    /*
     * @param p, holds pilot
     * @param f, holds fighter
     * @param t, holds trader
     * @param e, holds engineer
     * @param i = holds investor
     */
    public Skill(int p, int f, int t, int e, int i) {
        pilot = p;
        fighter = f;
        trader = t;
        engineer = e;
        investor = i;
    }

    /*
     * @param i, increments pilot when user presses it
     */
    public void addSkillPilot(int i) {

        pilot += i;
    }

    /*
     * @return pilot, returns the skill of pilot as integer
     */
    public int getSkillPilot() {

        return pilot;
    }

    /*
     * @param fighter, increments fighter when the user presses it
     */
    public void addSkillFighter(int i) {

        fighter += i;

    }

    /*
     * @return fighter, returns the skill of figher as integer
     */
    public int getSkillFighter() {

        return fighter;

    }

    /*
     * @param trader, increments trader when pressed by user
     */
    public void addSkillTrader(int i) {

        trader += i;
    }

    /*
     * @return trader, returns the skill of trader as integer
     */
    public int getSkillTrader() {

        return trader;
    }

    /*
     * @param i, increments engineer when pressed by user
     */
    public void addSkillEngineer(int i) {

        engineer += i;

    }

    /*
     * @return engineer, returns the skill of engineer as integer
     */
    public int getSkillEngineer() {

        return engineer;

    }

    /*
     * @param i, increments investor when pressed by user
     */
    public void addSkillInvestor(int i) {

        investor += i;

    }

    /*
     * @return investor, returns the skill of investor as integer
     */
    public int getSkillInvestor() {

        return investor;

    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("\nPilot: ").append(pilot);
        str.append("\nFighter: ").append(fighter);
        str.append("\nTrader: ").append(trader);
        str.append("\nEngineer: ").append(engineer);
        str.append("\nInvestor: ").append(investor);
        return str.toString();
    }
}
