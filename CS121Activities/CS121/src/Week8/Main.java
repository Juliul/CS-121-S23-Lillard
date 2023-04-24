package Week8;

public class Main {
    public static void main(String[] args){
        Characters Lucik = new Characters("Lucik","Rogue","Drow",10);
        Characters Tess = new Characters("Tess","Ranger","Wood Elf", 11);
        System.out.printf("Elf character amount: %d%n", Lucik.getCharacterCount());
        System.out.printf("Elf character amount: %d%n", Tess.getCharacterCount());
        System.out.printf("Characters made: %d%n", Characters.getCharacterCount());
    }
}
