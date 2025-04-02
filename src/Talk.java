public class Talk implements Command {
    private TheWorld w1;
    private boolean exitance = false;

    public Talk(TheWorld w1) {
        this.w1 = w1;
    }

    /**
     * Wins the game.
     * @return Ending
     */
    @Override
    public String execute() {
        setExitance(true);
        if (w1.getCurrentPosition().getName().equals("PoliceCar")) {
            return "Hey kid, watcha doin here?" + "\n" + "*You explain your situation in a hurry.*" + "\n" +
                    "Whoa slow down! Let me take you to the station so you can tell me everything." + "\n" +
                    "\n" + "YAY YOU WON! CONGRATULSTUOHSTFS :3";
        } else {
            setExitance(false);
            return "Nobody to talk to here.";
        }
    }

    @Override
    public boolean exit() {
        if (exitance) {
            return true;
        }
        return false;
    }

    public void setExitance(boolean exitance) {
        this.exitance = exitance;
    }

    public boolean getExitance() {
        return exitance;
    }
}
