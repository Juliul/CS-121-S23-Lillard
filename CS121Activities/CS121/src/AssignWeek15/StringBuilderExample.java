package AssignWeek15;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        String s1 = String.format("\nName: %s\nAge: %d\nMajor: %s\n", "John Doe", 19, "CS");
        String s2 = String.format("\nName: %s\nAge: %d\nMajor: %S\n", "Jane Smith", 20, "Math");
        String s3 = String.format("\nName: %s\nAge: %d\nMajor: %s\n", "John Doe", 19, "CS");
        String s4 = String.format("\nName: %s\nAge: %d\nMajor: %S\n", "Jane Smith", 20, "Math");



        System.out.println("Empty StringBuilder:");
        System.out.println(stringBuilder);
        System.out.println("\nStringBuilder after appending s1:");
        stringBuilder.append(s1);
        System.out.println(stringBuilder);
        System.out.println("\nStringBuilder after appending s2:");
        stringBuilder.append(s2);
        System.out.println(stringBuilder);


        
        System.out.println(stringBuilder.capacity());
        stringBuilder.append(s3);
        System.out.println(stringBuilder.capacity());
        stringBuilder.append(s4);
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder);
    }
}
