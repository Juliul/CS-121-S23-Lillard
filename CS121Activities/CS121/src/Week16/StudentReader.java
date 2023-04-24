package Week16;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class StudentReader {
    private ArrayList<Student> studs = new ArrayList<>();
    public void readJson() {
        try{
            Gson gson = new Gson();
            BufferedReader reader = new BufferedReader(new FileReader("Student.json"));
            Type studentListType = new TypeToken<ArrayList<Student>>(){}.getType();
            studs = gson.fromJson(reader,studentListType);
            //System.out.println("****** Student Details ******");
            //System.out.printf("Student name %s\nStudent id: %d\nStudent major: %s\nStudent gpa: %d\n"
            //        ,stud.getName(),stud.getId(),stud.getMajor(), stud.getGpa());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void printStudentList() {
        for (Student stud : studs) {
            System.out.println(stud.toString());
        }
    }
}


