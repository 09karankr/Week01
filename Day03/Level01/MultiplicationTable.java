import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the number: ");
	   int number = sc.nextInt();
	   int[] Multiplication = new int[10];
	   int[] result = new int[10];
	   for(int i=0; i<Multiplication.length; i++){
	       result[i] = number*(i+1);
	       
	   }
	   for(int i=0; i<Multiplication.length; i++){
	       System.out.println("Multiplication table of "+ number +"*" + (i+1) + " is "+ result[i]);
	   }
	   sc.close();
	}
	
	}
