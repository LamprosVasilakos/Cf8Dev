package gr.aueb.cf.java.ch2;

import java.util.Scanner;

/**
 * Εφαρμογή που δέχεται την ακτίνα ενός κύκλου και
 * επιστρέφει το εμβαδό του.
 */
public class AreaOfCircle {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int radius;
    double circleArea = 0.0;

    System.out.print("Παρακαλώ δώστε την ακτίνα του κύκλου: ");
    radius = scanner.nextInt();
    circleArea = Math.PI * Math.pow(radius,2);

    System.out.printf("Το εμβαδό του κύκλου με ακτίνα %d είναι %f.", radius, circleArea);
    }
}
