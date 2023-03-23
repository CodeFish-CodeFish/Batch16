package arraysPractice;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {

        String[] drinks = new String[7];

        System.out.println(Arrays.toString(drinks));

        drinks[1] = "coffee";
        drinks[2] = "water";
        drinks[5] = "milk";
        drinks[0] = "tea";
        drinks[3] = "coke";
        System.out.println( Arrays.toString(drinks) );

        // store 'sparkling water' to the last index

        drinks[drinks.length -1 ] = "sparkling water";

        System.out.println( Arrays.toString(drinks) );
        System.out.println( drinks[6]);//

       // reach out every drink in this array and print out as >> *nameOfDrink*

        for ( int index = 0; index < drinks.length; index++ ){

            System.out.println( "*" + drinks[index] + "*");

        }


    }
}
