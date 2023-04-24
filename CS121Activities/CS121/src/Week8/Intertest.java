package Week8;
public class Intertest {
    public static void main(String[] args) {
        Japanese first = new Japanese("Reiko Illeji","Intermediate Japanese",202);

        English second = new English("Jacob Turner","Bemis", 104);

        String firstName = first.printClass();
        String secondName = second.printClass();

        System.out.println(firstName);
        System.out.println(secondName);
    }
}
