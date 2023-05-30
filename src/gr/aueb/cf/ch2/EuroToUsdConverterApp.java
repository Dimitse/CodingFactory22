package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει euros σε δολάρια ΗΠΑ.
 * Λαμβάνει από το χρήστη ένα ακέραιο
 * που συμβολίζει το ποσό σε Euros και μετατρέπει
 * σε δολάρια και εμφανίζει το αποτέλεσμα.
 */
public class EuroToUsdConverterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Δήλωση και αρχικοποίηση
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        //Εντολές
        System.out.println("Pllease instert an amount in Euros");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτύπωση αποτελεσμάτων
        System.out.printf("%d Euros= %d Usa Dollars %d Usa Cents ",inputEuros, usaDollars,usaCents);


    }
}
