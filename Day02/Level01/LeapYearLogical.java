import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a year greater than 1582: ");
        int year = scanner.nextInt();

        // Check if the year is valid
        if (year <= 1582) {
            System.out.println("Please enter a year greater than 1582.");
        } else {
            // Check if the year is a leap year
            if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }

       
        scanner.close();
    }
}
