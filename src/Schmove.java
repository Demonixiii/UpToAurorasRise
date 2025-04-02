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
                if (nextRoom.equals("Room3") && Fight.isKilled1()){
                    currentPosition = map.getMap().get(nextRoom);
                    map.setCurrentPosition(nextRoom);
                    System.out.println("New Position (after moving forward): " + currentPosition);
                } else if (nextRoom.equals("Room3") && !Fight.isKilled1()) {
                    return "You have to kill the monster first.";
                }
                if (nextRoom.equals("Room7") && Fight.isKilled2()){
                    currentPosition = map.getMap().get(nextRoom);
                    map.setCurrentPosition(nextRoom);
                    System.out.println("New Position (after moving forward): " + currentPosition);
                }else if (nextRoom.equals("Room7") && !Fight.isKilled2()) {
                    return "You have to kill the monster first.";
                }
                if (nextRoom.equals("PoliceCar") && Fight.isKilled3() && Fight.isKilled4()){
                    currentPosition = map.getMap().get(nextRoom);
                    map.setCurrentPosition(nextRoom);
                    System.out.println("New Position (after moving forward): " + currentPosition);
                }else if (nextRoom.equals("PoliceCar") && !Fight.isKilled3() && !Fight.isKilled4()) {
                    return "You have to kill the monsters first.";
                }else {
                    currentPosition = map.getMap().get(nextRoom);
                    map.setCurrentPosition(nextRoom);
                    System.out.println("New Position (after moving forward): " + currentPosition);
                    if (currentPosition.getName().equals("PoliceCar")) {
                        System.out.println("Moved further successfully" + "\n");
                        return "There's a Policeman here, you should try talking to him";
                    } else if (currentPosition.getName().equals("Room2")) {
                        System.out.println("Moved further successfully" + "\n");
                        return "One of those monsters are here, you can either fight it or come back when you're stronger." + "\n" + "Monster health: 5";
                    } else if (currentPosition.getName().equals("Room6")) {
                        System.out.println("Moved further successfully" + "\n");
                        return "One of those monsters are here, you can either fight it or come back when you're stronger." + "\n" + "Monster health: 15";
                    } else if (currentPosition.getName().equals("MistyForest")) {
                        System.out.println("Moved further successfully" + "\n");
                        return "Two of the monsters are here, you can either fight them or come back when you're stronger." + "\n" + "Monster 1 health: 30" + "\n" + "Monster 2 health: 50";
                    }
                }
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
