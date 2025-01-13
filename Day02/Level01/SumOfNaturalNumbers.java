import java.util.Scanner;

public class SumOfNaturalNumbers{
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number:");
	 int number = sc.nextInt();
	 if(number>=0){
	    int SumOfNNaturalNum = number * (number+1)/2;  // formula for finding the sum of n natural number.
		System.out.println( "The sum of "
	                   + number + " natural numbers is " + SumOfNNaturalNum);
	 }
	 else{
	   System.out.println("Otherwise The number " + number + "is not a natural number");
	 }
	 sc.close(); 
   }
   
}