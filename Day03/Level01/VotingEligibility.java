import java.util.Scanner;
public class VotingEligibility{
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
	   int NumberOfStudents = 10;
       int[] ages = new int[NumberOfStudents];
	   System.out.println("Enter the ages of ten Students: ");
	   for(int i=0; i<ages.length; i++){
	       ages[i] = sc.nextInt();
	   }
	   for(int i=0; i<ages.length; i++){
	      if(ages[i]<0){
		     System.out.println("Invalid Age: ");
		  }
		  else if(ages[i]>=18){
		     System.out.println("The student with the age "+ ages[i] + "can vote.");
		  }
		  else{
		     System.out.println("The student with the age "+ ages[i] + "can not vote.");
		  }
	   }
	   
      sc.close();  
   }
}

  