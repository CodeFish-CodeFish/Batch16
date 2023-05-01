package objectPractice;

public class MethodPractice2 {


    /*
    create a java method to find and return sum of numbers in an array
     */

    public double sumOfNumbers(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {

            sum += number;
        }
        return sum;
    }

    // overload this sumOfNumbers method
    public double sumOfNumbers() {

        System.out.println("This sumOfNumbers method is always returning 0");
        return 0;
    }

    public double sumOfNumbers(double num1, double num2) {
        double sum = num1 + num2;
        // return num1 + num2;
        return sum;
    }
    // overload sumOfNumbers method that can find sum of first 5 elements from an array

    public double sumOfNumbers(int[] numbers, int limit) {
        int sum = 0;
        if (numbers.length >= limit) {
            for (int i = 0; i < limit; i++) {

                sum += numbers[i];
            }
        }else {
            System.out.println("Array is short");
        }
        return sum;
    }

    public static void main(String[] args) {
        MethodPractice2 obj1 = new MethodPractice2();
        int[] arr = {1, 2, 3, 4, 5, 6};

        double result = obj1.sumOfNumbers(arr, 10);

        System.out.println("first 5's total is: " + result);

        System.out.println(obj1.sumOfNumbers(arr));

        double total = obj1.sumOfNumbers(arr);
        System.out.println("Total from array is " + total);


        double d1 = obj1.sumOfNumbers();
        System.out.println(d1);

        double d2 = obj1.sumOfNumbers(10, 10);
        System.out.println(d2);
    }

}
