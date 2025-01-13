import java.util.Scanner;
public class HarshadNumber{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int number = sc.nextInt();
	  int sumOfDigits =0;
	  while(number!= 0){
	      // get the last digit
	      int remainder = number%10;
          //get the sum of digits		  
		  sumOfDigits += remainder;
		  //remove the last digit
		  number/=10;
		  
	  }
	  if(number%sumOfDigits == 0){
	    System.out.println("HarshadNumber");
	  }
	  else{
	    System.out.println("Not a HarshadNumber");
	  }
	  sc.close();
   }
 }