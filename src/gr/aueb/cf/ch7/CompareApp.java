package gr.aueb.cf.ch7;

/**
 * Compares two Strings.
 */
public class CompareApp {
    public static void main(String[] args) {

    String s1 = "Athens";
    String s2 = "Athens";

    if(s1.compareTo (s2 )<0){
        System.out.println("s1 lt s2");

    }else if(s1.compareTo(s2)> 0){
        System.out.println("s1 gt s2");

    }else{
        System.out.println("s1 ep s2");

    }
}
}

