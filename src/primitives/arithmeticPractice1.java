package primitives;

public class arithmeticPractice1 {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 7;

        // + --> addition

        System.out.println(num1 + num2);

        int sum = num1 + num2;

        System.out.println(sum);

        // - --> Subtraction

        int num3 = sum - 4;
        System.out.println( num3); // 8

        sum = num3 - num1 + 2; // reassigning
        System.out.println( sum );

        // * --> Multiplication

        int product = sum * sum;
        System.out.println(product);
        System.out.println(  5 * sum * 0 ); //0

        // / --> Division

        int division = 30 / num1;
        System.out.println( division );

        double division1 = 30 / 4.5;
        System.out.println(division1);

        int division2 = 30 / 4;
        System.out.println(division2);


        // % --> modulus --> find and give remainder from division

        int number1 = 17;
        int number2 = 5;

        int remainder1 = number1 % number2;
        System.out.println(  remainder1 ) ;


        System.out.println(    11 % 2     ); //



    }
}























