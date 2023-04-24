package AssignWeek8;

public class EmployeeTestA {
    public static void main(String[] args) {
        SalariedEmployeeA employee1 = new SalariedEmployeeA(12345, "John Doe", 80000);
        System.out.printf("Weekly Salary: %.2f%n", employee1.calculatePay());
        HourlyEmployeeA hemployee1 = new HourlyEmployeeA(12345, "John Doe", 30.00, 40);
        System.out.printf("Weekly Salary: %.2f%n", hemployee1.calculatePay());
    }
}
