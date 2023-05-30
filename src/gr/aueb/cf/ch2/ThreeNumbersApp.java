package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ζητάει από το χρήστη τρεις ακεραίους,
 * τους μειώνει κατ μια μονάδα και τους εμφανίζει
 * με την ίδια σειρά που δώθηκαν
 * αφήνοντας ένα κενό αναμε΄σα τους.
 */
public class ThreeNumbersApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.println("Please insert three Integers");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        //1.num1= num1 -1;
        //2.num1 -=1;
        //3.num1--; Τρεις τρόποι είναι το ίδιο.

        num1--;
        num2--;
        num3--;

        System.out.printf("%d %d %d",num1, num2, num3);

    }

}
