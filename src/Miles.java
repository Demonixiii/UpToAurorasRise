import java.util.ArrayList;

public class Miles {
    private int health = 3;
    private int atk = 0;
    private ArrayList<Item> itemsOwned = new ArrayList<>();

    public Miles() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
