package loops;

import java.util.Scanner;

public class ForPractice3 {

    public static void main(String[] args) {

        // get a string from user
        // print out letters from that string by using for loop
        // letters should be separated by comma
        // "remote"  --> r, e, m, o, t, e

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String value");
        String str = scanner.nextLine(); // // "remote"

        for (  int i=0  ;  i < str.length()     ; i++     ){

          //  if (i != str.length()-1){
                System.out.print(  str.charAt( i ) + ", "    );
           // }else {
             //   System.out.print(  str.charAt( i )    );
           // }
        }



    }
}
