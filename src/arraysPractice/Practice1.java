package arraysPractice;


import java.util.Arrays;


public class Practice1 {

    public static void main(String[] args) {

        // creating an integer array

        int[] numbers = new int[5];

        System.out.println(numbers);

        // to print out array, you need to use >> Arrays.toString( nameOfArray)

        System.out.println(Arrays.toString(numbers)); // [0, 0, 0, 0, 0]

        numbers[0] = 3; // store value '3' on the index '0'
        System.out.println(Arrays.toString(numbers)); // [3, 0, 0, 0, 0]

        // store 8 to the index 3
        numbers[3] = 8;
        System.out.println(Arrays.toString(numbers)); // [3, 0, 0, 8, 0]

        // print/reaching out single element on array

        System.out.println(numbers[0]); // 3 from numbers array

        int apple1 = numbers[0];
        System.out.println(apple1 == numbers[0]); // TRUE

        // reassignment of a value
        numbers[0] = 17;
        System.out.println(Arrays.toString(numbers)); // [17, 0, 0, 8, 0]

        // store value 9 to the last index of numbers array
        numbers[4] = 9;
        System.out.println(Arrays.toString(numbers)); // [17, 0, 0, 8, 9]

        // checking size of array
        int size = numbers.length;
        System.out.println(size); // 5

        // store value 19 to the last index of numbers array

        numbers[numbers.length - 1] = 19;
        System.out.println(Arrays.toString(numbers));

        //  numbers[5] = 88; ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(numbers));

        //  numbers[-1] = 77; ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(numbers));
        System.out.println("++++++++++++++++++++++++++");
        numbers[1] = 4;
        numbers[2] = 23;

        // how to store single value to array
        // how to reach out single value on/from array
        // how to reassign a new value
        // how to check size of array >> numbers.length

        System.out.println(Arrays.toString(numbers)); // [17, 4, 23, 8, 19]

        // how to reach out all elements one by one
        // print out every single element from array
        // 2 minutes

        for ( int i = 0; i < numbers.length; i++){

            System.out.print(  numbers[i]  );
        }
    }

}
