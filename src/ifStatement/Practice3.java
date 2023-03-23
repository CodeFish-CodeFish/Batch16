package ifStatement;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        /*
        -Ask user to enter first letter of the day
        Ask user to enter first letter of the day
        if the letter is: M print "your day is Monday"
        if the letter is: T print "your day is Tuesday or Thursday"
        if the letter is: W print "your day is Wednesday"
        if the letter is: F print "your day is Friday"
        if the letter is: S print "your day is Saturday or Sunday"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first letter of a day");
        String str = "" + scanner.nextLine().charAt(0);
        //char ch = scanner.nextLine().charAt(0);
        System.out.println(str);

        if (str.equalsIgnoreCase("m")){
            System.out.println("your day is Monday");
        }
        if (str.equalsIgnoreCase("t")){
            System.out.println("your day is Tuesday or Thursday");
        }
        if (str.equalsIgnoreCase("W")){
            System.out.println("your day is Wednesday");
        } if (str.equalsIgnoreCase("F")){
            System.out.println("your day is Friday");
        } if (str.equalsIgnoreCase("s")){
            System.out.println("your day is Saturday or Sunday");
        }

        // when user enters none of the expected >> "Not a valid entry"

        if (!(str.equalsIgnoreCase("m") || str.equalsIgnoreCase("t")
            || str.equalsIgnoreCase("w") || str.equalsIgnoreCase("f")
                || str.equalsIgnoreCase("s"))){

            System.out.println("Not a valid entry");
        }
    }
}
