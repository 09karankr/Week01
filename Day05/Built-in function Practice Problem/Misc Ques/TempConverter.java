import java.util.Scanner;

public class TempConverter {
    public static double celsius2Fahrenheit(double celsius){
        return Math.round((celsius*(9.0/5) +32.0) *100.0)/100.0;
    }
    public static double fahrenheit2Celsius(double fahrenheit){
        return Math.round((fahrenheit - 32.0) * (5.0/9) * 100.0)/ 100.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature along with the unit C/F(Seperated  by space");
        double temp = sc.nextDouble();
        char unit = sc.next().toLowerCase().charAt(0);
        if(unit == 'c'){
            System.out.println(temp+" degree Celsius = "+celsius2Fahrenheit(temp)+" degree Fahrenheit");
        }
        else{
            System.out.println(temp+" degree Fahrenheit "+fahrenheit2Celsius(temp)+" degree Celsius");
        }

    }
}