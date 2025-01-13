import java.util.Scanner;

public class OddEvenAraay {
    public static void main(String[] args) {
  // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number");
int number =  scanner.nextInt();
int size = (number/2) +1;
        // Create an array to store up values
        int[] odd = new int[size];
        int[] even = new int[size];
int indexOdd=0,indexEven=0;
      for(int i=1;i<number+1;i++){
if(i%2==0){
even[indexEven++]=i;
}
else
{
odd[indexOdd++]=i;

}
}
     

        // Display the odd even arrays
        System.out.println("Print even array :");

for(int i=0;i<size;i++)
        System.out.print(even[i] + " ");


        System.out.println("\nPrint odd array :");

for(int i=0;i<size;i++)
        System.out.print(odd[i] + " ");
        // Close the scanner
        scanner.close();
    }
}

