public class PickUp implements Command{
    TheWorld w1 = new TheWorld();

    @Override
    public String execute() {
        switch (w1.getCurrentPosition().getName()){
            case "Basement":
                Miles.addItem(new Item("Clock Pendulum"));
            case "Room1":
                Miles.addItem(new Item("Crowbar", 5 ));
            case "Room3":
                if (Miles.isItemAdded("Golden Key")) {
                    Miles.addItem(new Item("Knife", 10));
                }else {
                    return "You need Goden Key to unlock this item.";
                }
            case "Room4":
                Miles.addItem(new Item("Golden Key"));
            case "Room5":
                if (Miles.isItemAdded("Clock Pendulum")) {
                    Miles.addItem(new Item("Statue Piece 1/2"));
                }else {
                    return "You need Clock Pendulum to unlock this item.";
                }
            case "Room7":
                Miles.addItem(new Item("Gun", 15));
            case "Room8":
                if (Miles.isItemAdded("Statue Piece 1/2") && Miles.isItemAdded("Statue Piece 2/2")) {
                    Miles.addItem(new Item("Chainsaw", 20));
                }else {
                    return "You need Statue Piece 1/2 and Statue Piece 2/2 to unlock this item.";
                }
            case "Room9":
                Miles.addItem(new Item("Statue Piece 2/2"));
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
