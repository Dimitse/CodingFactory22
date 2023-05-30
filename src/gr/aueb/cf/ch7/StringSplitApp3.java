package gr.aueb.cf.ch7;

/**
 * Splits a string.
 */
public class StringSplitApp3 {
    public static void main(String[] args) {
        String s ="Athens   Uni of Econ and Business";

        String[] tokens =s.split(" "); // keno+, ;+

        for (String token : tokens){
            System.out.println(token);
        }
    }
}
