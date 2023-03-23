package stringMethods;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        TASK: get a string from User via scanner and:
    -print:
	- first char
	- last char
	- index of second matching letter 'c'
	- length of string
	- index of 'x'
	- middle char
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a string value");

        String str = scanner.nextLine();

        // how do you reach out any char on any string? --> charAt()

        System.out.println(str.charAt(0)); // - first char

        System.out.println(str.charAt(str.length() - 1)); // -last char

        // how can you reach/see/get index of any char on any string?  --> indexOf()

        str.indexOf('c'); // chicago

        System.out.println(str.indexOf('c', str.indexOf('c') + 1));

        // how can you find length of any string? --> using length method
        System.out.println(str.length());

        // ho can you find index of any char on any string? using indexOf

        System.out.println(str.indexOf('x'));

        // how can you find middle char on any string?

       // System.out.println(4 / 2);

        int number = str.length() / 2;

        System.out.println(str.charAt(number));



        // java -- the


        // below line is finding index of third matching 'c'
        //   str.indexOf('c', (str.indexOf('c', str.indexOf('c')+1)) +1);

//        System.out.println("=======================");
//
//        String test = "bcdjava";
//        int num1 = test.indexOf('a');
//        System.out.println("finding index for 'a' >> "+ num1);
//
//        int num2 = test.indexOf('a',5);
//        System.out.println("finding index for 'a' >> "+ num2);
    }
}
