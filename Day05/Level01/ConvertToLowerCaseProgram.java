import java.util.Scanner;
 
   public class ConvertToLowerCaseProgram{
        public static String ConvertStringToLowerCase(String text){
		  StringBuilder result = new StringBuilder();
		  for(int i=0; i<text.length(); i++){
		      char ch = text.charAt(i);
			  if(ch >= 'A' && ch <= 'Z'){
			      ch = (char) (ch+32);
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
	   String lowerCaseTextBuiltIn = name.toLowerCase();
	   String lowerCaseTextCustom = ConvertStringToLowerCase(name);
	   boolean areEqual = compareStrings(lowerCaseTextBuiltIn, lowerCaseTextCustom);
	  
	  System.out.println("Lowercase using built-in method: " + lowerCaseTextBuiltIn);
        System.out.println("Lowercase using custom method: " + lowerCaseTextCustom);
        System.out.println("Are both Lowercase results equal? " + areEqual);
    }
	}