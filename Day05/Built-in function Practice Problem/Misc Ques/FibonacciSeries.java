import java.util.Scanner;

public class FibonacciSeries {
    public static int[] series(int size){
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < size; i++) {
            arr[i] = arr[i-1] +arr[i-2];
        }
        return arr;
    }
    public static void printSeries(int size){
        int[] fibSeries = series(size);
        System.out.println("The fibonacci Series upto "+size+" numbers are: ");

        for (int i = 0; i < fibSeries.length; i++) {
            System.out.print(fibSeries[i]+" ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size = sc.nextInt();
        printSeries(size);
    }
}