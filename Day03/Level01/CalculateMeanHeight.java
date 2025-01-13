import java.util.Scanner;
public class CalculateMeanHeight{
    public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int number = 11;
	 double[] heights = new double[number];
	 System.out.println("Enter the heights of the 11 players: ");
	 // take the input height from the user.
     for(int i=0; i<heights.length; i++){
	      heights[i] = sc.nextDouble();
	 }
     double sum =0;
	 
	// sum of the all the height of the eleven players.
     for(int i=0; i<heights.length; i++){
	     sum = sum + heights[i];
	 }
	 //formula for getting the mean of the players height
     double mean = sum/11;
     System.out.println("Mean height of the players is "+ mean);	 
     	 
	}
}