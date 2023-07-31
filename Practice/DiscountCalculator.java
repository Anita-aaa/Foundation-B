// 3
import java.util.Scanner;

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
