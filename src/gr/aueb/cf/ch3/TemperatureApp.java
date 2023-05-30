package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζιε αν χιονίζει με βάση τη
 * θερμοκρασία, αν η θερμοκρασία ειναι μικρότερη απο 0
 * τότε χιονίζει , αλλιως δε χιονίζει.
 * Ο χρήστης δινει την θερμοκρασία.
 */

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSnowing = false;
        int temp =0;

        System.out.println("Please insert Temperature");
        temp =in.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }

}
