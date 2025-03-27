public class Investigate implements Command{
    TheWorld w1;
    private static boolean wasPerformed = false;

    public Investigate(TheWorld w1) {
        this.w1 = w1;
    }

    @Override
    public String execute() {
        wasPerformed = true;
        switch (w1.getCurrentPosition().getName()){
            case "Basement":
                if (Miles.isItemAdded("Clock Pendulum")){
                    return "Already got everything.";
                }else {
                    return "There is a Clock Pendulum on the floor.";
                }
            case "Room1":
                if (Miles.isItemAdded("Crowbar")){
                    return "Already got everything.";
                }else {
                    return "There is a Crowbar on the floor.";
                }
            case "Room3":
                if (Miles.isItemAdded("Knife")){
                    return "Already got everything.";
                }else {
                    if (Miles.isItemAdded("Golden Key")) {
                        return "There is a Knife in the chest.";
                    } else {
                        return "There is a Golden Chest here. It might need a key.";
                    }
                }
            case "Room4":
                if (Miles.isItemAdded("Golden Key")){
                    return "Already got everything.";
                }else {
                    return "There is a Golden Key on a table.";
                }
            case "Room5":
                if (Miles.isItemAdded("Satue Piece 1/2")){
                    return "Already got everything.";
                }else {
                    if (Miles.isItemAdded("Clock Pendulum")) {
                        return "There is a Statue Piece in the clock's secret drawer..";
                    } else {
                        return "There is a Clock without it's Pendulum here.";
                    }
                }
            case "Room7":
                if (Miles.isItemAdded("Gun")){
                    return "Already got everything.";
                }else {
                    return "There is a Gun in an opened cabinet.";
                }
            case "Room8":
                if (Miles.isItemAdded("Chainsaw")){
                    return "Already got everything.";
                }else {
                    if (Miles.isItemAdded("Statue Piece 1/2") && Miles.isItemAdded("Statue Piece 2/2")) {
                        return "There is a Chainsaw in the unlocked door behind the staute.";
                    } else {
                        return "There is a broken statue on the display. Maybe it's important.";
                    }
                }
            case "Room9":
                if (Miles.isItemAdded("Statue Piece 2/2")){
                    return "Already got everything.";
                }else {
                    return "There is a Piece of a statue on the floor.";
                }
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
