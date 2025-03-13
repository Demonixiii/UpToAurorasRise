public class Investigate implements Command{
    TheWorld w1 = new TheWorld();
    private static boolean wasPerformed = false;
    @Override
    public String execute() {
        wasPerformed = true;
        switch (w1.getCurrentPosition().getName()){
            case "Basement":
                return "There is a Clock Pendulum on the floor.";
            case "Room1":
                return "There is a Crowbar on the floor.";
            case "Room3":
                if (Miles.isItemAdded("Golden Key")) {
                    return "There is a Knife in the chest.";
                } else {
                    return "There is a Golden Chest here. It might need a key.";
                }
            case "Room4":
                return "There is a Golden Key on a table.";
            case "Room5":
                if (Miles.isItemAdded("Clock Pendulum")) {
                    return "There is a Statue Piece in the clock's secret drawer..";
                } else {
                    return "There is a Clock without it's Pendulum here.";
                }
            case "Room7":
                return "There is a Gun in an open cabinet.";
            case "Room8":
                if (Miles.isItemAdded("Statue Piece 1/2") && Miles.isItemAdded("Statue Piece 2/2")) {
                    return "There is a Chainsaw in the unlocked door behind the staute.";
                } else {
                    return "There is a broken statue on the display. Maybe it's important.";
                }
            case "Room9":
                return "There is a Piece of a statue on the floor.";
        }
        return "";
    }

    public static boolean isWasPerformed() {
        return wasPerformed;
    }

    public static void setWasPerformed(boolean wasPerformed) {
        Investigate.wasPerformed = wasPerformed;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
