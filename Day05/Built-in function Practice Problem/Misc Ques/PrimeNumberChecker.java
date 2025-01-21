import java.util.Scanner;

public class PrimeNumberChecker {
    public static int getNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        sc.close();
        return num;
    }
    public static boolean isPrime(int num){
        int count = 1;
        for (int i = 1; i <= num/2; i++) {

            if(num%i == 0)
                count++;
        }
        return count == 2? true:false;
    }
    public static void getResult(int num){
        if(isPrime(num))
            System.out.println("Yes "+num+" is a Prime Number");
        else
            System.out.println("No "+num+" is not a Prime Number");

    }
    public static void main(String[] args){
        //get the input of the number
        int num = getNumber();
        getResult(num);
    }

}