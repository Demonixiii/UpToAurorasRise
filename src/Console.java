import java.awt.image.Kernel;
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

    private void association(){
        commands.put("go",new Schmove());
        commands.put("investigate", new Investigate(world));
        commands.put("pickup", new PickUp(world));
        commands.put("fight", new Fight(miles,world));
        commands.put("talk",new Talk(world));
        commands.put("quit",new Exit());
        commands.put("help", new Help());
    }

    private void useCom(){
        String comm = scanner.nextLine();
        comm = comm.trim();
        comm = comm.toLowerCase();
        if (commands.containsKey(comm)){
            System.out.println(commands.get(comm).execute());
        }else {
            System.out.println("No such command exists.");
        }
    }

    public void start(){
        association();
        world.loadWorld();
        System.out.println(introduction());
        try {
            do {
                useCom();
            }while (!exit);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

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

}
