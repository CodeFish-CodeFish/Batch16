package arraysPractice;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {
        int[] ages = {23, 15, 23, 7, 56, 40, 3, 56, 56, 56, 100, 7, 19, 1};

        System.out.println(Arrays.toString(ages));

        // sort
        Arrays.sort(ages);
        System.out.println( Arrays.toString( ages));

        // find the largest numbers
        System.out.println( ages[ ages.length-1 ]);

        // smallest number
        System.out.println( ages[0]);

        // middle number on the array
        System.out.println(  ages[ages.length/ 2 ]);

        String[] colors = {"red", "bLue", "White", "Brown", "black", "pink", "purple", "orange"};

        System.out.println( Arrays.toString(colors));

        // sort
        Arrays.sort(colors); // elements will be sorted alphabetically
        System.out.println(Arrays.toString(colors));



    }
}
