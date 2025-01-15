import java.util.Scanner;
public class IllegalArgumentExceptionDemo{

  public static void generateException(String s1){
     System.out.println("Trying to generate substring with invalid start index...");
     System.out.println("Substring of invalid start index: " + s1.substring(20,30));
  }
  public static void handleException(String s1){
     try{
	    System.out.println("Trying to generate substring with invalid start index within try block..");
	    System.out.println("Substring of invalid start index: " + s1.substring(20,30));
	 } catch(IllegalArgumentException e){
	    System.out.println("Caught illegal argument exception: " + e.getMessage());
	 }
      
  }
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the string: ");
     String text = sc.nextLine();
	 
	 try{
	   generateException(text);
	 } catch(IllegalArgumentException e){
	    System.out.println("Exception caught in main: " + e.getMessage());
	 }
	 handleException(text);
	 sc.close();
  }
}