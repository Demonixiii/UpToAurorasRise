public class PickUp implements Command{
    @Override
    public String execute() {
        Miles.addItem(new Item("Puzzle 1", ItemType.PUZZLE));
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
