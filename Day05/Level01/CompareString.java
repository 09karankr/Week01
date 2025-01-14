import java.util.Scanner;
 public class CompareString{
   public static boolean compare(String string1, String string2){
	        
          if(string1.length() != string2.length()){
		       return false;
			   
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
		System.out.println("Give two strings: ");
		String s1 = sc.next();
        String s2 = sc.next();
	    boolean compareResult = compare(s1,s2);
		System.out.println("String are compared with user defined function: " + compareResult);
		boolean result = s1.equals(s2);
		System.out.println("String are compared with built in function: " + result);
		sc.close();
        
   }


}