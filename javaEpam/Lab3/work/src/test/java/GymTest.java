import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GemTest {

    @Test
    void getType() {
        assertEquals("Gym: " + "gym" + "/n"
                + "Name of this gym(if present): " + "none", new Gym(2, 3, Clarity.FOURTH, "gem").getType());
        assertEquals("Gem: " + "gym" + "/n"
                + "Name of this gym(if present): " + "Good Gem", new Gym(2, 3, Clarity.FOURTH, "gem",
                "Good Gem").getType());
        assertEquals("Gem: " + "gym" + "/n"
                + "Name of this gym(if present): " + "none", new Gym(2, 3, Clarity.FOURTH, "gem", null).getType());
    }
}