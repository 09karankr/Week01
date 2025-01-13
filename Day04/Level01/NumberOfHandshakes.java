
import java.util.Scanner;
public class NumberOfHandshakes{
     public static int Combination(int n){
	     return (n*(n-1))/2;
	 
	 }
	 public static void main(String[] args){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Give the number of students: ");
	    int NumberOfStudents = scanner.nextInt();
		int CombinationFormula = Combination(NumberOfStudents);
		System.out.println("Maximum Number of handshakes is "+ CombinationFormula);
        		
	 }
}

