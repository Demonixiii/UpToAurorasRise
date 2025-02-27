public class Fight {

    public String tryToKill(Miles m1, Monster m2){
        if (m1.getAtk() < m2.getHealth()){
            return "You've lost. -1 health";
        }
        return "You've won";
    }

    public String flee(){
        return "You've fled to the previous room.";
    }

}
