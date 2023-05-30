package gr.aueb.cf.ch8;

import java.util.Scanner;

public class NumberFormatExeptApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr="";
        int inputNUm=0;

try{System.out.println("PLease insert an int");
    inputStr = in.nextLine();
    inputNUm = Integer.parseInt(inputStr);
    System.out.println("input num:" + inputNUm);

}catch (NumberFormatException e){
//    e.printStackTrace();
    System.out.println("Error in input");
}

    }
}
