/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * @author Arjun
 */
public class Inventory implements java.io.Serializable {

    public static Item[] goods;

    /**
     * 0 water 1 furs 2 food 3 ore 4 games 5 firearms 6 medicine 7 machines 8
     * narcotics 9 robots
     */
    public Inventory() {
        goods = new Item[10];
        int[] water = {0, 0, 2, 30, 3, 4, 30, 50};
        goods[0] = new Item("Water", water);
        int[] furs = {0, 0, 0, 250, 10, 10, 230, 280};
        goods[1] = new Item("Furs", furs);
        int[] food = {1, 0, 1, 100, 5, 5, 90, 160};
        goods[2] = new Item("Food", food);
        int[] ore = {2, 2, 3, 350, 20, 10, 350, 420};
        goods[3] = new Item("Ore", ore);
        int[] games = {3, 1, 6, 250, -10, 5, 160, 270};
        goods[4] = new Item("Games", games);
        int[] firearms = {3, 1, 5, 1250, -75, 100, 600, 1100};
        goods[5] = new Item("Firearms", firearms);
        int[] medicine = {4, 1, 6, 650, -20, 10, 400, 700};
        goods[6] = new Item("Medicine", medicine);
        int[] machines = {4, 3, 5, 900, -30, 5, 600, 800};
        goods[7] = new Item("Machines", machines);
        int[] narcotics = {5, 0, 5, 3500, -125, 150, 2000, 3000};
        goods[8] = new Item("Narcotics", narcotics);
        int[] robots = {6, 4, 7, 5000, -150, 100, 3500, 5000};
        goods[9] = new Item("Robots", robots);
    }

    /*
     * @param item, corresponds to the array of items that hold the goods
     * @param q, is simply used to add the quantity of items.
     */
    public void addStock(int item, int quant) {
        if (item < 10 && item >= 0) {
            goods[item].addQuantity(quant);
        }
    }

    /*
     * @param item, show the amount of items in the cargo hold
     */
    public int checkStock(int item) {
        if (item < 10 && item >= 0) {
            return goods[item].getQuantity();
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /*
     * @return goods, returns the goods of the items which are held in the
     * corresponding array.
     */
    public Item[] getGoods() {
        return goods;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Item good : goods) {
            str.append(good.toString()).append("\n");
        }
        return str.toString();
    }

}
