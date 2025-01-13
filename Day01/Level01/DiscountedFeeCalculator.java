import java.util.Scanner;

public class DiscountedFeeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the student fee
        System.out.print("Enter the student fee (INR): ");
        double fee = scanner.nextDouble();

        // Take user input for the discount percentage
        System.out.print("Enter the university discount percentage: ");
        double discountPercent = scanner.nextDouble();

        // Calculate the discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate the final discounted fee
        double discountedFee = fee - discount;

        // Print the results
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, discountedFee);
    }
}
