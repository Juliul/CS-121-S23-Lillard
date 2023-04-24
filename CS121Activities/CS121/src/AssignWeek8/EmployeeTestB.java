package AssignWeek8;

public class EmployeeTestB {
    public static void main(String[] args)
    {
        HourlyEmployeeB employee1 = new HourlyEmployeeB(12345, "John Doe", 30.00, 40);
        System.out.printf("Weekly Salary: %.2f%n", employee1.calculatePay());
        SalariedEmployeeA hemployee1 = new SalariedEmployeeA(12345, "John Doe", 80000);
        System.out.printf("Weekly Salary: %.2f%n", hemployee1.calculatePay());
    }
}
