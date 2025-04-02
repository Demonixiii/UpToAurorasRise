import java.util.Scanner;

public class Schmove implements Command {
    private Scanner sc = new Scanner(System.in);
    private TheWorld map;
    private Location currentPosition;

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
            String nextRoom = currentPosition.getForward();
            if (nextRoom != null && map.getMap().containsKey(nextRoom)) {
                currentPosition = map.getMap().get(nextRoom);
                map.setCurrentPosition(nextRoom);
                System.out.println("New Position (after moving forward): " + currentPosition);
                return "Moved further successfully";
            } else {
                return "There is no room further.";
            }
        }
        else if (input.equalsIgnoreCase("back")) {
            String previousRoom = currentPosition.getBackward();
            if (previousRoom != null && map.getMap().containsKey(previousRoom)) {
                currentPosition = map.getMap().get(previousRoom);
                map.setCurrentPosition(previousRoom);
                System.out.println("New Position (after moving back): " + currentPosition);
                return "Moved backward successfully";
            } else {
                return "There is no room back.";
            }
        }
        else {
            return "Invalid input. Please use 'go' then 'further' or 'back'.";
        }
    }





    @Override
    public boolean exit() {
        return false;
    }
}
