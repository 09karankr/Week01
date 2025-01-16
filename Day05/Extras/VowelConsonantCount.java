import java.util.Scanner;
public class VowelConsonantCount{

     public static String checkCharacters(char ch){
	    ch = Character.toLowerCase(ch);
		if(ch>='a' && ch <= 'z'){
		    if(ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u'){
			    return "Vowel";
			} else {
			   return "Consonant";
			}
		
		}
		return "Not a letter";
	 
	 }
     public static int[] findVowelsAndConsonants(String str){
	        int vowelCount =0;
			int consonantCount =0;
			for(int i =0; i<str.length(); i++){
			   char ch = str.charAt(i);
			   String result = checkCharacters(ch);
			   if(result.equals("Vowel")){
			       vowelCount++;
			   } else if (result.equals("Consonant")){
			        consonantCount++;
			   }
			}
			return new int[]{vowelCount, consonantCount};
	 
	 }
	 public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
	    int[] counts = findVowelsAndConsonants(input);
		// Displaying the result
		System.out.println("Number of vowels: " + counts[0]);
		System.out.println("Number of Consonant: " + counts[1]);
		
		sc.close();
	 }


}