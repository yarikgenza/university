public class Crocodile extends Reptile {
    private String skinTone;

    public Crocodile(String name, String size, int weight, String skinTone) {
        super(name, size, weight);
        this.skinTone = skinTone;
    };

    public String getHeaders() {
        return super.getHeaders() + ',' + "skinTone";
    }

    public String toCSV() {
        return super.toCSV() + ',' + this.skinTone;
    }
}
