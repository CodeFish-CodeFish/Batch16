package arraysPractice;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {


        /*
        create an array to store following numbers  -20, 18, 7, -7, 5, 30, 0, 2
        --> print only numbers which are greater than 2

        --> how to store numbers that are greater than 2 into another array?
         */
        int numbers[] = {-20, 18, 7, -7, 5, 30, 0, 2};
        // reassign a value for any index
        numbers[1] = 180;

        int largeNumbers[] = new int[numbers.length];

        for ( int i = 0; i < numbers.length; i++){

            if ( numbers[i] > 2  ){
                System.out.println( numbers[i]  );

                largeNumbers[i] = numbers[i];
            }

        }
        System.out.println(Arrays.toString(largeNumbers));

    }
}
