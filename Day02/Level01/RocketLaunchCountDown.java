import java.util.Scanner;

class RocketLaunchCountDown {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the countdown start value: ");
        int counter = scanner.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println(counter); // Print the current value
            counter--; // Decrement the counter
        }

    }
}
