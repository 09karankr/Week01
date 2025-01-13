import java.util.Scanner;

public class CheckFirstNumberIsSmallest{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number1:");
	 int number1 = sc.nextInt();
	 System.out.println("Enter the number2:");
	 int number2 = sc.nextInt();
	 System.out.println("Enter the number3:");
	 int number3 = sc.nextInt();
	 boolean result = false;                 // boolean flag to make the result true and false
	 if(number1<number2 && number1<number3){
	      result = true;
	    System.out.println("Is the first number the smallest? "+ result);
	 }
	 else{
	    System.out.println("Is the first number the smallest? "+ result);
	 }
	 sc.close(); 
   }
   
}