package scannerPractice;

import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        /*
        David wants to deposit his money into his bank account
    -he
    -he got three different paychecks ($480, $600 and $350)
    -he can only deposit one paycheck at a time
    -after he got all his money in the account
    - he bought a phone for $599 and headphone for $299.90
    - calculate his final money in the account
    ==> tell him how much left <===
         */
        Scanner scanner = new Scanner(System.in);
        double balance = 200;
        System.out.println("Please enter your first paycheck amount?");
        double firstCheck = scanner.nextDouble();
        System.out.println("Please enter your second paycheck amount?");
        double secondCheck = scanner.nextDouble();

        System.out.println("Please enter your third paycheck amount?");

        double thirdCheck = scanner.nextDouble();
        balance += scanner.nextDouble();

        balance = balance + firstCheck + secondCheck + thirdCheck;

        System.out.println("How much is phone price?");
        double phone$ = scanner.nextDouble();

        System.out.println("How much is head phone price?");
        double headPhone$ = scanner.nextDouble();

        balance = balance - (phone$ + headPhone$);
        System.out.println("Hey David, your final balance is " + balance);



//        String str = scanner.nextLine();
//
//        System.out.println("*************"+str+"******************");


    }
}
