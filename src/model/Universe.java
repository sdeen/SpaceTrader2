package model;
/*
 * @author Arjun
 */

public class Universe implements java.io.Serializable {

    public static SolarSystem[] ss;

    public Universe() {
        ss = new SolarSystem[5];
        ss[0] = new SolarSystem("Byakugan", "Sharingan", "Rinnegan",
                "Mangekyo", "Tsuki", "Dojutsu", 0, 500);
        ss[1] = new SolarSystem("Kurama", "Gyuki", "Shukaku", "Isobu",
                "Saiken", "Bijuu", 433, 250);
        ss[2] = new SolarSystem("Amaterasu", "Tsukuyomi", "Susanoo", "Izanami",
                "Izanagi", "Kamui", -433, 250);
        ss[3] = new SolarSystem("Sasori", "Kisame", "Nagato", "Konan",
                "Deidara", "Akatsuki", -433, -250);
        ss[4] = new SolarSystem("Shisui", "Madara", "Itachi", "Obito",
                "Sasuke", "Uchiha", 433, -250);
    }

    /*
     * @param num, holds the value of the int index in the solarsystem arrray
     * @returns ss[num], returns the corresponding array num index called by the
     * user
     */
    public static SolarSystem getSolarSystem(int num) {
        return ss[num];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("The Universe").append("\n\n");
        for (SolarSystem s : ss) {
            str.append(s.toString()).append("\n\n");
        }
        return str.toString();
    }
}
