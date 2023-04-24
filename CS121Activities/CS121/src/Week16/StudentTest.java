package Week16;

public class StudentTest {
    public static void main(String[] args) {
        StudentReader read = new StudentReader();
        read.readJson();
        read.printStudentList();
    }
}
