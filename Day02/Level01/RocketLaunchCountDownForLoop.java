import java.util.Scanner;

public class RocketLaunchCountDownForLoop {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.print("Countdown start value: ");
        int startValue = sc.nextInt();

        // Countdown using a for loop
        for (int count = startValue; count >= 1; count--) {
            System.out.println(count); // Print the current value
        }

    }
}
