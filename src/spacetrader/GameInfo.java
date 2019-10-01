/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacetrader;

import model.*;

/**
 * @author Arjun
 */
public class GameInfo {

    public static Universe universe;
    public static Player player;

    /*
     * Creates new instances of Universe and Player
     * @param String name is the player's name
     */
    public GameInfo(String name) {
        universe = new Universe();
        player = new Player(name);
    }
}
