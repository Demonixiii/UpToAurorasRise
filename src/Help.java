public class Help implements Command {

    @Override
    public String execute() {
        return "Commands:" + "\n" + "go (for further or back)" + "\n" + "investigate"+ "\n" + "pickup"+ "\n" + "fight (for kill or flee)" +"\n" + "quit" + "\n" + "talk";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
