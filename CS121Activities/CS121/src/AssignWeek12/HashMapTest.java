package AssignWeek12;
import java.util.Objects;
public class HashMapTest {
    public static void main(String[] args) {
        HashMapDemo demo = new HashMapDemo();

        demo.addToGradesList("CS121", 98);
        demo.addToGradesList("CS124", 87);
        demo.addToGradesList("CS224", 79);

        demo.displayGrades();

        System.out.println(demo.getScore("CS121"));
        demo.removeFromGradesList("CS121");
        System.out.println(demo.getScore("CS121"));

        demo.displayGrades();
    }
}
