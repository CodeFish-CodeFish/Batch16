package arraysPractice;

import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        int numbers1[] = new int[5];
        int   []numbers2 = new int[5];

        numbers2[0] = 3;
        numbers2[1]= 4;

        // 5,7,3,12,6,2

        // second way of creating array

        int[] ids = {5,7,3,12,6,2}; // size --> 6, last index --> 5, can the size change?(NO)

        System.out.println(Arrays.toString(ids)); // [5, 7, 3, 12, 6, 2]
        System.out.println( ids.length ); // 6

        int[] nums = {};
        System.out.println(nums.length);
//        nums[0] = 9; // ArrayIndexOutOfBoundsException
//        System.out.println(Arrays.toString(nums));

        // can you show student ids one at a time by multiplying with 10 >> 50    70 ...
        // store your new numbers into another array
        int[] timesTen = new int[ids.length];




        for (int x = 0; x < ids.length; x ++ ){

            System.out.println( ids[x] * 10);

            timesTen[x] = ids[x] * 10;

        }
        System.out.println( Arrays.toString( timesTen));

    }
}
