

package ua.lviv.iot.lab3;

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