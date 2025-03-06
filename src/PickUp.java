public class PickUp implements Command{
    TheWorld w1 = new TheWorld();

    @Override
    public String execute() {
        switch (w1.getCurrentPosition().getName()){
            case "Basement":
                Miles.addItem(new Item("Clock Pendulum", ItemType.PUZZLE));
            case "Room1":
                Miles.addItem(new Item("Crowbar", ItemType.SELFDEFENSE));
            case "Room3":
                Miles.addItem(new Item("Knife", ItemType.SELFDEFENSE));
            case "Room4":
                Miles.addItem(new Item("Golden Key", ItemType.PUZZLE));
            case "Room5":
                Miles.addItem(new Item("Gun", ItemType.SELFDEFENSE));
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
