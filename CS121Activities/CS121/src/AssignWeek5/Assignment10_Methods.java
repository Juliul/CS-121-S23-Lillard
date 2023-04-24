package AssignWeek5;
import java.util.Scanner;
public class Assignment10_Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a fahrenheit temperature");
        int fahrenheit = Integer.parseInt(scanner.nextLine());
        System.out.printf("Celcius: %.1f\n", convertToCelcius(fahrenheit));

        System.out.println("Enter a celsius termperature");
        double celsius = Double.parseDouble(scanner.nextLine());
        System.out.printf("Fahrenheit: %d\n", convertToFahrenheit(celsius));
    }
    public static Double convertToCelcius(int f_temp) {
        double celsius = (f_temp - 32) * 5.0/9;
        return celsius;
    }
    public static int convertToFahrenheit(double c_temp) {
        double fahrenheit = 9/5 * c_temp + 32;
        return (int)fahrenheit;
    }
}
