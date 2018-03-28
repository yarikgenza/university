package ua.lviv.iot;

import java.io.*;
import java.util.regex.*;

public class StringProcessor {

    public String readInputText() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Text \n");
            return br.readLine();
        } catch (IOException error) {
            System.out.println(error.getMessage());
            return null;
        }
    }

    public String processText(String inputText) {
        String resultString = "";
        Pattern lastWordPattern = Pattern.compile("[\\w]+(?=\\.|!|\\?)");
        Matcher lastWordPatternMatcher = lastWordPattern.matcher(inputText);

        while(lastWordPatternMatcher.find()) {
            String lastWord = inputText.substring(lastWordPatternMatcher.start(), lastWordPatternMatcher.end());

            Pattern wordBeforeLast = Pattern.compile("[\\w]+(?=" + " " + lastWord + ")");
            Matcher wordBeforeLastMatcher = wordBeforeLast.matcher(inputText);

            if (wordBeforeLastMatcher.find()) {
                resultString += inputText.substring(wordBeforeLastMatcher.start(), wordBeforeLastMatcher.end()) + ", ";
            }
        }
        return resultString;
    }

    public String showResult(String processedString) {
        String resultString = "Result: \n" + processedString;
        System.out.println(resultString);
        return resultString;
    }
}