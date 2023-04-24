package Week16;

public class Student {
    private int id;
    private String name;

    private String major;

    private float gba;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    @Override
    public String toString() {return String.format("Name: %s%nTD: %d%n",name,id);}
}
