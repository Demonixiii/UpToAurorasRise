public class Win implements Command{
    @Override
    public String execute() {
        return "YAY YOU WON! CONGRATULSTUOHSTFS :3";
    }

    @Override
    public boolean exit() {
        return true;
    }
}
