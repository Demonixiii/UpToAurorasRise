public class Help implements Command {

    @Override
    public String execute() {
        return "Commands:" + "\n" + "go further" + "\n" + "go back" + "\n" + "investigate"+ "\n" + "pick up"+ "\n" + "kill" + "\n" + "flee" +"\n" + "quit" + "\n" + "talk";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
