package model;

import java.util.Random;
import java.awt.Point;

/**
 * @author Arjun
 */
public class Planet implements java.io.Serializable {

    private String name;
    private TechLevel techLevel;
    private Resources resource;
    private static RadicalEvent radEvent;
    private Point location;

    /*
     * @param PRE_AGRICULTURE for case 0
     * @param AGRICULTURE for case 1
     * @param RENAISSANCE for case 2
     * @param EARLY_INDUSTRIAL for case 3
     * @param INDUSTRIAL for case 4
     * @param POST_INDUSTRIAL for case 5
     * @param HI_TECH for case 6
     */
    public enum TechLevel {

        PRE_AGRICULTURE, AGRICULTURE, RENAISSANCE, EARLY_INDUSTRIAL, INDUSTRIAL, POST_INDUSTRIAL, HI_TECH;

        private static int val;

        /*
         * @param x, int x corresponds to the value of TechLevel a planet will
         * be
         */
        public static TechLevel convertInteger(int x) {
            val = x;
            switch (x) {
                case 1:
                    return AGRICULTURE;
                case 2:
                    return RENAISSANCE;
                case 3:
                    return EARLY_INDUSTRIAL;
                case 4:
                    return INDUSTRIAL;
                case 5:
                    return POST_INDUSTRIAL;
                case 6:
                    return HI_TECH;
            }
            return PRE_AGRICULTURE;
        }

        public int getIntValue() {
            return val;
        }
    }

    /*
     * @param NOSPECIALRESOURCES corresponds to assign resource value of 0
     * @param MINERALRICH corresponds to assign resource value of 1
     * @param MINERALPOOR corresponds to assign resource value of 2
     * @param DESERT corresponds to assign resource value of 3
     * @param LOTSOFWATER corresponds to assign resource value of 4
     * @param RICHSOIL corresponds to assign resource value of 5
     * @param POORSOIL corresponds to assign resource value of 6
     * @param RICHFAUNA corresponds to assign resource value of 7
     * @param LIFELESS corresponds to assign resource value of 8
     * @param WEIRDMUSHROOMS corresponds to assign resource value of 9
     * @param LOTSOFHERBS corresponds to assign resource value of 10
     * @param ARTISTIC corresponds to assign resource value of 11
     * @param WARLIKE corresponds to assign resource value of 12
     */
    public enum Resources {

        NOSPECIALRESOURCES, MINERALRICH, MINERALPOOR, DESERT, LOTSOFWATER, RICHSOIL, POORSOIL, RICHFAUNA, LIFELESS, WEIRDMUSHROOMS, LOTSOFHERBS, ARTISTIC, WARLIKE;
        /*
         * @param x, int x coressponds to the type of Resource the planet will
         * be.
         */

        public static Resources fromInteger(int x) {
            switch (x) {
                case 1:
                    return MINERALRICH;
                case 2:
                    return MINERALPOOR;
                case 3:
                    return DESERT;
                case 4:
                    return LOTSOFWATER;
                case 5:
                    return RICHSOIL;
                case 6:
                    return POORSOIL;
                case 7:
                    return RICHFAUNA;
                case 8:
                    return LIFELESS;
                case 9:
                    return WEIRDMUSHROOMS;
                case 10:
                    return LOTSOFHERBS;
                case 11:
                    return ARTISTIC;
                case 12:
                    return WARLIKE;
            }
            return NOSPECIALRESOURCES;
        }
    }

    public enum RadicalEvent {

        DROUGHT, COLD, CROPFAIL, WAR, BOREDOM, PLAGUE, LACKOFWORKERS, NORMAL;
        /*
         * @param x, int x coressponds to the Radical event that can be caused
         * after entering the planet.
         */

        public static RadicalEvent fromInteger(int x) {
            switch (x) {
                case 1:
                    return DROUGHT;
                case 2:
                    return COLD;
                case 3:
                    return CROPFAIL;
                case 4:
                    return WAR;
                case 5:
                    return BOREDOM;
                case 6:
                    return PLAGUE;
                case 7:
                    return LACKOFWORKERS;
            }
            return NORMAL;
        }
    }

    /*
     * @param point, sets the location to be the point of the planet accordingly
     */
    public Planet(Point point) {
        location = point;
    }

    /*
     * @param name,
     * @param point,
     */
    public Planet(String name, Point point) {
        this.name = name;
        Random rand = new Random();
        int tl = rand.nextInt(7);
        int res = rand.nextInt(13);
        techLevel = TechLevel.convertInteger(tl);
        resource = Resources.fromInteger(res);
        radEvent = RadicalEvent.NORMAL;
        int b = rand.nextInt(100);
        int x = point.x + (int) (Math.pow(-1, rand.nextInt(2)) * b);
        int a = rand.nextInt((int) Math.sqrt(10000 - (b * b)));
        int y = point.y + (int) (Math.pow(-1, rand.nextInt(2)) * a);
        location = new Point(x, y);
    }

    public static void setEvent() {
        Random rand = new Random();
        int i = rand.nextInt(20);
        radEvent = RadicalEvent.fromInteger(i);
    }

    /*
     * @return name, returns the name of the planet
     */
    public String getName() {
        return name;
    }

    /*
     * @return techLevel, returns the techLevel of the planet
     */
    public TechLevel getTechLevel() {
        return techLevel;
    }

    /*
     * @return resource, returns the resource of the planet
     */
    public Resources getResource() {
        return resource;
    }

    /*
     * @return radEvent, returns the resource of the planet
     */
    public static RadicalEvent getRadicalEvent() {
        return radEvent;
    }

    /*
     * @return location, returns the location of the planet
     */
    public Point getPoint() {
        return location;
    }

    /*
     * @param point, sets the x,y of the planet to the location
     */
    public void setPoint(Point point) {
        location = point;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name: ").append(name).append("\n");
        str.append("Tech Level: ").append(techLevel.toString()).append("\n");
        str.append("Resource: ").append(resource.toString()).append("\n");
        str.append("Location: ").append(location.toString()).append("\n");
        return str.toString();
    }
}
