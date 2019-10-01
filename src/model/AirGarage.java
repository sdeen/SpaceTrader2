/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * @author Arjun
 */
public class AirGarage implements java.io.Serializable {

    private static Ship[] ships = new Ship[10];

    /*
     * Constructor of AirGarage which hold an 10 ships
     */
    public AirGarage() {
        ships[0] = new Ship("Gnat", 10, 750, 200, 1, 0, 1);
        ships[1] = new Ship("Flea", 15, 750, 0, 0, 0, 0);
        ships[2] = new Ship("Firefly", 20, 750, 1000, 1, 0, 0);
        ships[3] = new Ship("Mosquito", 15, 750, 2500, 2, 1, 1);
        ships[4] = new Ship("BumbleBee", 25, 750, 3000, 4, 4, 4);
        ships[5] = new Ship("Beetle", 50, 750, 4000, 0, 1, 1);
        ships[6] = new Ship("Hornet", 20, 750, 5000, 3, 2, 1);
        ships[7] = new Ship("Grasshopper", 30, 750, 6000, 2, 2, 3);
        ships[8] = new Ship("Termite", 60, 750, 7000, 1, 3, 2);
        ships[9] = new Ship("Wasp", 35, 750, 8000, 3, 2, 2);
    }

    /*
     * @param i, is an int that hold the index of the ship array
     * @return returns the index of the corresponding ship array depending on
     * the value of i called.
     */
    public static Ship getShip(int i) {
        return ships[i];
    }
}
