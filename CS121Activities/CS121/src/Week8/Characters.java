package Week8;

public class Characters {
    private String name;
    private String classification;
    private String race;
    private int hitpoints;
    private static int characterCount = 1;

    public Characters(String name,String classification, String race, int hitpoints) {
        this.name = name;
        this.classification = classification;
        this.race = race;
        this.hitpoints = hitpoints;
        characterCount++;
    }
    public String getName() {return name;}
    public String getClassifaction() {return classification;}
    public String getRace() {return race;}
    public int getHitpoints() {return hitpoints;}
    public static int getCharacterCount() {return characterCount;}
}
