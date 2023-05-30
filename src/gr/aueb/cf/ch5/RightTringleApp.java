package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Λαμβάνει 3 τιμές από το χρήστη a,b,c
 * a η υποτείνουσα και b,c οι δ΄υο πλευρές.
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο
 * δηλαδη a^2==b^2+c^2
 */
public class RightTringleApp {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double a,b,c ;
    final double EPSILON = 0.000005;
    boolean isRight = false;

    System.out.println("Please insert a,b,c (doubles)");
    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();

    if(Math.abs(a * a- b * b - c * c) <= EPSILON) {
        System.out.println("Ορθογώνιο");
    } else {
        System.out.println("Οχι ορθογώνιο");
    }
}
}
