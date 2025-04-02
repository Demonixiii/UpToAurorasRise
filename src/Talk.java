public class Talk implements Command{
    private TheWorld w1;
    private boolean exitance = false;

    public Talk(TheWorld w1) {
        this.w1 = w1;
    }

    @Override
    public String execute() {
        if (w1.getCurrentPosition().getName().equals("PoliceCar")) {
            exitance = true;
            return "Hey kid, watcha doin here?" + "\n" + "Whoa slow down! Let me take you to the station so you can tell me everything." + "\n" + "\n" + "YAY YOU WON! CONGRATULSTUOHSTFS :3";
        }else {
            return "Nobody to talk to here.";
        }
    }

    @Override
    public boolean exit() {
        return exitance;
    }
}
