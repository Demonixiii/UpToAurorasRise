public class Fight {

    TheWorld w1 = new TheWorld();

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
}
