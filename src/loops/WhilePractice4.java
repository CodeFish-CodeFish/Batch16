package loops;

import java.util.Scanner;

public class WhilePractice4 {
    public static void main(String[] args) {

        // infinite loop
 //       int number =1;
//        while (number == 1){
//            System.out.println("HI");
//        }

        /*
        Get an integer number from user and find divisors of that given number, show those divisors

       10 >> 1, 2, 5, 10
       15 >> 1, 3, 5, 15
    13 >> 1, 13 >> 13 is a prime number
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int number = scanner.nextInt();
        int divisor = 1;

        while (divisor <= number){

            if (number % divisor ==0){

                System.out.println(divisor +" is a divisor of "+number);
            }

            divisor++;
        }

    }
}
