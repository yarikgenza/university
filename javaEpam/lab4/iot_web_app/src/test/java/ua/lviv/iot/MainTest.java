package ua.lviv.iot;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testSimpleMethod() {
        Main main = new Main();
        String expected = "java is ugly";
        String targetString = main.simpleMethod("java is ugly");
        assertEquals(expected, targetString);
    }
}