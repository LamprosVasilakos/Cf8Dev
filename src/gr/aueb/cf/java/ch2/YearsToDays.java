package gr.aueb.cf.java.ch2;

import java.util.Scanner;

/**
 * Εφαρμογή η οποία μετατρέπει την ηλικία
 * του χρήστη από έτη σε ημέρες.
 */
public class YearsToDays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputAge;
        int ageToDays;
        final int DAYS_PER_YEAR = 365;

        System.out.print("Παρακαλώ δώστε την ηλικία σας σε ακέραια έτη: ");
        inputAge = scanner.nextInt();
        ageToDays = inputAge * DAYS_PER_YEAR;

        System.out.printf("Η ηλικία σας είναι %d ημέρες", ageToDays);
    }
}
