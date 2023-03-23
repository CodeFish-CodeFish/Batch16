package primitives;

public class RemainderPractice {


    public static void main(String[] args) {

        //110 %100 --> 10

        // 12 % 10 --> 2

        // 234 % 10 --> 4
        // 36 % 10 --> 6

        int number = 123; // 1 + 2 + 3 = 6

        int digit1 = number % 10; // digit1 is 3

        number = number / 10; // now, number is 12

        int digit2 = number % 10; // digit2 is 2

        number = number /10; // now, number is 1

        int digit3 = number %10;

        int sum = digit3+digit2+digit1;
        System.out.println( "The sum is >> "+sum);

    }


}
