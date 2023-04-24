package Week12;
import java.util.*;
public class StudentSet {
        HashSet<String> students = new HashSet<String>();
    public void addStudent()
    {
        Scanner console = new Scanner(System.in);
        String student = "";
        System.out.println("Enter any number of students: ");
        while (!student.equals('q')) {
             student = console.nextLine();
             if (!student.equals('q')){
                 students.add(student);
             }
        }
    }
    public void displayStudent()
    {
        Iterator<String> iter = students.iterator();
        while(iter.hasNext()) {
            String student = iter.next();
            System.out.println(iter.next());
        }
    }
}
