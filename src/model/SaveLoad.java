/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;

/**
 * @author Arjun
 */
public class SaveLoad {

    public static int index;

    /**
     * Link to save button. Try just saving Player and Universe. If just those
     * two don't work, then go ahead and try saving all of the files in model
     * except for this one and the misplaced SSController. Input them in order
     * separated by commas.
     *
     * @param models instance of wanted classes
     */
    public static void save(Object... models) {
        for (index = 0; index < models.length; index++) {
            Object o = models[index];
            try {
                FileOutputStream fileOut = new FileOutputStream(
                        "C:\\Users\\Arjun\\Desktop\\spacetrader" + index
                        + ".ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(o);
                out.close();
                fileOut.close();
                System.out
                        .printf("Serialized data is saved in \\files\\spacetrader"
                                + index + ".ser");
            } catch (IOException i) {
                i.printStackTrace();
            }
        }
    }

    /**
     * It will give back an object array of all the classes in the same order
     * they were entered in with the save function. When they load, set
     * Universe.ss to the Universe.ss drawn from the data and set all of Players
     * fields to the ones drawn from the data. make sure to typecast the
     * Universe and Player as it comes out.
     *
     * @return
     */
    public static Object[] load() {
        index = 12;
        Object[] objs = new Object[index];
        for (int j = 0; j < index; j++) {
            try {
                FileInputStream fileIn = new FileInputStream(
                        "C:\\Users\\Arjun\\Desktop\\spacetrader" + j + ".ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                objs[j] = in.readObject();
                in.close();
                fileIn.close();
            } catch (IOException i) {
                i.printStackTrace();
            } catch (ClassNotFoundException c) {
                System.out.println("class not found");
                c.printStackTrace();
            }
        }
        return objs;
    }
}
