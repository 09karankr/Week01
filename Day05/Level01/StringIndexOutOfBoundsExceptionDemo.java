import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo{
    public static void generateException(String s1){
	   System.out.println("Trying to access invalid index...");
	   System.out.println("Character at index 100: " + s1.charAt(100));
	}
	
	// Method to handle StringIndexOutOfBoundsException
	public static void handleException(String s1){
	   try{
	      System.out.println("Attempting to access invalid index within try block");
	      System.out.println("Character at index 100: " + s1.charAt(100));
	   } catch(StringIndexOutOfBoundsException e){
	      System.out.println("Exception caught: " + e.getMessage());
	   }
	 
	}

    
    public static void main(String[] args){
	     Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string: ");
		 String text = sc.nextLine();
		 
		 try{
		   generateException(text);
		 } catch(StringIndexOutOfBoundsException e){
		   System.out.println("Exception caught in main: " + e.getMessage());
		 }
		 
		 handleException(text);
	     sc.close();
	}


}