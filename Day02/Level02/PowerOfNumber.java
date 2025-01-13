import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.print("Enter power: ");
        int power = scanner.nextInt();

        int result = 1;

        // Handle cases where power is 0
        if (power == 0) {
            result = 1;
        } else {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
        }

        System.out.println("Result is: " + result);

        scanner.close(); 
    }
}
