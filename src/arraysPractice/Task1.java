package arraysPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        as user that how many names of student s/he wants to store in an array
        take those names from user one by one
        and store them into "studentNames" array
        -if student name has 4 or more letters >> store that name into another array
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do you want to store?");
        int size = scanner.nextInt();
        String[] studentNames = new String[size];
        scanner.nextLine();

        String [] specialNames = new String[size];

        for (int i = 0, counter = 1; i < size; i++, counter++) {

            System.out.println("Please enter "+ counter +". student name");

            String name = scanner.nextLine();

            if ( name.length() >= 4 ){
                specialNames[i] = name;
            }else {
                studentNames[i] = name;
            }
        }

        System.out.println("StudentNames array "+Arrays.toString(studentNames));
        System.out.println( "Special Names array "+Arrays.toString(specialNames));

    }
}
