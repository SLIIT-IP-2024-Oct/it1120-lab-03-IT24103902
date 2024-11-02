import java.util.Scanner;

public class IT24103902Lab3Q1A {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //inputs

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double kilograms = scanner.nextDouble();

        // Calculate 
        double totalAmount = pricePerKg * kilograms;

         System.out.println();

        // output
        System.out.print("The total amount is:"+ " "+totalAmount);

       
        scanner.close();
    }
}
