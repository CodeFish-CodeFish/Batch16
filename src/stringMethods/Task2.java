package stringMethods;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Ask user to enter a String value which should have space at the beginning or end
        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
        - change all string value to UPPERCASE
        - Find index of First '*'
        - Multiply that value by 10 and
        - Print out the result
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please enter a string value which should contain spaces in the beginning and/or end.");

        String str = scanner.nextLine();

        str = str.replace('a', '*');
        str = str.replace("e","**");
        str = str.toUpperCase();
        System.out.println(str);
        int indexOfStar = str.indexOf('*');
        indexOfStar *= 10;

        System.out.println("result >> "+ indexOfStar);

    }
}
