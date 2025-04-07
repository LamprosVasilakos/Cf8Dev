package gr.aueb.cf.java.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα διψήφιο ακέραιο και το πρόγραμμα
 * υπολογίζει το άθροισμα των ψηφίων του ακεραίου.
 * π.χ για το 32 έχουμε 3 + 2 = 6.
 */
public class DigitsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int sumOfDigits = 0;
        int inputNum = 0;

        System.out.print("Παρακαλώ εισάγεται ένα διψήφιο ακέραιο: ");
        inputNum = scanner.nextInt();

        leftDigit = inputNum / 10;
        rightDigit = inputNum % 10;
        sumOfDigits = leftDigit + rightDigit;

        System.out.printf("Το άθροισμα των ψηφίων του %d είναι %d + %d = %d", inputNum, leftDigit, rightDigit, sumOfDigits);
    }
}
