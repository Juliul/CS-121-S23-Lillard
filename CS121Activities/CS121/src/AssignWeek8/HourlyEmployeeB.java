package AssignWeek8;

public class HourlyEmployeeB implements Pay{
    private int id;
    private String name;
    private double wage;
    private int hours;

    public HourlyEmployeeB(int id, String name, double wage, int hours)
    {
        this.id = id;
        this.name = name;
        this.wage = wage;
        this.hours = hours;
    }
    public double getWage()
    {
        return wage;
    }
    public void setWage(double wage)
    {
        this.wage = wage;
    }
    public int getHours()
    {
        return hours;
    }
    public void setHours(int hours)
    {
        this.hours = hours;
    }
    public double calculatePay()
    {
        return wage * hours;
    }
}
