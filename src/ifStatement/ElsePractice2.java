package ifStatement;

import java.util.Scanner;

public class ElsePractice2 {
    public static void main(String[] args) {
        /*
        ask user that if s/he has driver license
        -when the answer is like "yes, yes I have.." >>> print >> "you are great!"
        -otherwise print >> "DMV is next door, please visit";
         */

        System.out.println("Do you have driver license? yes/no");

        Scanner scanner = new Scanner(System.in);

        String response = scanner.nextLine();
        response = response.toLowerCase();

        if (response.equalsIgnoreCase("yes") || response.contains("YES")|| response.contains("yes") ){

            System.out.println("you are great");

        }else {
            System.out.println("DMV is next door, please visit");
        }

    }
}
