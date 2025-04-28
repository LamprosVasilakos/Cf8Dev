package gr.aueb.cf.java.ch6;
import java.util.Scanner;

public class ArraysAndMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int low = scanner.nextInt();
        int high = scanner.nextInt();

        printArray(arr, low, high);
    }

    public static void printArray(int[] arr, int low, int high){

        if (low < 0 || high > arr.length){
            return;
        }

        for (int i = low; i < high; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
