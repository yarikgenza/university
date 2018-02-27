public class Main {
    public static void main(String [] args) {
        StringProcessor processor = new StringProcessor();

        String textToProcess = processor.readInputText();
        String processedString = processor.processText(textToProcess);
        processor.showResult(processedString);
    }
}
