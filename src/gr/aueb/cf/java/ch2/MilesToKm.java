package gr.aueb.cf.java.ch2;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputMiles = 0.0;
        double kilometers = 0.0;
        final double KM_PER_MILE = 1.6;

        System.out.print("Παρακαλώ εισάγετε μίλια: ");
        inputMiles = scanner.nextDouble();
        kilometers = inputMiles * KM_PER_MILE;
        System.out.printf("Τα %.2f μίλια είναι %.2f χιλιόμετρα.", inputMiles, kilometers);
    }
}
