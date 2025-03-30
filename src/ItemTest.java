import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item item1;
    Item item2;

    @BeforeEach
    void init(){
        item1 = new Item("Josh");
        item2 = new Item("Radnor", 1200);
    }

    @Test
    void getName() {
        assertEquals("Josh", item1.getName());
    }

    @Test
    void getAtk() {
        assertEquals(1200, item2.getAtk());
    }
}