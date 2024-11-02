import java.util.Scanner;

public class IT24103902Lab3Q3 {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Rupee amount: ");
        int amount = scanner.nextInt();
        
        int count5000 = amount / 5000;
        amount = amount % 5000;
        
        int count1000 = amount / 1000;
        amount = amount % 1000;

        int count500 = amount / 500;
        amount = amount % 500;

        int count200 = amount / 200;
        amount = amount % 200;

        int count100 = amount / 100;
        amount = amount % 100;

        int count50 = amount / 50;
        amount = amount % 50;    

        int count20 = amount / 20;
        amount = amount % 20;

        int count10 = amount / 10;
        amount = amount % 10;

        int count5 = amount / 5;
        amount = amount % 5;

        int count2 = amount / 2;
        amount = amount % 2;

        int count1 = amount / 1;
        amount = amount % 1;

        // Print
        System.out.println(); 
        System.out.println("5000 Notes - " + count5000);
        System.out.println("1000 Notes - " + count1000);
        System.out.println("500 Notes - " + count500);
        System.out.println("200 Notes - " + count200);
        System.out.println("100 Notes - " + count100);
        System.out.println("50 Notes - " + count50);
        System.out.println("20 Notes - " + count20);
        System.out.println("10 Coins - " + count10);
        System.out.println("05 Coins - " + count5);
        System.out.println("02 Coins - " + count2);
        System.out.println("01 Coins - " + count1);

        
        scanner.close();
    }
}
