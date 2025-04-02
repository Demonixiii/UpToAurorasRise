import java.util.ArrayList;

public class Miles {
    private static int health;
    private static int atk;
    private static ArrayList<Item> itemsOwned = new ArrayList<>();
    public static void addItem(Item i){
        itemsOwned.add(i);
    }

    /**
     * Checks if item for a puzzle is owned in order to be used.
     * @param i Searches item name
     * @return Returns whether item is owned or not
     */
    public static boolean isItemAdded(String i){
        for (int j = 0; j< itemsOwned.size(); j++){
            if (itemsOwned.get(j).getName().equals(i)){
                return true;
            }
        }
        return false;
    };

    public Miles() {
        this.health = 3;
        this.atk = 0;
    }

    public static int getHealth() {
        return health;
    }

    /**
     * Makes sure health can't be in negative numbers.
     * @param health
     */
    public static void setHealth(int health) {
        if(health>0){
        Miles.health = health;
        }else {
            Miles.health = 0;
        }

    }

    public static int getAtk() {
        return atk;
    }

    /**
     * Buffs the main character's ATK depending on owned items.
     */
    public static void buff(){
     int buff = 0;
        for (int i = 0; i< itemsOwned.size(); i++){
         buff += itemsOwned.get(i).getAtk();
     }
        atk = buff;
    }

    public static void setAtk(int atk) {
        Miles.atk = atk;
    }
}
