
import java.util.Scanner;
import java.util.Arrays;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the valid number : ");
        int number = scanner.nextInt();
        int temp = number;
        int[] digits = new int[10];
        int i=0;// index of digits array
        while(number>0){
        int rem = number%10;
        digits[i]=rem;
        number/=10;
        i++;
}
// sorting the array to get the largest and second largest element
Arrays.sort(digits);
// last element of digits array will be largest 

   System.out.print("\nThe largest digit of number : " + temp + " is " + digits[9] );
   System.out.print("\nThe second largest digit of number : " + temp + " is " + digits[8] );


}
}

