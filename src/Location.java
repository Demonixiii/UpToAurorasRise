import java.util.ArrayList;

public class Location {
    private String name;
    private String forward;
    private String backward;
    private ArrayList<Monster> monsters;

    public Location(String name, String forward, String backward) {
        this.name = name;
        this.backward = backward;
        this.forward = forward;
    }
    public Location(String name, String forward, String backward,ArrayList<Monster> monsters) {
        this.name = name;
        this.backward = backward;
        this.forward = forward;
        this.monsters = monsters;
    }

    public Location() {
    }

    public String getBackward() {
        return backward;
    }

    public String getForward() {
        return forward;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Location{" +
                "name='" + name + '\'' +
                ", forward='" + forward + '\'' +
                ", backward='" + backward + '\'' +
                '}';
    }
}
