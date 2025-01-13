import java.util.Scanner;
public class AbundantNumber{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number: ");
	  int number = sc.nextInt();
	  int sumOfDivisor =0;
	  for(int i=1; i<number; i++){
	     if(number%i==0){
		    sumOfDivisor += i;
		 }
	  }
	  if(sumOfDivisor>number){
	    System.out.println("AbundantNumber");
		
	  }
	  else{
	   System.out.println("Not a AbundantNumber");
	  }
  }
}