package primitives;

public class CompoundPractice {


    public static void main(String[] args) {

        int count = 13 + 12;

        System.out.println(count);

        // +=  >> add and assign the total to the variable

        count += 5; //   count = count + 5;

        System.out.println(count); //  30
        int number = 4;

        count += number + 2; // 36, --> count = count + number + 2;
        System.out.println(count);

        // -= subtract and assign the result to the variable

        int result = number;

        number -= result; // 0

        System.out.println(number);// 0
        System.out.println(result);// 4

        // *= --> multiply and assign the result to the variable

        double number2 = 8; // 8.0

        double tax = 14.5;

        number2 *= tax;
        System.out.println(number2);

        number2 *= 5 - 1.2; //

        System.out.println(number2);

        // /= --> divide and assign the result to the variable

        result /= 3.8;
        System.out.println(result);

        int num3 = 50;

        num3 /= 5;
        System.out.println( num3); // 10


        System.out.println(   num3 % 9    ); // 1
        //  %= --> finds remainder and re-assign it to the variable

        int result2 = 22;

        result2 %= 3;

        System.out.println( result2); // 1


        double result3 = 2.36;

        result3 %= 0.25;

        System.out.println( result3 );

        System.out.println( 2.36/ 0.25);
        result3 = 2.36;
        System.out.println( result3 * 100 );

    }

}
