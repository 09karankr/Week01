import java.util.Scanner;

public class MultiplicationTableFromSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        
        // Array to store multiplication results from 6 to 9
        int[] multiplicationResult = new int[4];
        
        // Calculate multiplication results and store them in the array
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (6 + i);
        }
        
        
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }
        
        sc.close();
    }
}
