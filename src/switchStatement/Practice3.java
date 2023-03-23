package switchStatement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        you have strawberry, apple, orange, grape, mango, watermelon
        ask user for their favorite fruit
        if their favorite is in the store --> We have your favorite at store"
            otherwise --> "We sorry, we do not have your favorite fruit"
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your favorite fruit");
        String fruit = scanner.nextLine().toUpperCase();

        switch (fruit){

            case "STRAWBERRY":

            case "APPLE":

            case "ORANGE":

            case "GRAPE":

            case "MANGO":

            case "WATERMELON":
                System.out.println("We have your favorite at store"); break;
            default:
                System.out.println("We are sorry, we do not have your favorite fruit");
                break;


        }
        long l = 9;
        String str = "7.5";
        switch (str){
            case "7.5":
                System.out.println("Matching");
        }

    }
}
