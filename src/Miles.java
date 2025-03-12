import java.util.ArrayList;

public class Miles {
    private int health = 3;
    private static int atk = 0;
    private static ArrayList<Item> itemsOwned = new ArrayList<>();
    public static void addItem(Item i){
        itemsOwned.add(i);
    }
    public static boolean isItemAdded(String i){
        for (int j = 0; j< itemsOwned.size(); j++){
            if (itemsOwned.get(j).getName().equals(i)){
                return true;
            }
        }
        return false;
    };

    public Miles() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public static int getAtk() {
        return atk;
    }

    public void buff(){
     int buff = 0;
        for (int i = 0; i< itemsOwned.size(); i++){
         buff += itemsOwned.get(i).getAtk();
     }
        this.atk += buff;
    }

    public static void setAtk(int atk) {
        Miles.atk = atk;
    }
}
