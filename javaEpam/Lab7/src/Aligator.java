public class Aligator extends Reptile {
    private int maxSpeed;
    private String skinTone;


    public Aligator(String name, String size, int weight, int maxSpeed, String skinTone) {
        super(name, size, weight);
        this.maxSpeed = maxSpeed;
        this.skinTone = skinTone;
    };

    public String getHeaders() {
        return super.getHeaders() + ',' + "maxSpeed";
    }

    public String toCSV() {
        return super.toCSV() + ',' + this.maxSpeed;
    }
}
