import java.util.Scanner;

public class CheckDivisibility{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int number = sc.nextInt();
	 boolean result = false;
	 if(number%5==0){
	     result = true; 
	    System.out.println("Is the number"+number+"divisible by 5?"+result);
	 }
	 else{
	    System.out.println("The number is not divisible by 5");
	 }
	 sc.close(); 
   }
   
}