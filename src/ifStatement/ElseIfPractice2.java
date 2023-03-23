package ifStatement;

import java.util.Scanner;

public class ElseIfPractice2 {
    public static void main(String[] args) {

        /*
        get a number from user
        when the number is more thn zero --> "your number is positive number"
        when the number is less than zero --> "your number is negative number"
                                            > "your number must be ZERO"
         */
        System.out.println("Please enter an integer number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number <0 ){
            System.out.println("your number is negative number");
        } else if (number >0) {
            System.out.println("your number is positive number");
        } else {
            System.out.println("your number must be ZERO");
        }
    }
}
