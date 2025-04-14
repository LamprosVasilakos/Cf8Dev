package gr.aueb.cf.java.ch3;
import java.util.Scanner;


/**
 * Υπολογίζει με επαναληπτικό τρόπο το παραγοντικό του n.
 * Όπου n ένας ακέραιος που εισάγει ο χρήστης.
 */
public class FactorialApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int result = 1;

        System.out.println("Παρακαλώ είσαγεται έναν ακέραιο αριθμό:");
        n = scanner.nextInt();

        while ( n > 0 )
        {
            result *= n;
            n--;
        }

        System.out.println("Το παραγοντικό του n είναι " + result);
    }
}
