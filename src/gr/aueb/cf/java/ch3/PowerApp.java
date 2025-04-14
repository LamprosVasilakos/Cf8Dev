package gr.aueb.cf.java.ch3;

import java.io.Console;
import java.util.Scanner;

/**
 * Λαμβάνει από το χρήστη δύο ακεραίους και
 * υπολογίζει με επαναληπτικό  τρόπο τη δύναμη
 * έστω base^power και εκτυπώνει το αποτέλεσμα
 * Π.χ αν base = 2 και power = 10, τότε το αποτέλεσμα
 * είναι 1024.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Παρακαλώ εισάγετε τον base ");
        base = scanner.nextInt();
        System.out.println("Παρακαλώ εισάγετε τον power ");
        power = scanner.nextInt();

        while( power > 0 )
        {
            result *= base;
            power--;
        }

        System.out.println("Το αποτέλεσμα είναι " + result);




    }
}
