package gr.aueb.cf.ch10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Lotto5App {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(new File("C:/tmp/lotto5in.txt"));
            PrintStream ps = new PrintStream("C:/tmp/lotto5out.txt", StandardCharsets.UTF_8)){

            final int LOTTO_SIZE = 5;
            int[] inputNUmbers =new int[49]; //to megisto pou mporei na dwsei 49
            int pivot =0;  //o pivot tha deixnei stin proti eleytheri (teleutaio + 1)
            int [] result = new int[5];
            int num; // gia na diavazw enan enan ts arithmous ap t arxeio.
            int window;

            while ((num = in.nextInt()) != -1 && pivot <= 48 ){
                inputNUmbers[pivot++] = num;
//                pivot++;
            }

            int[] numbers = Arrays.copyOfRange(inputNUmbers,0,pivot); //kanoume copy
            Arrays.sort(numbers);

            window =pivot - LOTTO_SIZE;

            for (int i=0;i <= window;i++){
                for (int j = i +1;j <= window + 1;j++){
                    for (int k = j+1;k <= window +2;k++){
                        for (int l = k+1;l <= window + 3;l++){
                            for (int m =l +1;m <= window +4;m++){
                                result[0] = numbers[i];
                                result[1] = numbers[j];
                                result[2] = numbers[k];
                                result[3] = numbers[l];
                                result[4] = numbers[m];

                                //periorismos na min uparxoun panw apo 3 peritoi kai treis zigoi tautoxrona.
                                if (!isEvenGE(result,3)&& !isOddGE(result,3)){
                                    ps.printf("%d %d %d %d %d \n",result[0],result[1],result[2],result[3],result[4]);
                                }
                                System.out.printf("%d %d %d %d %d \n",result[0],result[1],result[2],result[3],result[4]);
                            }
                        }
                    }
                }
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Returns true if the number of evens is greater or equal
     * to a threshold limit.
     *
     * @param arr the input array
     * @param threshold the upper limit of constraint.
     * @return tru, if the number of envens is greater than or equal
     * to a threhold limit,otherwise false.
     */
    public static boolean isEvenGE(int[] arr,int threshold){
//        threshold posa ziga theleis
        int even = 0;

        for (int num : arr ){
            if (num % 2 ==0)even++;
        }
        return even > threshold;
    }
    public static boolean isOddGE(int[] arr,int threshold){
//        threshold posous peritous theleis
        int odd = 0;

        for (int num : arr ){
            if (num % 2 !=0)odd++;
        }
        return odd > threshold; // >= tha itan kalutera na valoume an theloume ontws na isoutai.

    }
}
