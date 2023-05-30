package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * makes an array copy by using
 * utility methods.
 */
public class ArrayCopyApp {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};
        int[] arr3 ;

        //System.arraycopy
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        //Arrays class
        arr3 = Arrays.copyOf(arr1,arr1.length);
        arr3 = Arrays.copyOfRange(arr1, 0, arr1.length);

    }
}
