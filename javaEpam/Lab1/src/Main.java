public class Main {
    public static void main(String [] args) {

        /* Create Orange instance using default constructor and setters */
        Orange apelsin = new Orange();

        apelsin.setSort("Moro");
        apelsin.setHue("Default");
        apelsin.setIsHybrid(false);
        apelsin.setOriginCountry("Greece");
        apelsin.setWeight(100);
        apelsin.totalWeight = 300;

        System.out.println(apelsin.toString());
        apelsin.printStaticSum();
        apelsin.printSum();


        /* Create Orange instance using constructor with 4 fields specified */

        Orange apelsin1 = new Orange("Super sort", "China", "light", false);
        apelsin1.setWeight(100);
        apelsin1.totalWeight = 300;

        System.out.println(apelsin1.toString());
        apelsin1.printStaticSum();
        apelsin1.printSum();


        /* Create Orange instance using constructor with all the fields specified */

        Orange apelsin2 = new Orange("Super-puper sort", "Spain", "dark", true, 150, 550);

        System.out.println(apelsin2.toString());
        apelsin2.printStaticSum();
        apelsin2.printSum();
    }
}
