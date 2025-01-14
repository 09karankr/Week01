import java.util.Scanner;
public class SubstringComparison{

   public static String MakeSubstring(String text, int start, int end){
        String result = "";
		for(int i = start; i<end; i++){
		    result = result + text.charAt(i);
		}
		return result;
   }
   public static boolean compareSubstring(String string1, String string2){
      if(string1.length() != string2.length()){
	       return false;   // Strings of different lengths can't be equal.
	  }
	  for(int i=0; i<string1.length(); i++){
	      if(string1.charAt(i) != string2.charAt(i)){
		          return false;
		  }
	   
	  }
	  return true;
	  
		  
   }
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the String: ");
     String text = sc.next();
	 System.out.println("Enter the start index: ");
	 int start = sc.nextInt();
	 System.out.println("Enter the end index: ");
	 int end = sc.nextInt();
	 
	  // Validating indices
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid indices. Please make sure 0 <= start < end <= length of the string.");
            sc.close();
            return;
        }
		
		String customSubstring = MakeSubstring(text, start, end);
		String builtInSubstring = text.substring(start,end);
		
		boolean areEqual = compareSubstring(customSubstring, builtInSubstring);
		
		System.out.println("Substring created using custom method: " + customSubstring);
        System.out.println("Substring created using built-in method: " + builtInSubstring);
        System.out.println("Are the substrings equal? " + areEqual);

        sc.close();
	 
	 
	 
	 
   
   }
}