package gr.aueb.cf.ch6;

public class MissingArrayElement {
    public static void main(String[] args) {

    }
    public static int findMissing(int[] arr) {
  int n = arr.length + 1;
  int sum = (n * (n + 1)) / 2;
   int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {

    arrSum +=arr[i];
    }
        return sum -arrSum;
    }



}
