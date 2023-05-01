package exceptions;

import abstraction.abstraction2.Fish;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        System.out.println("**********");
        FileInputStream file = new FileInputStream("TestInfo");

        System.out.println("++++++++++");

        Scanner scanner = new Scanner(file);

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
            Thread.sleep(2000); //  sec
        }


        // throw
        String str = "Matrix";

        if (!str.equalsIgnoreCase("alex")) {

            //  throw new RuntimeException();
            // throw new NumberFormatException();
            throw new Practice2();

        }
        System.out.println("$$$$$");

    }
}
