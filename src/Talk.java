public class Talk implements Command{
    @Override
    public String execute() {
        return "Hey kid, watcha doin here?" + "\n" + "Whoa slow down! Let me take you to the station so you can tell me everything." + "\n" + "\n" + "YAY YOU WON! CONGRATULSTUOHSTFS :3";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
