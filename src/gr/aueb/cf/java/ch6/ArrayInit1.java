package gr.aueb.cf.java.ch6;

import java.util.Arrays;

/**
 * Δήλωση και αρχικοποίηση ενός απλού πίνακα.
 */
public class ArrayInit1 {

    public static void main(String[] args) {
        int[] arr = new int[5];

        // Populate the array
        arr[0] = 1;
        arr[1] = 8;
        arr[2] = 5;
        arr[3] = 9;
        arr[4] = 7;

        System.out.println(Arrays.toString(arr));

    }
}
