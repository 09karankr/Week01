import java.util.Scanner;
public class NumberFormatExceptionDemo{

  public static void generateException(String s1){
     System.out.println("Trying to extract the number from the text..");
     System.out.println("Extracting number from the string : " + Integer.parseInt(s1));
  }
  public static void handleException(String s1){
     try{
	    System.out.println("Trying to extract the number from the text..");
	    System.out.println("Extracting number from the string : " + Integer.parseInt(s1));
	 } catch(NumberFormatException e){
	    System.out.println("Caught number format exception: " + e.getMessage());
	 } catch (RuntimeException e) {
            // Generic runtime exception handler
            System.out.println("Caught a generic RuntimeException: " + e.getMessage());
        }
      
  }
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the string: ");
     String text = sc.nextLine();
	 
	 try{
	   generateException(text);
	 } catch(NumberFormatException e){
	    System.out.println("Exception caught in main: " + e.getMessage());
	 }
	 handleException(text);
	 sc.close();
  }
}