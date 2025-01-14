import java.util.Scanner;
public class StringToCharArrayComparison{
  public static char[] getCharacter(String text){
         char[] result = new char[text.length()];
         for(int i=0; i< text.length(); i++){
		     result[i] = text.charAt(i); 
			
		 }
		 return result;
  
  }
  public static boolean CompareCharArray(char[] array1, char[] array2){
      if(array1.length!=array2.length){
	    return false;
	  }
	  for(int i=0; i<array1.length; i++){
	    if(array1[i] != array2[i]){
		   return false;   // Return false if all characters does not match.
		}
	  }
      return true;    // Return true if all characters match.
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string: ");
	String text = sc.next();
	char[] customCharArray = getCharacter(text);
	char[] builtInCharArray = text.toCharArray();
	boolean areEqual = CompareCharArray(customCharArray,builtInCharArray);
	
	
    // Displaying the results
    System.out.println("Characters using custom method: " + String.valueOf(customCharArray));
    System.out.println("Characters using built-in toCharArray(): " + String.valueOf(builtInCharArray));
    System.out.println("Are the character arrays equal? " + areEqual);

    sc.close();
   
  }

}