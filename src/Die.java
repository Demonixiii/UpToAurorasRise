import java.util.ArrayList;
import java.util.Random;

public class Die implements Command{
    @Override
    public String execute() {
        Random rd = new Random();
        ArrayList<String> gameOver = new ArrayList<>();
        gameOver.add("GAME OVER");
        gameOver.add("TRY AGAIN");
        gameOver.add("NICE TRY");
        gameOver.add("FAIL");
        gameOver.add("YOU LOST");
        return gameOver.get(rd.nextInt(4));
    }

    @Override
    public boolean exit() {
        return true;
    }
}
