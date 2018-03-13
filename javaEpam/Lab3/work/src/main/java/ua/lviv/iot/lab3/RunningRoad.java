package ua.lviv.iot.lab3;

public class RunningRoad {
    private String name;
    private Speed speed;

    public enum Speed {
        FAST, SLOW
    }

    public RunningRoad(String name, Speed speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }
}

