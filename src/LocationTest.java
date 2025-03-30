import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LocationTest {
    Location location1;
    Location location2;


    @BeforeEach
    void init(){
        location1 = new Location("Hello", "Everybody", "My");
        location2 = new Location("Name", "Is", "Markiplier", new ArrayList<>());
    }

    @Test
    void getBackward() {
        assertEquals("Markiplier", location2.getBackward());
    }

    @Test
    void getForward() {
        assertEquals("Everybody", location1.getForward());
    }

    @Test
    void getName() {
        assertEquals("Name", location2.getName());
    }
}