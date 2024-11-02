import java.util.Scanner;

public class IT24103902Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        // OT hours
        System.out.print("Enter the number of OT hours: ");
        int otHours = scanner.nextInt();

        // OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        // Calculate 
        double otAmount = otHours * otHourlyRate;

        
        double totalSalary = monthlySalary + otAmount;

        // Display
        System.out.println(); 
        System.out.println("The total salary including OT is: " + " "+ totalSalary);

        scanner.close();
    }
}
