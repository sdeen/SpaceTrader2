/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * @author Arjun
 */
public class Item implements java.io.Serializable {

    private String name;
    private int mtlp;
    private int mtlu;
    private int ttp;
    private int basePrice;
    private int ipl;
    private int var;
    private int mtl;
    private int mth;
    private int quantity;
    private int price;

    /*
     * @param name, displays the name of the item
     * @param stats, hold an array of int that corresponds to the items
     */
    public Item(String name, int[] stats) {
        this.name = name;
        mtlp = stats[0];
        mtlu = stats[1];
        ttp = stats[2];
        basePrice = stats[3];
        ipl = stats[4];
        var = stats[5];
        mtl = stats[6];
        mth = stats[7];
        price = basePrice;
    }

    /*
     * @return name, returns the name
     */
    public String getName() {
        return name;
    }

    /*
     * @return mtlp, returns the mtlp
     */
    public int getMTLP() {
        return mtlp;
    }

    /*
     * @return mtlu, returns the mtlu
     */
    public int getMTLU() {
        return mtlu;
    }

    /*
     * @return ttp, returns the ttp
     */
    public int getTTP() {
        return ttp;
    }

    /*
     * @return basePrice, returns the basePrice
     */
    public int getBasePrice() {
        return basePrice;
    }

    /*
     * @return ipl, returns the ipl
     */
    public int getIPL() {
        return ipl;
    }

    /*
     * @return var, returns the var
     */
    public int getVAR() {
        return var;
    }

    /*
     * @return mtl, returns the mtl
     */
    public int getMTL() {
        return mtl;
    }

    /*
     * @return mth, returns the mth
     */
    public int getMTH() {
        return mth;
    }

    /*
     * @param q, increments quantity by the number of items
     */
    public void addQuantity(int quant) {
        quantity += quant;
    }

    /*
     * @return quantity, get the quantity in the market
     */
    public int getQuantity() {
        return quantity;
    }

    /*
     * @param p, set the price of the item with the parameter p
     */
    public void setPrice(int cred) {
        price = cred;
    }

    /*
     * @return price, returns the price of the item
     */
    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + ": " + quantity;
    }

    // public String toString() {
    // return "Name: " + name + " Price: " + price + " Quantity : " + quantity +
    // " MTLP" + mtlp +
    // " MTLU" + mtlu + " TTP" + ttp + " Base Price: " + basePrice + " IPL: " +
    // ipl + " VAR : " + var +
    // " MTL: " + mtl + " MTH: " + mth;
    // }
}
