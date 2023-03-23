package ifStatement;

import java.util.Scanner;

public class ElsePractice5 {
    public static void main(String[] args) {
        /*
        a student will have 3 test from a class
        to pass the class student's average of those 3 tests has to be 70 or more
        and student's attendance for the class also has to be 80 percent or more

        -get those three test scores and attendance rate from user
        -calculate average score and let student know  for his/her final result

        "You are eligible to pass this class" OR "Try again"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("To determine your final status for this class, we need followings from you:" +
                "three test scores and your attendance rate");
        System.out.println("Please enter your attendance rate out of 100");
        int attendance = scanner.nextInt();

        System.out.println("Please enter your first test score");
        int test1 = scanner.nextInt();
        System.out.println("Please enter your second test score");
        int test2 = scanner.nextInt();
        System.out.println("Please enter your third test score");
        int test3 = scanner.nextInt();

        int testAverage = (test1+test2+test3) / 3;

        if ( testAverage >=70 && attendance >=80){

            System.out.println("You are eligible to pass this class");
        }else {
            System.out.println("Try again");
        }

    }

}
