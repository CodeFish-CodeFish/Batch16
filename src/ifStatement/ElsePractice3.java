package ifStatement;

import java.util.Scanner;

public class ElsePractice3 {
    public static void main(String[] args) {
        /*
        ask user for their house number
        if the number is even number >> "your house should be on the right side of street"
                          otherwise >>  "you house should be on the left side of street"
        0,2,4,6,8
         */
        System.out.println("Please enter your house number");

        Scanner scanner = new Scanner(System.in);

        int houseNumber = scanner.nextInt();

        if (houseNumber % 2 == 0){
            System.out.println("your house should be on the right side of street");
        }else {
            System.out.println("your house should be on the left side of street");
        }






    }
}
