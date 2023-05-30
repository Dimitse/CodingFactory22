package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10,9,8...1
 * αστεράκι(α) σε κάθε γραμμή
 * ξεκινώνατς από την πρώτη γραμμη.
 */
public class Stars10Desc {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
//            for (int j = 10; j >=i; j--)
             for(int j = i; j <=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
