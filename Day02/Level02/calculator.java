import java.util.Scanner;
import java.lang.Math;
public class calculator{

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = sc.nextDouble();
        System.out.println("Enter the second number");
        double b = sc.nextDouble();
        System.out.println("Enter the operator");
        char operator = sc.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            
            default:
                System.out.println("Please enter the valid character");
        }
    }
}
