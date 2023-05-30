package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει ώρες, λεπτά και δευτερα και
 * μετατρέπει σε δευτερόλεπτα.
 */
public class SecondsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intputHours =0;
        int inputMinutes =0;
        int inputsSeconds = 0;
        int totalSeconds = 0;
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        System.out.println("Please insert hours,minutes and seconds");
        intputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputsSeconds = in.nextInt();

        totalSeconds = intputHours * SECONDS_PER_HOUR + inputMinutes * SECONDS_PER_MINUTE + inputsSeconds;

        System.out.printf("%d hours, %d minutes,%d seconds = %d total seconds",
                intputHours,inputMinutes,inputMinutes, totalSeconds);




    }
}
