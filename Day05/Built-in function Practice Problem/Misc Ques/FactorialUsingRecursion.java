import java.util.Scanner;

public class FactorialUsingRecursion {
    public static long factorial(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        return (long)(num * factorial(num-1));
    }
    public static int getNumber(){
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        return num;

    }
    public static void printer(int num){
        long factorialValue = factorial(num);
        System.out.println("The factorial of "+num +" = "+factorialValue);
    }

    public static void main(String[] args) {
        int number = getNumber();
        printer(number);
    }
}