
import java.util.Scanner;

public class SalaryBonuses {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary of employee ");
        double salary = sc.nextDouble();

        System.out.print("Enter year of service ");
        int ServiceYears = sc.nextInt();

        double bonus = 0;

      
        if (ServiceYears > 5) {
            bonus = salary * 0.05;  
            System.out.println("The employee's bonus is: " + bonus);
        } else {
            System.out.println("The employee is not eligible for a bonus.");
        }

    
        sc.close();
	}
}