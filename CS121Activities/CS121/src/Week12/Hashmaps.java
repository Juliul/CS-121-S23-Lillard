package Week12;
import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    private Map<String, String> map = new HashMap<>();

    public void addSoundtrack(String movie, String song) {map.put(movie, song);}

    public void remSoundtrack(String movie) {map.remove(movie);}

    public String  getSong(String movie) {return map.get(movie);}

    public void displaySoundtrack() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Movie: " + entry.getKey() + " | Song: " + entry.getValue());
        }
    }
}
