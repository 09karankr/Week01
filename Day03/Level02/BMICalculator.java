import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = sc.nextInt();

        double[] heights = new double[numberOfPersons];
        double[] weights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] statuses = new String[numberOfPersons];

        // Take input for height and weight of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height in meters for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            System.out.print("Enter weight in kilograms for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();

            // Calculate BMI
            bmis[i] = weights[i] / (heights[i] * heights[i]);

            // Determine weight status based on BMI
            statuses[i] = getWeightStatus(bmis[i]);
        }

        System.out.println("\nResults:");
        System.out.println("Person\tHeight (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n", (i + 1), heights[i], weights[i], bmis[i], statuses[i]);
        }

        sc.close();
    }

    // Method to determine weight status based on BMI
    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
