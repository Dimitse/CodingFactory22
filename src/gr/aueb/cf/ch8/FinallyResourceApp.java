package gr.aueb.cf.ch8;

import java.util.Scanner;
import java.util.InputMismatchException;

public class FinallyResourceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        try {
            num= in.nextInt();
            System.out.println(num);

        }catch (InputMismatchException e){
            e.printStackTrace();
        }finally {
            try{
               if (in != null)in.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
