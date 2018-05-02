package ua.lviv.iot;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    @Test
    public void testProcessText() {
        String testString = "Hi people! Iam Yarik Genza." +
                "JavaScript - what is that?" +
                "JS is a the most popular programming launguage, " +
                "it is very very cool yeahh!";
        String expectedString = "Hi, Yarik, is, cool, ";
        StringProcessor processor = new StringProcessor();
        String targetString = processor.processText(testString);
        assertEquals(expectedString, targetString);
    }

    @Test
    public void testShowResult() {
        String expected = "Result: \npassedText";
        String dataString = "passedText";
        StringProcessor processor = new StringProcessor();
        String targetString = processor.showResult(dataString);
        assertEquals(expected, targetString);
    }
}