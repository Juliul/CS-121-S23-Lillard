package Week8;

public class Mellori {
    public static void main(String[] args) {
        Corvus CorvusMellori = new Corvus(1912, "Little Raven", "Gregory Mathews");

        System.out.println(CorvusMellori);

        CorvusMellori.setName("Lil Raven");
        System.out.println(CorvusMellori.getName());
    }
}
