public class Help implements Command {

    @Override
    public String execute() {
        return "Commands:" + "\n" + "gofurther" + "\n" + "goback" + "\n" + "investigate"+ "\n" + "pickup"+ "\n" + "kill" + "\n" + "flee" +"\n" + "quit" + "\n" + "talk";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
