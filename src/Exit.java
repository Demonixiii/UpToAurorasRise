public class Exit implements Command{
    @Override
    public String execute() {
        return "You've quit";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
