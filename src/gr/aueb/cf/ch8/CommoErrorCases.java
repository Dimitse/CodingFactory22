package gr.aueb.cf.ch8;

public class CommoErrorCases {
    public static void main(String[] args) {
        int []arr ={1, 2, 3, 4};
        int minPOsition;

        minPOsition =getMinPosition(arr);

        if (minPOsition==-1){
            System.out.println("Invalid Array");
        }else {
            System.out.println(minPOsition);

        }

    }public  static  int getMinPosition(int[]arr){
        if (arr == null)
            return -1; //common error case
        int minPosition =0;
        int minValue =0;

        for (int i = 0; i<arr.length;i++){
            if (arr[i]<arr[minPosition]){
                minPosition =i;
                minValue =arr[i];
            }
        }
        return minPosition;
    }
    public static String getStringorNUll(String[] strArr,String str){
        if (strArr == null || str == null)
            return null;
        String strToReturn = null;

        for (String s : strArr){
            if (s.contains(str)){
                strToReturn = s;
            }
        }return strToReturn;
    }
}
