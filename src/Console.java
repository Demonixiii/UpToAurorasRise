import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Console {
    private boolean exit = false;
    private Scanner scanner = new Scanner(System.in);
    private TheWorld world = new TheWorld();
    private Miles miles = new Miles();
    private HashMap<String,Command> commands = new HashMap<>();
    private String returned = "";

    /**
     * Associates commands with their purpose
     */
    private void association(){
        commands.put("go",new Schmove(world));
        commands.put("investigate", new Investigate(world));
        commands.put("pickup", new PickUp(world));
        commands.put("fight", new Fight(miles,world));
        commands.put("talk",new Talk(world));
        commands.put("quit",new Exit());
        commands.put("help", new Help());
    }

    /**
     * Reads user's commands and executes them
     */
    private void useCom(){
        try {
            String comm = scanner.nextLine();
            comm = comm.trim();
            comm = comm.toLowerCase();
            this.exit = commands.get(comm).exit();
            if (Miles.getHealth()==0){
                this.exit=Die.exit();
                Die.die();
            }
            if (commands.containsKey(comm)) {
                System.out.println(commands.get(comm).execute());
            } else {
                System.out.println("No such command exists.");
            }
        }catch (Exception e){
            System.out.println("something went wog :(");
        }
    }

    /**
     * Starts, plays and ends the game.
     */
    public void start(){
        association();
        world.loadWorld();
        System.out.println(introduction());
        try {
            while(!exit) {
                useCom();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Loads introduction from file.
     * @return Introduction in string
     */
    public String introduction() {
        try (BufferedReader b = new BufferedReader(new FileReader("introduction.txt"))) {
            String line;
            while ((line = b.readLine()) != null) {
                returned += line + "\n";
            }
            return returned;
        } catch (IOException e) {
            return "";
        }
    }

    public TheWorld getWorld() {
        return world;
    }
}
