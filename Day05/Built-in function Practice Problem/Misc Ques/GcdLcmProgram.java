import java.util.Scanner;

public class GcdLcmProgram {
    public static int getGCD(int num1, int num2){
        while(num2 != 0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }
    public static int getLCM(int num1, int num2){
        int gcd = getGCD(num1,num2);
        return (num1*num2) / gcd;
    }

    public static void main(String[] args) {
        // Created a scanner for inputs
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int gcd = getGCD(num1,num2);
        int lcm = getLCM(num1,num2);
        System.out.println("GCD of "+num1+" and "+num2+" = "+gcd);
        System.out.println("LCM of "+num1+" and "+num2+" = "+lcm);

    }
}