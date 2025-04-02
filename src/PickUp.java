public class PickUp implements Command{
    TheWorld w1;

    public PickUp(TheWorld w1) {
        this.w1 = w1;
    }

    @Override
    public String execute() {
        if (Investigate.isWasPerformed()) {
            switch (w1.getCurrentPosition().getName()) {
                case "Basement":
                    Miles.addItem(new Item("Clock Pendulum"));
                    return "Clock Pendulum added to inventory.";
                case "Room1":
                    Miles.addItem(new Item("Crowbar", 5));
                    return "Crowbar added to inventory.";
                case "Room3":
                    if (Miles.isItemAdded("Golden Key")) {
                        Miles.addItem(new Item("Knife", 10));
                        return "Knife added to inventory.";
                    } else {
                        return "You need Golden Key to unlock this item.";
                    }
                case "Room4":
                    Miles.addItem(new Item("Golden Key"));
                    return "Golden Key added to inventory.";
                case "Room5":
                    if (Miles.isItemAdded("Clock Pendulum")) {
                        Miles.addItem(new Item("Statue Piece 1/2"));
                        return "Statue Piece 1/2 added to inventory.";
                    } else {
                        return "You need Clock Pendulum to unlock this item.";
                    }
                case "Room7":
                    Miles.addItem(new Item("Gun", 15));
                    return "Gun added to inventory.";
                case "Room8":
                    if (Miles.isItemAdded("Statue Piece 1/2") && Miles.isItemAdded("Statue Piece 2/2")) {
                        Miles.addItem(new Item("Chainsaw", 20));
                        return "Chainsaw added to inventory.";
                    } else {
                        return "You need Statue Piece 1/2 and Statue Piece 2/2 to unlock this item.";
                    }
                case "Room9":
                    Miles.addItem(new Item("Statue Piece 2/2"));
                    return "Statue Piece 2/2 added to inventory.";
                default:
                    System.out.println("Nothing to pick up here");
                    break;
            }
            Investigate.setWasPerformed(false);
        }else {
            return "Investigate first.";
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
