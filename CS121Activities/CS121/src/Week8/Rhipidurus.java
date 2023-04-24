package Week8;

public class Rhipidurus {
    public static void main(String[] args) {
        Corvus CorvusMellori = new Corvus(1918, "Fan-tailed Raven", "Ernst Johann Otto Hartert");

        System.out.println(CorvusMellori);

        CorvusMellori.setName("Wide-tailed Raven");
        System.out.println(CorvusMellori.getName());
    }
}
