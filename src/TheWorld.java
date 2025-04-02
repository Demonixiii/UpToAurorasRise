import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class TheWorld {
private String start = "Basement";
private String currentPosition = start;
private HashMap<String,Location> mapatonni = new HashMap();

    /**
     * Loads the world/map from file into a hashmap.
     * @return Returns whether world/map was loaded.
     */
    public boolean loadWorld(){
    try (BufferedReader b = new BufferedReader(new FileReader("map.txt"))){
        String line;
        while ((line = b.readLine()) != null){
            String[] lines = line.split("/");
            if (lines[1].equals("null")) {
                Location location = new Location(
                        lines[0], null, lines[2]
                );
                mapatonni.put(lines[0], location);
            } else if (lines[2].equals("null")) {
                Location location = new Location(
                        lines[0], lines[1], null
                );
                mapatonni.put(lines[0], location);
            } else {
                Location location = new Location(
                        lines[0], lines[1], lines[2]
                );
                mapatonni.put(lines[0], location);
            }
        }
        return true;
    }catch (IOException e){
        return false;
    }
}

public Location getCurrentPosition() {
    return mapatonni.get(currentPosition);
}
    public HashMap<String, Location> getMap() {
        return mapatonni;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }
}
