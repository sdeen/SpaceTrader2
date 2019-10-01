package model;

import java.awt.Point;

/**
 * @author Arjun
 */
public class Player implements java.io.Serializable {

    private static String name;
    private static int money = 10000;
    public static Inventory stuff;
    public static Planet curPlanet;
    public static Ship curShip;
    public static Skill skills = new Skill(0, 0, 0, 0, 0);

    /*
     * @param name, shows the name of the player
     */
    public Player(String name) {
        Player.name = name;
        money = 10000;
        stuff = new Inventory();
        new AirGarage();
        curShip = AirGarage.getShip(0);
        curPlanet = new Planet(new Point());
    }

    /*
     * @param name, sets the name player to what is being typed
     */
    public static void setName(String name) {
        Player.name = name;
    }

    /*
     * @return name, returns a String of the players name
     */
    public static String getName() {
        return name;
    }

    /*
     * @param p, setCurPlanet to the corresponding planet.
     */
    public static void setCurPlanet(Planet p) {
        curShip.useFuel(curPlanet.getPoint(), p.getPoint());
        curPlanet = p;
    }

    /*
     * @param money, increases the money in Player
     */
    public static void addMoney(int money) {
        Player.money += money;
    }

    /*
     * @return money, returns the money
     */
    public static int getMoney() {
        return money;
    }

    /*
     * @param item, adds items to the stock
     * @param q, adds the quantity to the stock
     */
    public static void addStock(int item, int q) {
        stuff.addStock(item, q);
    }

    /*
     * @param item, holds the amount of items in the array
     * @return sttff.checkStock(item), returns the amount of item in stock
     */
    public static int checkStock(int item) {
        return stuff.checkStock(item);
    }

    /*
     * @return curPlanet.getPoint(), returns the x,y of the current Planet
     */
    public static Point getLocation() {
        return curPlanet.getPoint();
    }

    /*
     * public static void setLocation(Point point) { location = point; }
     */
    public static String String() {
        StringBuilder str = new StringBuilder();
        // str.append("Name: ").appen(getName()).append("; ");
        str.append("Name: " + Player.getName()).append("\n");
        str.append("Location: " + curPlanet.getPoint().toString()).append("\n");
        str.append("Skills: " + skills.toString());
        return str.toString();
    }
}
