package switchStatement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        /*
        get a number from user between 1 and 5
        if the number is 1 --> "Monday"
                        2 ---> "Tues"
                        ....
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number between 1 and 5");
        int dayNumber = scanner.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("No matching day for your entry");
        }

    }
}
