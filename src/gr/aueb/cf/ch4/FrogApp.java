package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ένας μικρος βάτραχος θέλει να περάσει
 * ένα ποταμι.Ο frog έστω ρίσκεται στη θέση Χ και θέλει
 * να φτάσει στη θέση Υ(ή σε κάποια θέση μεγαλύτερη). Ο frog
 * jumps a fixed distance D.
 *
 * Bρίσκει τον ελάχοστο αριθμό jumps που ο frog πρέπει να κάνει
 * ώστε να φτασει ή να προσπερασει τον στόχο.
 *
 * π.χ.
 * Χ = 10
 * Υ = 85
 * D = 30
 * ΘΑ ΧΡΕΙΑΣΤΕΙ 3 JUMPS.
 *
 * 10-->40-->70--> 100
 */

//
public class FrogApp {
//
//    public static void main(String[] args) {
//
//        int x =0 ;
//        int y = 0;
//        int d = 0;
//        int iterations =0;
//
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please give x ,y ,d");
//        x = in.nextInt();
//        y = in.nextInt();
//        d = in.nextInt();
//
//
//        for (int i= x ;i < y; i= i+d){
//            iterations++;
//        }
//        System.out.println(iterations);


    public static void main(String[] args) {
        float jumps =0;
        int x =10;
        int y = 85;
        int d = 30;

        jumps = (int) Math.ceil((y-x)/(float) d);

        System.out.println("Jumps: "+ (int)jumps);
    }



    }

