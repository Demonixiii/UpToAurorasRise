import java.util.Scanner;

public class Fight implements Command{
    Miles miles;
    Scanner sc = new Scanner(System.in);
    TheWorld w1;

    public Fight(Miles miles, TheWorld w1) {
        this.miles = miles;
        this.w1 = w1;
    }

    public String tryToKill(Miles m1, Monster m2){
        if (m1.getAtk() < m2.getHealth()){
            m1.setHealth(m1.getHealth()-1);
            return "You've lost. -1 health. Remaining health: " + m1.getHealth();
        }
        return "You've won";
    }

    public String flee(){
        w1.loadWorld();
        w1.setCurrentPosition(w1.getCurrentPosition().getBackward());
        return "You've fled to the previous room.";
    }

    public void setW1(TheWorld w1) {
        this.w1 = w1;
    }

    public TheWorld getW1() {
        return w1;
    }

    @Override
    public String execute() {
        String decision;
        System.out.println("Do you wish to try and kill the monster or flee to the previous room?");
        decision = sc.nextLine();
        if (decision.equalsIgnoreCase("kill")){
            if (w1.getCurrentPosition().equals("Room2")){
                tryToKill(miles,new Monster(5));
            }else if (w1.getCurrentPosition().equals("Room6")){
                tryToKill(miles,new Monster(15));
            }else if (w1.getCurrentPosition().equals("MistyForest")){
                tryToKill(miles,new Monster(50));
            }
        } else if (decision.equalsIgnoreCase("flee")) {
            flee();
        }else {
            return "Please only use commands 'kill' or 'flee'.";
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
