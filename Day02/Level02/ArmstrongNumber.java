import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		int number = sc.nextInt();
		long sum = 0;
		int originalNumber = number;
	
		while(originalNumber!=0){
		   int remainder = originalNumber%10;  //give the last digit
		   sum += remainder*remainder*remainder; // add the cube of the digit to the sum.
		   originalNumber /=10; //remove the last digit
		   
		   
		}
		if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close(); 
	}
}