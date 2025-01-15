import java.util.Scanner;
 
   public class ConvertToUppercaseProgram{
        public static String ConvertStringToUpperCase(String text){
		  StringBuilder result = new StringBuilder();
		  for(int i=0; i<text.length(); i++){
		      char ch = text.charAt(i);
			  if(ch >= 'a' && ch <= 'z'){
			      ch = (char) (ch-32);
			  }
			   result.append(ch);
		  }
		 
		return result.toString();
	}
   
    public static boolean compareStrings(String str1, String str2){
	      if(str1.length() != str2.length()){
		     return false;
		  
		  }
		  for(int i = 0; i < str1.length(); i++){
		    if(str1.charAt(i) != str2.charAt(i)){
			     return false;
			
			}
		  
		  }
	      return true;
	}       
  
  
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the text: ");
	   String name = sc.nextLine();
	   String upperCaseTextBuiltIn = name.toUpperCase();
	   String upperCaseTextCustom = ConvertStringToUpperCase(name);
	   boolean areEqual = compareStrings(upperCaseTextBuiltIn, upperCaseTextCustom);
	  
	  System.out.println("Uppercase using built-in method: " + upperCaseTextBuiltIn);
        System.out.println("Uppercase using custom method: " + upperCaseTextCustom);
        System.out.println("Are both uppercase results equal? " + areEqual);
    }
	}