package loops;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        get an integer from user
        for that integer number create a star tree like in following:
        ex: number = 4
        *
        **
        ***
        ****

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer numbers to create star tree for it");
        int number = scanner.nextInt();

        String str = "*";
        do {

            System.out.println(str);

           // str += "*";
            str = str.concat("*");

            number--;
        }while(number >0);

    }
}
