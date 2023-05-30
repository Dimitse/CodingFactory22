package gr.aueb.cf.ch10;

/**
 * Finds the second min of an array of Integers.
 */

public class ProjectCh6SecondMin {
    public static void main(String[] args) {

    }
    public static int getSecondMinPOsition(int[] arr){
        int min =0;
        int secondMin =0;
        int minValue =0;
        int secondMInValue =0;

        if (arr == null)return -1;
        if (arr.length < 2)return -1;

        minValue =arr[0];
        secondMInValue= arr[1];

        for (int i= 0;i < arr.length;i++){
            if (arr[i]< minValue && arr[i] < secondMInValue){
                secondMin =min;
                secondMInValue =minValue;
                min =i;
                minValue =arr[i];
            }else if (arr[i]> minValue && arr[i] <secondMInValue){
                secondMin =i;
                secondMInValue =arr[i];

            }
        }return secondMin;

    }
}
