public class Location {
    private String name;
    private String forward;
    private String backward;

    public Location(String name, String forward, String backward) {
        this.name = name;
        this.backward = backward;
        this.forward = forward;
    }

    public Location() {
    }

    public String getBackward() {
        return backward;
    }

    public String getForward() {
        return forward;
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
