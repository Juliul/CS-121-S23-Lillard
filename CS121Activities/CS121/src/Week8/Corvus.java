package Week8;

public class Corvus {
    private int date;
    private String name;
    private String founder;
    public Corvus(int date, String name, String founder){
        this.date = date;
        this.name = name;
        this.founder = founder;
    }
    public int getDate()
    {
        return date;
    }
    public void setDate(int date)
    {
        this.date = date;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getFounder()
    {
        return founder;
    }
    public void setFounder(String name)
    {
        this.founder = founder;
    }
    @Override
    public String toString()
    {
        return String.format("Name: %s%nDate: %d%nFounder: %s%n",name,date,founder);
    }
}
