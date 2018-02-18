public class Orange {

    private String sort;
    private String originCountry;
    private String hue;
    private Boolean isHybrid;
    private int weight;

    static int totalWeight;

    /* Constructors: default, 4 fields, all fields. */

    Orange() {};

    public Orange(String sort, String originCountry, String hue, Boolean isHybrid) {
        this.sort = sort;
        this.originCountry = originCountry;
        this.hue = hue;
        this.isHybrid = isHybrid;
    }

    public Orange(String sort, String originCountry, String hue, Boolean isHybrid, int weight, int totalWeight) {
        this.sort = sort;
        this.originCountry = originCountry;
        this.hue = hue;
        this.isHybrid = isHybrid;
        this.weight = weight;
        this.totalWeight = totalWeight;  // it also accessible from the class instance
    }


    /* Access methods (setters only, no need for getters now) */

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public void setHue(String hue) {
        this.hue = hue;
    }

    public void setIsHybrid(Boolean isHybrid) {
        this.isHybrid = isHybrid;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    /* Custom methods */

    public String toString() {
        String objectInfo = "Instance of Orange, fields: \n"
                + "sort: " + sort + "\n"
                + "originCountry: " + originCountry + "\n"
                + "hue: " + hue + "\n"
                + "isHybrid: " + isHybrid + "\n"
                + "weight: " + weight + "\n"
                + "totalWeight: " + totalWeight + "\n";
        return objectInfo;
    }

    public static void printStaticSum() {
        System.out.println("totalWeight: " + totalWeight + "\n");
    }

    public void printSum() {
        System.out.println("totalWeight: " + totalWeight + "\n");
    }

    public void resetValues(String sort, String originCountry, String hue, Boolean isHybrid, int weight, int totalWeight) {
        this.sort = sort;
        this.originCountry = originCountry;
        this.hue = hue;
        this.isHybrid = isHybrid;
        this.weight = weight;
        this.totalWeight = totalWeight;  // it also accessible from the class instance
    }
}
