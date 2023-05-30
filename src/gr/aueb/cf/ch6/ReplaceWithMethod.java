package gr.aueb.cf.ch6;

/**
 * Updates the elements of an array.
 */
public class ReplaceWithMethod {
    public static void main(String[] args) {

    }
    public static void upscaleByOne(int[] arr){
        for (int i =0; i<arr.length; i++){
            arr[i] +=1;
        }
    }
    public static void PrintArray(int[] arr){
        for (int item : arr){
            System.out.print(item + "");
        }
    }
}
