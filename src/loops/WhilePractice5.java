package loops;

import java.util.Scanner;

public class WhilePractice5 {
    public static void main(String[] args) {

        /*
        get an integer from user
         for that number, create a times table like:
         number --> 4
         4 * 1 = 4
         4 * 2 = 8
         ...
         4 * 10 = 40
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = scanner.nextInt();
        int multiplier = 1;

        while (  multiplier <=10  ){

            System.out.println( number +" * "+ multiplier +" = "+ number * multiplier );
            multiplier++;

        }


    }
}
