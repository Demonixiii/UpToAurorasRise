import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Console {

    public String introduction() {
        try (BufferedReader b = new BufferedReader(new FileReader("introduction.txt"))) {
            String line;
            while ((line = b.readLine()) != "+") {
                return line;
            }
            return "";
        } catch (IOException e) {
            return "";
        }
    }

}
