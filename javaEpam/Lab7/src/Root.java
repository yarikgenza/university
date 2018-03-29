import java.util.ArrayList;
import java.util.List;

public class Root {
    public static void main(String [] argv) {

        Aligator aligator = new Aligator("Co-co", "1.5m", 50, 20, "dark");

        List crocodiles = new ArrayList();
        crocodiles.add(aligator);

        String headers = aligator.getHeaders();

        CrocodileWriter writer = new CrocodileWriter();
        writer.writeToFile(crocodiles, headers);
    }
}
