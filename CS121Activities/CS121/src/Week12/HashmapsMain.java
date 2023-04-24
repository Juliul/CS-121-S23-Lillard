package Week12;
public class HashmapsMain {
    public static void main(String[] args) {
        Hashmaps ghibli = new Hashmaps();
        ghibli.addSoundtrack("Kiki's Delivery Service", "Town with an ocean view");
        ghibli.addSoundtrack("Howl's Moving Castle", "The Merry Go Round Of Life");
        ghibli.addSoundtrack("My Neighbor Totoro", "A Huge Tree in the  Tsukamori Forest");

        ghibli.displaySoundtrack();

        ghibli.remSoundtrack("My Neighbor Totoro");

        ghibli.displaySoundtrack();
    }
}
