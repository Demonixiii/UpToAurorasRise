import java.util.Scanner;

public class Fight implements Command{
    Miles miles;
    Scanner sc = new Scanner(System.in);
    TheWorld w1;
    private static boolean killed1 = false;
    private static boolean killed2 = false;
    private static boolean killed3 = false;
    private static boolean killed4 = false;

    public Fight(Miles miles, TheWorld w1) {
        this.miles = miles;
        this.w1 = w1;
    }

    public String tryToKill(Miles m1, Monster m2){
        if (m1.getAtk() < m2.getHealth()){
            m1.setHealth(m1.getHealth()-1);
            if(m1.getHealth() == 0){
                return "You have been successfully killed!";
            }
            return "You've lost. -1 health. Remaining health: " + m1.getHealth();
        }
        return "You've won! Remaining health: " + m1.getHealth();
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
        int dec;
        if (w1.getCurrentPosition().getName().equals("Room2") || w1.getCurrentPosition().getName().equals("Room6")||w1.getCurrentPosition().getName().equals("MistyForest")) {
        System.out.println("Are you sure you want to try and kill the monster or would you rather flee to the previous room?");
            decision = sc.nextLine();
            if (decision.equalsIgnoreCase("kill")) {
                if (w1.getCurrentPosition().getName().equals("Room2")) {
                    System.out.println(tryToKill(miles, new Monster(5)));
                    if (Miles.getAtk() >= 5){
                        killed1 = true;
                    }
                } else if (w1.getCurrentPosition().getName().equals("Room6")) {
                    System.out.println(tryToKill(miles, new Monster(15)));
                    if (Miles.getAtk() >= 15){
                        killed2 = true;
                    }
                } else if (w1.getCurrentPosition().getName().equals("MistyForest")) {
                    System.out.println("Do you want to try and kill Monster 1 or 2?");
                    boolean defeated1 = false;
                    boolean defeated2 = false;

                    while(!defeated1 && !defeated2) {
                        dec = sc.nextInt();
                        if (dec == 1 && !defeated1) {
                            System.out.println(tryToKill(miles, new Monster(30)));
                            if (Miles.getAtk() >= 30) {
                                killed3 = true;
                                defeated1 = true;
                            }
                        }
                        if (dec == 2 && !defeated2) {
                            System.out.println(tryToKill(miles, new Monster(50)));
                            if (Miles.getAtk() >= 50) {
                                killed4 = true;
                                defeated2 = true;
                            }
                        } else {
                            return "Please enter 1 or 2";
                        }
                    }
                }
            } else if (decision.equalsIgnoreCase("flee")) {
                System.out.println(flee());
            } else {
                return "Please only use commands 'kill' or 'flee'.";
            }
        }else {
            return "Nobody to fight here.";
        }
        return "";
    }

    public static boolean isKilled1() {
        return killed1;
    }

    public static boolean isKilled2() {
        return killed2;
    }

    public static boolean isKilled3() {
        return killed3;
    }

    public static boolean isKilled4() {
        return killed4;
    }

    @Override
    public boolean exit() {
        return false;
    }
}
