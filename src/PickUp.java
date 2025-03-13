public class PickUp implements Command{
    TheWorld w1 = new TheWorld();

    @Override
    public String execute() {
        if (Investigate.isWasPerformed()) {
            switch (w1.getCurrentPosition().getName()) {
                case "Basement":
                    Miles.addItem(new Item("Clock Pendulum"));
                    return "Picked up a Clock Pendulum";
                case "Room1":
                    Miles.addItem(new Item("Crowbar", 5));
                    return "Picked up a Crowbar +5 ATK";
                case "Room3":
                    if (Miles.isItemAdded("Golden Key")) {
                        Miles.addItem(new Item("Knife", 10));
                        return "Picked up a Knife +10 ATK";
                    } else {
                        return "You need Goden Key to unlock this item.";
                    }
                case "Room4":
                    Miles.addItem(new Item("Golden Key"));
                    return "Picked up a Golden Key";
                case "Room5":
                    if (Miles.isItemAdded("Clock Pendulum")) {
                        Miles.addItem(new Item("Statue Piece 1/2"));
                        return "Picked up a Statue Piece (1/2)";
                    } else {
                        return "You need Clock Pendulum to unlock this item.";
                    }
                case "Room7":
                    Miles.addItem(new Item("Gun", 15));
                    return "Picked up a Gun +15 ATK";
                case "Room8":
                    if (Miles.isItemAdded("Statue Piece 1/2") && Miles.isItemAdded("Statue Piece 2/2")) {
                        Miles.addItem(new Item("Chainsaw", 20));
                        return "Picked up a Chainsaw + 20 ATK";
                    } else {
                        return "You need Statue Piece 1/2 and Statue Piece 2/2 to unlock this item.";
                    }
                case "Room9":
                    Miles.addItem(new Item("Statue Piece 2/2"));
                    return "Picked up a Statue Piece (2/2)";
            }
            Investigate.setWasPerformed(false);
        }
        return "You must investigate the room first.";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
