package loops;

import java.util.Scanner;

public class DoWhilePractice2 {
    public static void main(String[] args) {
        /*
        do while loop
         get two numbers from user and find the sum of numbers between those given numbers
         ex: n1 = 5, n2 = 8
                5 + 6 + 7 + 8 = 26
                "the total is ..26.."
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your two integer numbers to find the sum in the range");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int total = 0;
        do {
            System.out.println(number1);

            total = total + number1;

            number1++;

        }while( number1 <=number2  );

        System.out.println("The total is: "+ total);
    }
}
