public class Item {
    private String name;
    private ItemType type;
    private int atk;

    public Item(String name) {
        this.name = name;
        this.type = ItemType.PUZZLE;
    }

    public Item(String name, int atk) {
        this.name = name;
        this.type = ItemType.SELFDEFENSE;
        this.atk = atk;
    }

    public String getName() {
        return name;
    }

    public int getAtk() {
        return atk;
    }
}
