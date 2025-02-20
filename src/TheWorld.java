import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class TheWorld {
private String start = "Basement";
private String currentPosition = start;
private HashMap<String,Location> mapatonni = new HashMap();

public boolean loadWorld(){
    try (BufferedReader b = new BufferedReader(new FileReader("map.txt"))){
        String line;
        while ((line = b.readLine()) != null){
            String[] lines = line.split(".");
            if (lines[1] == "null") {
                Location location = new Location(
                        lines[0], null, lines[2]
                );
                mapatonni.put(lines[1], location);
            } else if (lines[2] == "null") {
                Location location = new Location(
                        lines[0], lines[1], null
                );
                mapatonni.put(lines[1], location);
            } else {
                Location location = new Location(
                        lines[0], lines[1], lines[2]
                );
                mapatonni.put(lines[1], location);
            }
        }
        return true;
    }catch (Exception e){
        return false;
    }
}

}
