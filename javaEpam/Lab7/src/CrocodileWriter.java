import java.util.*;
import java.io.FileWriter;

public class CrocodileWriter {
    private static final String NEW_LINE_SEPARATOR = System.lineSeparator();

    public void writeToFile(List<Crocodile> crocodiles, String headers) {


        try (FileWriter fileWriter = new FileWriter("data.csv")) {
            //Write the CSV file header
            fileWriter.append(headers);
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);
            for (Crocodile item : crocodiles) {
                fileWriter.append(item.toCSV());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter :(");
            e.printStackTrace();
        }

    }
}
