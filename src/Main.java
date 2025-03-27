
public class Main {
    public static void main(String[] args) {
        Console c = new Console();

        System.out.println(c.introduction());

        TheWorld world = new TheWorld();
        world.loadWorld();
        System.out.println(world.getCurrentPosition());

        c.start();
    }
}