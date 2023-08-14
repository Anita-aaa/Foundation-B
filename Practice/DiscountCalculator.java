// 3
import java.util.Scanner;
/*3.A shopping website wants to calculate the discount amount for a customer's purchase
 based on the total bill. Write a Java program that takes the total bill amount as input
  and returns the discount amount.
i.Write a function named calculate Discount that takes the total bill amount as a parameter
 and returns the discount amount. (10% discount)
ii.Display the calculated discount amount on the console. */


public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total bill amount: ");
        double totalBill = scanner.nextDouble();

        double discountAmount = calculateDiscount(totalBill);

        System.out.println("Discount amount: $" + discountAmount);

        scanner.close();
    }

    public static double calculateDiscount(double totalBill) {
        // Assuming a 10% discount
        double discountPercentage = 10.0;
        double discountAmount = (totalBill * discountPercentage) / 100.0;
        return discountAmount;
    }
}
// outputEnter the total bill amount: 1000
// Discount amount: $100.0