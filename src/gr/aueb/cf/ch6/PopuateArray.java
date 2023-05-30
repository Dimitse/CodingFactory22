package gr.aueb.cf.ch6;

/**
 * Δήλωση αρχικοποίηση πινακα και
 * Populate(Εισαγωγή στοιχείων)
 */
public class PopuateArray {
    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση πίνακα με lenght 1ος Τρόπος
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 7;
        arr[2] = 8;
//        System.out.println(arr[0]+""+arr[1]+""+ arr[2];

        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        //Enchanced for
        for (int item :arr){
            System.out.print(item + " ");
        }

        //Unsized Initialaization 2ος Τρόπος

        int[] arr2 ={1, 5, 8, 9, 12};

        //Array Initializer
        int[] arr3 = new int[]{4, 6, 9, 10};

    }
}
