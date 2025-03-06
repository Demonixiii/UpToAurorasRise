import java.util.Scanner;

public class Schmove implements Command {
    private Scanner sc = new Scanner(System.in);
    private TheWorld map = new TheWorld();
    private Location currentPosition = new Location();

    @Override
    public String execute() {
        currentPosition = map.getCurrentPosition();
        System.out.println("Do you wish to go further or go back?");
        String input = sc.nextLine();
        System.out.println(currentPosition);
        if (input.equalsIgnoreCase("further")) {
            if (currentPosition.getForward()!= null){
                if (map.getMap().containsKey(currentPosition.getForward())){
                    currentPosition = map.getMap().get(currentPosition.getForward());
                    return "Moved further successfully";
                }
            }
        }
        else if (input.equalsIgnoreCase("back")) {
            if (currentPosition.getBackward()!= null){
                if (map.getMap().containsKey(currentPosition.getBackward())){
                    currentPosition = map.getMap().get(currentPosition.getBackward());
                    return "Moved backward successfully";
                }
            }
        }
        else if (currentPosition.getForward() == null || currentPosition.getBackward() == null) {
            return "There is no room in that direction.";
        }
        return null;
    }



    @Override
    public boolean exit() {
        return false;
    }
}
