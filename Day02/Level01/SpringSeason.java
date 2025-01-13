import java.util.Scanner;

public class SpringSeason{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        if (args.length < 2) {
            System.out.println("Give month and day in command line.");
            return;
        }
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Determine if it's spring season
        boolean isSpring = false;

        if (month == 3 && day >= 20 && day <= 31) { // March
            isSpring = true;
        } else if (month == 4 && day >= 1 && day <= 30) { // April
            isSpring = true;
        } else if (month == 5 && day >= 1 && day <= 31) { // May
            isSpring = true;
        } else if (month == 6 && day >= 1 && day <= 20) { // June
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
    
