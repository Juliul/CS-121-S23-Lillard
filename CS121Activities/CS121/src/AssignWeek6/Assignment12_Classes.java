package AssignWeek6;

public class Assignment12_Classes
{
    String name = "John Doe";
    String id = "12345";
    String major = "Computer Science";
    double gpa = 3.8;

    void getStudentInfo()
    {
        System.out.printf("Name: %s%nID: %s%nMajor: %s%nGPA: %.1f", name, id, major, gpa);
    }
}
class StudentTest{
    static void main(String[] args){
        Assignment12_Classes student1 = new Assignment12_Classes();

        System.out.printf("Name: %s%n", student1.name);
        System.out.printf("ID: %s%n", student1.id);
        System.out.printf("Major: %s%n", student1.major);
        System.out.printf("GPA: %s%n", student1.gpa);

        student1.getStudentInfo();
    }
}