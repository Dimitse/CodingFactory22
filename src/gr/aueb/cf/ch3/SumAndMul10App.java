package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το αθροισμα και
 * το γινόμενο των 10 πρώτων ακεραίων.
 */
public class SumAndMul10App {
    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i =1 ;

        while (i <= 10){
            sum = sum + i; // Επίσης sum += i
            mul = mul * i; //Επίσης mul *= i
            i++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Mul: " + mul);
    }
}
