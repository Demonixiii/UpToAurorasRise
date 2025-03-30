import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

class MonsterTest {
    Monster monster;

    @BeforeEach
    void init(){
      monster = new Monster(280);
    }

    @org.junit.jupiter.api.Test
    void getHealth() {
        assertEquals(280, monster.getHealth());
    }
}