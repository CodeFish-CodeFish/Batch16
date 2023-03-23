package ifStatement;

import java.util.Scanner;

public class NestedIfPractice3 {
    public static void main(String[] args) {
        /*
        ------------------------TASK-----------------------------------
        Illinois requires vehicles to get inspected for every other year
        if your car's year is even it will be inspected next year(2024)
        if your car's year is odd, it will be inspected this year(2023)
        when your car inspected this year your options are
          DMV office OR nearest FireStone store location depending on your home distance to DMV
            -you can go to nearest FireStone store if DMV distance is 5 miles or more from home
          when you are in the DMV inspection is FREE of charge
          when you go to FireStone inspection is $30 plus %10 tax.
         Let user know about their payment based on their provided information
        if the inspection falls into next year
          Let user that "wait for another year for inspection"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("What year is your car?");
        int year = scanner.nextInt();

        if (year % 2 == 0) {
            System.out.println("Please wait for another year");
        } else {

            System.out.println("how far is your house from DMV?");
            int distance = scanner.nextInt();

            if (distance >= 5) {
                double payment = 30 + (30 * 0.10);

                System.out.println("You can go to FireStone, so payment will be: $" + payment);
            } else {
                System.out.println("You can go toDMV for FREE, since you are close to DMV");
            }

        }
    }
}
