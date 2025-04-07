package gr.aueb.cf.java.ch2;

/**
 * Προσομειώνει τη ρήψη ενός ζαριού.
 */
public class RandomApp {
    public static void main(String[] args) {
        int die = 0;
        die = (int) (Math.random()*6) + 1;
        System.out.printf("Έφερες %d.",die);
    }
}
