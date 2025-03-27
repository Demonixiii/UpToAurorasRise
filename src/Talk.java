public class Talk implements Command{
    TheWorld w1;

    public Talk(TheWorld w1) {
        this.w1 = w1;
    }

    @Override
    public String execute() {
        if (w1.getCurrentPosition().equals("PoliceCar")) {
            return "Hey kid, watcha doin here?" + "\n" + "Whoa slow down! Let me take you to the station so you can tell me everything." + "\n" + "\n" + "YAY YOU WON! CONGRATULSTUOHSTFS :3";
        }else {
            return "Nobody to talk to here.";
        }
    }

    @Override
    public boolean exit() {
        return true;
    }
}
