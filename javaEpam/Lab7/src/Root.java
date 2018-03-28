import java.util.ArrayList;
import java.util.List;

public class Root {
    public static void main(String [] argv) {
        Crocodile aligator = new Crocodile("Co-co", "1.5m", 50);
        Crocodile notAligator = new Crocodile("H-x", "2m", 60);

        List crocodiles = new ArrayList();
        crocodiles.add(aligator);
        crocodiles.add(notAligator);

        String headers = aligator.getHeaders();

        CrocodileWriter writer = new CrocodileWriter();
        writer.writeToFile(crocodiles, headers);
    }
}
