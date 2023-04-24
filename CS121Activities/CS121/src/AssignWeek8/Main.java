package AssignWeek8;

public class Main {
    public static void main(String[] args) {
        Enemy troll = new Enemy("Troll",15,30);
        Enemy goblin = new Enemy("Goblin",10,20);
        System.out.printf("Troll enemy count: %d%n", troll.getEnemyCount());
        System.out.printf("Goblin enemy count: %d%n", goblin.getEnemyCount());
        System.out.printf("Enemy enemy count: %d%n", Enemy.getEnemyCount());
        message();
    }
    static void message() {
        System.out.println("Static method call");
    }
}
