import java.util.Scanner;

public class Schmove implements Command {
    private Scanner sc = new Scanner(System.in);
    private TheWorld map;
    private Location currentPosition = new Location();

    public Schmove(TheWorld map) {
        this.map = map;
        map.loadWorld();
        currentPosition = map.getCurrentPosition();
    }

    @Override
    public String execute() {

        System.out.println("Do you wish to go further or go back?");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("further")) {
            if (currentPosition.getForward() != null && map.getMap().containsKey(currentPosition.getForward())) {
                currentPosition = map.getMap().get(currentPosition.getForward());
                System.out.println("New Position (after moving forward): " + currentPosition);
                return "Moved further successfully";
            } else {
                return "There is no room further.";
            }
        }
        else if (input.equalsIgnoreCase("back")) {
            if (currentPosition.getBackward() != null && map.getMap().containsKey(currentPosition.getBackward())) {
                currentPosition = map.getMap().get(currentPosition.getBackward());
                System.out.println("New Position (after moving back): " + currentPosition);
                return "Moved backward successfully";
            } else {
                return "There is no room back.";
            }
        }
        else {
            return "Invalid input. Please enter 'further' or 'back'.";
        }
    }





    @Override
    public boolean exit() {
        return false;
    }
}
