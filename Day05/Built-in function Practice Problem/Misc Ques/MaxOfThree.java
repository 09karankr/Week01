import java.util.Scanner;

public class MaxOfThree {
    public static int[] getNumbers(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;

    }
    public static int maximumNumber(int[] arr){
        if(arr[0] > arr[1] && arr[0] > arr[2])
            return arr[0];
        else if(arr[1] > arr[0] && arr[1] > arr[2])
            return arr[1];
        return arr[2];
    }
    public static void main(String[] args){
        // Taking input from the user and storing in a array
        int[] number = getNumbers();
        int maximum = maximumNumber(number);
        System.out.println("The maximum number is: "+maximum);
    }
}