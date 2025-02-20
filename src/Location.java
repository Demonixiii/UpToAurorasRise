public class Location {
    private String name;
    private String forward;
    private String backward;

    public Location(String name, String backward, String forward) {
        this.name = name;
        this.backward = backward;
        this.forward = forward;
    }
}
