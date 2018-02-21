/*
 *
 * Lab3, created by Yarik Genza.
 *
 * Don't try to steal this code. Just remember: big Zenoviy and me are watching you!
 *
 * */

package gym;

public class Gym {

    public static void main(String [] args) {
        Program bePowerful = new Program(Program.Type.POWER, "bePowerful");
        Program loseYourWeight = new Program(Program.Type.SLIMMING, "loseYourWeight");
        Program standart = new Program(Program.Type.COMPLEX, "standart");

        bePowerful.printDetails();
        loseYourWeight.printDetails();
        standart.printDetails();
    }
};