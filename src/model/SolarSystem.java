/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Point;

/**
 * @author Arjun
 */
public class SolarSystem implements java.io.Serializable {

    private String ssName;
    private Point location;
    private Planet[] planets;

    /*
     * @param n1, for one planet
     * @param n2, for second planet
     * @param n3, for third planet
     * @param ssName, for the solar system name
     * @param x, the x coordinate
     * @param y, the y coordinate
     */
    public SolarSystem(String n1, String n2, String n3, String n4, String n5,
            String ssName, int x, int y) {
        this.ssName = ssName;
        location = new Point(x, y);
        planets = new Planet[5];
        planets[0] = new Planet(n1, location);
        planets[1] = new Planet(n2, location);
        planets[2] = new Planet(n3, location);
        planets[3] = new Planet(n4, location);
        planets[4] = new Planet(n5, location);
    }

    /*
     * @return ssName, returns the name of the Solar System
     */
    public String getName() {
        return ssName;
    }

    /*
     * @return i, returns 3 planets
     * @return null, returns null if more than 4 or less 0
     */
    public Planet getPlanet(int i) {
        if (i >= 0 && i <= 5) {
            return planets[i];
        } else {
            return null;
        }
    }

    /*
     * @return x, retuns the x coordinate
     */
    public Point getLocation() {
        return location;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("Name: ").append(ssName).append("\n");
        for (Planet p : planets) {
            str.append(p.toString()).append("\n");
        }
        str.append("Coordinates: ").append(location.toString()).append("\n");
        return str.toString();
    }
}
