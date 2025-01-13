import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a year (greater than 1582): ");
        int year = sc.nextInt();

        // Check if the year is valid
        if (year <= 1582) {
            System.out.println("Please enter a year greater than 1582.");
        } else {
            // Check if the year is a leap year
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                if (year % 4 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        }

        
        sc.close();
    }
}
