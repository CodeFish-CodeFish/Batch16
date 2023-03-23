package loops;

import java.util.Scanner;

public class WhilePractice3 {
    public static void main(String[] args) {
        /*
        get age of user
        >> print out his/her age for next 5 years<<

        "you will getting wiser >> age is: "

        "your age will be ... in 5 years"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        int limit = age + 5, year = 2023;
        while (age < limit){
            age++;
            year++;
            System.out.println("you are now "+ age +" years old in year "+ year);

        }
        System.out.println("your age will be "+ age +" in 5 years");


    }
}
