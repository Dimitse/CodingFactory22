package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NUmberFormatExcept2App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr="";
        int inputNUm=0;

        System.out.println("PLease insert an int");
            inputStr = in.nextLine();

            if (isInt(inputStr)){

            }
            inputNUm = Integer.parseInt(inputStr);
            System.out.println("input num:" + inputNUm);

        }
        public static boolean isInt(String s){
        try{
            Integer.parseInt(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
        }
    }


