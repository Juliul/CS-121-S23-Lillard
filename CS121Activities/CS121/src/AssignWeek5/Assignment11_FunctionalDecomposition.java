package AssignWeek5;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Assignment11_FunctionalDecomposition {
    public static void main(String[] args) throws FileNotFoundException {
        final int NUM_DAYS = 30;
        String filename;
        double totalSales;
        double averageSales;

        filename = getFileName();
        totalSales = getTotalSales(filename);
        averageSales = totalSales / NUM_DAYS;
        displayResults(totalSales, averageSales);

        System.exit(0);
    }
    public static String getFileName() {
        String file;
        file = JOptionPane.showInputDialog("Enter the name " +
                "of the file containing 30 days of sales amounts");
        return file;
    }
    public static double getTotalSales(String filename) throws FileNotFoundException {
        double total = 0.0;
        double sales;

        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            sales = Double.parseDouble(scanner.nextLine());
            total += sales;
        }
        scanner.close();
        return total;
    }
    public static void displayResults(double total, double average) {
        JOptionPane.showMessageDialog(null,
                String.format("The total sales for the period is $%.2f\n" +
                        "The average daily sales were $%,.2f",
                        total, average));
    }

}
