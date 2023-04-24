package Week16;

public class Student {
    private int id;
    private String name;

    private String major;

    private double gpa;

    public Student(int id, String name, String major, double gpa)
    {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getMajor() {return major;}
    public void setMajor(String major) {this.major = major;}
    public double getGpa() {return gpa;}
    public void setGpa(double gpa) {this.gpa = gpa;}

    public String toString() {return String.format("Name: %s\n" + "ID: %d\n" + "Major: %s\n" + "GPA: %.2f\n" ,name,id,major,gpa);}
}
