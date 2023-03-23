package scannerPractice;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        String name = "David";

        System.out.println(name);

        Scanner input = new Scanner(System.in);

        System.out.println("What is your last name?");

        String lastName = input.nextLine();

        System.out.println(lastName);

        System.out.println("Your full name is " + name + " * " + lastName);

        // ask user to provide their city
        // "..name.. you are living in ..city.."

        System.out.println("What is your city?");

        String yourCity = input.nextLine();

        System.out.println(name + ", you are living in " + yourCity);



    }


}
