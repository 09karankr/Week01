import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class GuessingGame {
    public static int guessedNumber(int high,int low){

        return low + (int) (Math.random()*(high - low +1));

    }
    public static void main(String[] args){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userInput = sc.nextInt();
        int high = 100,low = 1;

        int guess = guessedNumber(high,low);
        if(guess == userInput){
            System.out.println("Number predicted!!!");
            return;
        }
        while(true){


            System.out.println("Guessed Number is "+ guess+" Enter your feed back(low/high/equal)");
            String feedback = sc.next().trim();
            if(feedback.equals("low")){
                low = guess+1;
            }
            else if(feedback.equals("high")){
                high = guess -1;
            }
            else if(feedback.equals("equal")){
                System.out.println("Number predicted!!!");
                break;
            }
            else{
                System.out.println("Please provide valid feedback");
            }
            guess = guessedNumber(high,low);


        }
    }
}