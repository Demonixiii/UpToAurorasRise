import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MilesTest {
    Miles miles = new Miles();

    @BeforeEach
    void init(){
        miles = new Miles();
        Miles.addItem(new Item("b"));

    }

    @Test
    void isItemAdded() {
        assertTrue(miles.isItemAdded("b"));
    }

    @Test
    void getHealth() {
        assertEquals(3, miles.getHealth());
    }

    @Test
    void getAtk() {
        assertEquals(0, miles.getAtk());
    }
}