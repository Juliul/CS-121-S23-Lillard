package Project2;

public class Pokemon {
    // initialize variables
    private String name;
    private int  hitPoints;
    private String move;
    private int movePower;
    private int attackSpeed;


    // constructor with all variables as parameters

    public Pokemon(String name, int hitPoints, String move, int movePower, int attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.move = move;
        this.movePower = movePower;
        this.attackSpeed = attackSpeed;
    }


    // variables getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public int getMovePower() {
        return movePower;
    }

    public void setMovePower(int movePower) {
        this.movePower = movePower;
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }



    public void displayPokemonStats() {
        String stat = String.format("Name: %s\n HitPoints: %d\n Move: %s\n Move Power: %d\n Attack Speed: %d \n", name, hitPoints, move, movePower, attackSpeed);
        System.out.println(stat);
    }
}
