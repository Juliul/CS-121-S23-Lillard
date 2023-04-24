package Week16;
import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class StudentWriter {
    public static void main(String[] args) {
        try {
            Student stud = new Student(47933, "Julius Lillard", "CT", 3.67);

            Gson gson = new Gson();

            String jsonString = gson.toJson(stud);

            FileWriter filewriter = new FileWriter("employeeWritingStuff.json");
            filewriter.write(jsonString);
            filewriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
