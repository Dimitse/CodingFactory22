package gr.aueb.cf.ch7;

/**
 * Compares two String for equality.
 */
public class EqualsApp {
    public static void main(String[] args) {
        String s1 = "Athens";
        String s2 ="Athens";
        String s3 =new String("athens");


//        if(s1.equals(s3)){
//            System.out.println("EQUAL!!");

        if(s1.equalsIgnoreCase(s3)){
            System.out.println("EQUAL!!");
        }

    }
}
