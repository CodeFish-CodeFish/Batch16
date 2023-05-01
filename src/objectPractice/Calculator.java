package objectPractice;

public class Calculator {


    // create a method that will find sum of 2 integer numbers
    // print out the result by multiplying it with 10
    // create another class to test your method

    public void sumOfTwo() {

        int num1 = 9, num2 = 8, sum = num1 + num2;

        System.out.println("Result is : " + (sum * 10));

    }

    public void sum2(int num1, int num2) {
        double result = (num1 + num2) * 10;

        System.out.println("Result from sum2 is : " + result);
    }

    public int total(int n1, int n2) {

        int result = n1 + n2;
       // System.out.println(result);
        return result;
    }


}
