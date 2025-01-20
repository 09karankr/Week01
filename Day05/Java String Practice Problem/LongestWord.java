import java.util.Scanner;

public class LongestWord {
    public static String getLongestWord(String sentence){
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+"); // Split the sentence into words
        String longest = "";

        for (String word : words) {
            
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "");
            if (cleanedWord.length() > longest.length()) {
                longest = cleanedWord;
            }
        }

        return longest;
    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String s = sc.nextLine();
        String  ans = getLongestWord(s);
        System.out.println("The longest word is "+ans);
    }
}