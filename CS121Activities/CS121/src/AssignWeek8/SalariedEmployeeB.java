package AssignWeek8;

public class SalariedEmployeeB implements Pay
{
    private int id;
    private String name;
    private double salary;

    public SalariedEmployeeB(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public double calculatePay()
    {
        return salary/52;
    }
}
