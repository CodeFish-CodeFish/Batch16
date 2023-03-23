package scannerPractice;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {

        //
        Scanner scanner = new Scanner(System.in);
        // David White --> DW
        // take first initial
        // take last initial of user's first and last name

        System.out.println("What is your fist Name?");

        char firstInitial = scanner.nextLine().charAt(0); // David

        System.out.println("first initial is " + firstInitial);

        System.out.println("Please enter your lastname");

        char secondInitial = scanner.nextLine().charAt(0);
        System.out.println("last initial is " + secondInitial);

        //nextLine(); --> using to take text(can be a long sentence as a whole)
        //next();--> using to take text(it will take text until first space)

        System.out.println("Please enter your full address");

        String address = scanner.next();

        System.out.println( address);

    }
}
