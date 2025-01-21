import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i))
                return false;

        }
        return true;
    }
    public static void printer(String s){
        if(isPalindrome(s))
            System.out.println("Yes its a Palindrome");
        else
            System.out.println("No its not a Palindrome ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word/phrase/sequence");
        String s = sc.nextLine().trim();
        printer(s);
    }
}