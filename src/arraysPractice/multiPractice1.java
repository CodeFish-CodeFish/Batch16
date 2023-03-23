package arraysPractice;

import java.util.Arrays;

public class multiPractice1 {

    public static void main(String[] args) {

        int[] a = new int[7]; // -->

        int[][] numbers = new int[4][3];
        System.out.println(numbers[0][0]); //0      [   [20, 10, 30],     [0, 77, 0],   [0, 0, 0],    [0, 0, 0]    ]
        numbers[0][0] = 20;
        numbers[0][1] = 10;
        numbers[0][2] = 30;
        System.out.println(numbers[0][2]);

        // store 77 to
        numbers[1][1] = 77;
        // how to show all arrays?
        System.out.println(Arrays.toString(numbers));// [[I@2c8d66b2, [I@5a39699c, [I@3cb5cdba, [I@56cbfb61]
        System.out.println(Arrays.deepToString(numbers));//  [[20, 10, 30], [0, 77, 0], [0, 0, 0], [0, 0, 0]]

        System.out.println(numbers.length);  // 4

        // reach out first element of outer array
        int[] arr1 = numbers[0]; // returns array

        System.out.println(arr1.length); // 3
        System.out.println(numbers[0].length); // 3
        System.out.println(numbers[1].length); // 3
        numbers[2][2] = 100;
        System.out.println(Arrays.deepToString(numbers));

        numbers[3][2] = 444;         /// [[20, 10, 30],  [0, 77, 0],      [0, 0, 100],      [0, 0, 0]]

        numbers[numbers.length - 1][numbers[numbers.length - 1].length - 1] = 555;

        System.out.println(Arrays.deepToString(numbers));
    }
}