import java.util.Scanner;
public class CheckStatusOfNumber{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int Number =5;
	   int[] NumberArray = new int[Number];
	   System.out.println("Enter the 5 numbers: ");
	   for(int i=0; i<NumberArray.length; i++){
	       NumberArray[i] = sc.nextInt();
	   }
	   for(int i=0; i<NumberArray.length; i++){
	       if(NumberArray[i]>0){
		        if(NumberArray[i]%2==0){
				    System.out.println("Even number");
				}
				else{
				    System.out.println("Odd Number");
				}
		   }
		   else if(NumberArray[i]<0){
		            System.out.println("Negative");
		   }
		   else{
		        System.out.println("Zero");
		   }
		  
	   }
	   if(NumberArray[0] == NumberArray[Number-1]){
	       System.out.println("First and last element of the array is equal");
	   }
	   else if(NumberArray[0]>NumberArray[Number-1]){
	       System.out.println("First number is greater than the last number");
	   }
	   else{
	       System.out.println("First number is less than the last element");
	   }
	      
	   sc.close();
	}
}