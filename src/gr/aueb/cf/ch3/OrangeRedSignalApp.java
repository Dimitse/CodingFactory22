package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ένα αεροσκάφος έχει δύο δεξαμενές.
 * Αν μια δεξαμενή έχει λιγότερο από 1/4
 * καυμα τότε ανάβει πορτοκαλί σήμα, αν και οι δύο
 * δεξαμενές έχεουν <1/4 τότε ανάβει κοκκινο.
 *
 * Ο πιλότος(χρήστης) δίνει true ή false
 * ανάλογα αν tank <1/4 ή όχι,αντιστοιχα.
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTnQuarter  = false;
        boolean isTank2LTnQuarter  = false;
        boolean orangeOn = false;
        boolean redOn = false ;
        System.out.println("Plese insert if tank1, tank2 are less than 1/4");
        isTank1LTnQuarter = in.nextBoolean();
        isTank2LTnQuarter = in.nextBoolean();

        orangeOn = isTank1LTnQuarter || isTank2LTnQuarter;
        redOn = isTank1LTnQuarter && isTank2LTnQuarter;

        System.out.println("OrangeOn: " + orangeOn);
        System.out.println("RedOn: " + redOn);


    }
}
