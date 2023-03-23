package scannerPractice;

import java.util.Scanner;

public class Practice2 {

    public static void main(String[] args) {


        Scanner dataTaker = new Scanner(System.in);

        // take name of school  and batch number separately from user
        // concatenate the school name with batch number
        // print --> "you should be in ..school+batch... right now"

        System.out.println( "What is your school name?");

        String schoolName =   dataTaker.nextLine();

        System.out.println("What is batch number?");

        // taking batch number as a String in following implementation
        String batchNumber = dataTaker.nextLine();

        System.out.println("you should be in " + schoolName+" "+ batchNumber+ "." );

        //taking batch number as an integer in following implementation

        System.out.println("What is batch number, again?");

        int batchNumber2 = dataTaker.nextInt();
        System.out.println( batchNumber2 * 2);

        // take age of user and tell him/her that s/he will be in ... age in 10 years
        System.out.println("What is your age");
        int age = dataTaker.nextInt();

        System.out.println(  "You will be in age of "+(age+10)+ " in 10 years !!" );

    }
}
