/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 * @author Arjun
 */
public class Market implements java.io.Serializable {
    // Inventory inv[] = new Inventory[10];

    private static final Inventory INVENTORY = new Inventory();

    /**
     * For each button asking to either buy or sell a particular good, in the
     * method connected to that button, call this function and input both the
     * corresponding number for the item which can be found in the inventory
     * class, and put how much you want to buy/sell. negative number to buy
     *
     * @param item inventory number
     * @param quantity
     * @return
     */
    public String BuySellGoods(int item, int quantity) {
        int price = calcPrice(item);
        Player.addStock(item, -quantity);
        Player.addMoney(quantity * price);
        if ((Player.getMoney() < 0 || Player.checkStock(item) < 0)
                || Player.curShip.getRemainingCapacity() > Player.curShip
                .getMaxCapacity()
                || (Player.curShip.getRemainingCapacity() <= 0 && quantity <= 0)) {
            Player.addStock(item, quantity);
            Player.addMoney(-quantity * price);
        } else {
            Player.curShip.setRemainingCapacity(quantity);
        }
        // return inv[0].toString();
        System.out.print(INVENTORY.getGoods()[item].getName() + "Price "
                + price + " Quantity : " + Player.checkStock(item)
                + " BasePrice: " + INVENTORY.getGoods()[item].getBasePrice()
                + "\n");
        return Player.curPlanet.toString();
    }

    /*
     * @param item, item is taken in as a goods array and then used to randomly
     * calcuate the price of the item using base price and var.
     */
    private int calcPrice(int item) {
        Item[] goods = INVENTORY.getGoods();
        Item good = goods[item];
        Random rand = new Random();
        int var = (good.getBasePrice() / 10) * rand.nextInt(good.getVAR());
        int price = good.getBasePrice()
                + (good.getIPL() * (Player.curPlanet.getTechLevel()
                .getIntValue() - good.getMTLP())) + var;
        Planet.Resources resource = Player.curPlanet.getResource();
        if (resource == Planet.Resources.ARTISTIC) {
            if (item == 4) {
                price = price / 2;
            }
        } else if (resource == Planet.Resources.DESERT) {
            if (item == 0) {
                price = price * 2;
            }
        } else if (resource == Planet.Resources.LIFELESS) {
            if (item == 1) {
                price = price * 2;
            }
        } else if (resource == Planet.Resources.LOTSOFHERBS) {
            if (item == 6) {
                price = price / 2;
            }
        } else if (resource == Planet.Resources.LOTSOFWATER) {
            if (item == 0) {
                price = price / 2;
            }
        } else if (resource == Planet.Resources.MINERALPOOR) {
            if (item == 3) {
                price = price * 2;
            }
        } else if (resource == Planet.Resources.MINERALRICH) {
            if (item == 3) {
                price = price / 2;
            }
        } else if (resource == Planet.Resources.POORSOIL) {
            if (item == 2) {
                price = price * 2;
            }
        } else if (resource == Planet.Resources.RICHFAUNA) {
            if (item == 2) {
                price = price * 3 / 2;
            }
        } else if (resource == Planet.Resources.RICHSOIL) {
            if (item == 2) {
                price = price / 2;
            }
        } else if (resource == Planet.Resources.WARLIKE) {
            if (item == 5) {
                price = price / 2;
            }
        } else if (resource == Planet.Resources.WEIRDMUSHROOMS) {
            if (item == 8) {
                price = price / 2;
            }
        }
        Planet.RadicalEvent rad = Planet.getRadicalEvent();
        if (rad == Planet.RadicalEvent.BOREDOM) {
            if (item == 4) {
                price = price * 4;
            }
        } else if (rad == Planet.RadicalEvent.COLD) {
            if (item == 1) {
                price = price * 4;
            }
        } else if (rad == Planet.RadicalEvent.CROPFAIL) {
            if (item == 2) {
                price = price * 4;
            }
        } else if (rad == Planet.RadicalEvent.DROUGHT) {
            if (item == 0) {
                price = price * 4;
            }
        } else if (rad == Planet.RadicalEvent.LACKOFWORKERS) {
            price = price * 2;
        } else if (rad == Planet.RadicalEvent.PLAGUE) {
            if (item == 6) {
                price = price * 4;
            }
        } else if (rad == Planet.RadicalEvent.WAR) {
            if (item == 5) {
                price = price * 4;
            }
        }
        good.setPrice(price);
        return price;
    }

    /*
     * @param item, hold the value of the randomly calcuated item
     * @return item, returns the value of the inventory and the updated item
     * price
     */
    public int getPrice(int item) {
        return INVENTORY.getGoods()[item].getPrice();
    }

}
