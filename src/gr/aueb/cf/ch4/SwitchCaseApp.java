package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * switch instead of if-the-else-if
 * Gets a users choice based on a menu
 * and returns a feedback
 */
public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Please select one of the following");
            System.out.println("1.One player Game");
            System.out.println("2. Two-Players Game");
            System.out.println("3 Team Game");
            System.out.println("4. Quit");
            System.out.println("5. Please provide a choice");

            choice = in.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Start One player Game");
                    break;
                case 2:
                    System.out.println("Start Two players Game");
                    break;
                case 3:
                    System.out.println("Start Team Game");
                    break;
                case 4:
                    System.out.println("Quit Game");
                    break;
                default:
                    System.out.println("Error in choice");
            }
            }while (choice != 4) ;

            System.out.println("Goodbye");

        }
    }

