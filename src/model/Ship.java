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
public class Ship implements java.io.Serializable {

    private final String name;
    private int maxCapacity;
    private int remainingCapacity;
    private int extraBays;
    private final int fuelTank;
    private int remainingFuel;
    private final int price;
    private boolean navSystem;
    private boolean repairSystem;
    private boolean targetingSystem;
    private boolean cloakingDevice;
    private boolean escapePod;
    private int weaponSlot;
    private int shieldSlots;
    private int gadgetSlots;

    /**
     * @param name , holds the name of the ship
     * @param max , holds the max capacity of the ship
     * @param fuel , holds the fuel of the ship
     * @param price , holds the price of the ship
     * @param wslot , holds the weapon slot of the ship
     * @param sslot , holds the shield slots of the ship
     * @param gslot , holds the gadget slots of the ship
     */
    public Ship(String name, int max, int fuel, int price, int wslot,
            int sslot, int gslot) {
        this.name = name;
        maxCapacity = max;
        remainingCapacity = maxCapacity;
        fuelTank = fuel;
        remainingFuel = fuelTank;
        this.price = price;
        weaponSlot = wslot;
        shieldSlots = sslot;
        gadgetSlots = gslot;

    }

    /*
     * @return name, returns the name of the ship
     */
    public String getName() {
        return name;
    }

    /*
     * @return price, returns the price of Ship
     */
    public int getPrice() {
        return price;
    }

    /*
     * @return maxCapacity, returns the maxCapacity of the tank
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /*
     * @return number of weapon slots left in the ship
     */
    public int getWeaponSlot() {
        return weaponSlot;
    }

    /*
     * @return number of shield slots left in the ship
     */
    public int getShieldSlots() {
        return shieldSlots;
    }

    /*
     * @return number of gadget slots left in the ship
     */
    public int getGadgetSlots() {
        return gadgetSlots;
    }

    /**
     * uses a weaponslot space
     */
    public void updateWS() {
        weaponSlot--;
    }

    /**
     * uses a shieldslot space
     */
    public void updateSS() {
        shieldSlots--;
    }

    /**
     * uses a gadgetslot space
     */
    public void updateGS() {
        gadgetSlots--;
    }

    /**
     * method to buy another cargo bay
     */
    public void addBay() {
        if (extraBays < 5) {
            extraBays++;
            maxCapacity += 10;
            remainingCapacity += 10;
        }
    }

    /**
     * @return number of bays remaining
     */
    public int getNumBays() {
        return extraBays;
    }

    /*
     * @return remaingCapacity, returns the remainingCapacity of the tank
     */
    public int getRemainingCapacity() {
        return remainingCapacity;
    }

    /*
     * @param quantity, sets the RemainingCapacity according to the quantity
     * left.
     */
    public void setRemainingCapacity(int quantity) {
        this.remainingCapacity += quantity;
    }

    /*
     * @return remainingFuel, returns the remainingFuel to the user
     */
    public int getRemainingFuel() {
        return remainingFuel;
    }

    /*
     * @param amount, increments the fuel amount by adding it to the tank
     */
    public void addFuel(int amount) {
        remainingFuel += amount;
    }

    /**
     * origin is location of curPlanet, dest is location of planet to travel to
     *
     * @param origin
     * @param dest
     */
    public void useFuel(Point origin, Point dest) {
        int distance = (int) origin.distance(dest);
        remainingFuel -= distance;
        if (remainingFuel < 0) {
            addFuel(distance);
        }
        System.out.println(Player.curShip.getRemainingCapacity());
    }

    /**
     * @return boolean has a navigator system
     */
    public boolean hasNav() {
        return navSystem;
    }

    /**
     * @return boolean has a navigator system
     */
    public boolean hasRepair() {
        return repairSystem;
    }

    /**
     * @return boolean has a navigator system
     */
    public boolean hasTargeting() {
        return targetingSystem;
    }

    /**
     * @return boolean has a navigator system
     */
    public boolean hasCloaking() {
        return cloakingDevice;
    }

    /**
     * @return boolean has a navigator system
     */
    public boolean hasEscape() {
        return escapePod;
    }

    /**
     * @return boolean has a navigator system
     */
    public void buyNav() {
        navSystem = true;
    }

    /**
     * @return boolean has a navigator system
     */
    public void buyRepair() {
        repairSystem = true;
    }

    /**
     * @return boolean has a navigator system
     */
    public void buyTargeting() {
        targetingSystem = true;
    }

    /**
     * @return boolean has a navigator system
     */
    public void buyCloaking() {
        cloakingDevice = true;
    }

    /**
     * @return boolean has a navigator system
     */
    public void buyEscape() {
        escapePod = true;
    }

    /**
     * @return boolean has a navigator system
     */
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name).append(" Capacity: ").append(remainingCapacity)
                .append("\n");
        str.append("Nav: ").append(navSystem).append(" Rep: ")
                .append(repairSystem);
        str.append(" Target: ").append(targetingSystem).append(" Cloak: ")
                .append(cloakingDevice);
        str.append(" EscapePod: ").append(escapePod);
        return str.toString();
    }
}
