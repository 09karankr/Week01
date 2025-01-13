import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the unit price of the item (in INR): ");
        double unitPrice = scanner.nextDouble();
        int quantity = scanner.nextInt();

        double totalPrice = unitPrice * quantity;

        
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

      
        scanner.close();
    }
}
