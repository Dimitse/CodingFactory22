package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει ή οχι με βάση όχι
 * μονο την θερμοκρασία αλλα
 * και το αν βρέχει.Αν βρέχει και η θερμοκρασία
 * είναι <0 τότε χιονίζει, αλλιως όχι.
 */

public class SnowingApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        boolean isRaining = false;
        int temp = 0;

        System.out.println("Please insert if it is raining(true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please onsert temperature (int)");
        temp = in.nextInt();

        isSnowing = isRaining && (temp < 0);

        System.out.println("Is snowing:" + isSnowing);

    }
}
