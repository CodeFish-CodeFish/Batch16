package primitives;

public class ComparisonPractice {

    public static void main(String[] args) {

        int number1 = 4, number2 = 4;

        System.out.println(number1 == number2);

        boolean result1 = number1 == number2;
        System.out.println(result1);
        System.out.println("============");

        System.out.println(result1 == false); // false

        number2 = 7;
        System.out.println(number1 == number2); // false

        System.out.println((result1 == false) == (number1 == number2)); //

        System.out.println(7.8 == 8.7);
        System.out.println("============");

        System.out.println("*java*" == "*java*");

        System.out.println("+++++++++++++++++++++++");

        // !=   -> not equals
        number1 = 8;
        float num1 = 8, num2 = 6, num3 = 9 - 1;

        boolean result2 = num1 != num2;

        System.out.println(result2); // true

        boolean result3 = number1 != num1;
        System.out.println(result3);

        System.out.println(8 != 8.0);

        System.out.println('c' != 'C'); // true

        System.out.println('A' != 65);
        System.out.println("++++++++++++++++++++++++++++++");
        //   > greater than

        double count1 = 12.5, count2 = 12.5, count3 = 50;

        System.out.println(count1 > count2); // false

        boolean result4 = count3 > count1 + count2;
        System.out.println(result4);

        System.out.println("++++++++++++++++++++++++++++++");
        //   < less than

        System.out.println(count1 < count3); // yes/true

        System.out.println((count3 != count1) == (count3 - 25 < count1)); //

        System.out.println("++++++++++++++++++++++++++++++");
        //   >= greater than or equals

        System.out.println(count1 >= count2); // true

        System.out.println(count3 >= count1 * count2); // false

        System.out.println(50 - count1 >= count2 + count1); // true

        System.out.println("++++++++++++++++++++++++++++++");
        //   <= less than or equals

        System.out.println(  count1 <= 12.5     ); // true

        boolean result5 = count3 <= count3 - count1;
        System.out.println( result5); // false

    }
}
