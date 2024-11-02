import java.util.Scanner;

public class IT24103902Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input

         System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        // calculate

        double totalCost = pricePerKg * quantity;

        double discount = totalCost * 0.10;

        double finalAmount = totalCost - discount;

        System.out.println();

        //output

        System.out.println("The total amount with 10% discount is: "+ " " + finalAmount);
        scanner.close();
    }
}