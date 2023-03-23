package ternaryOperator;

public class Practice1 {
    public static void main(String[] args) {

        int num1 = 6, num2 = 3;

        String result1 = num2 < num1 ? "Alex" : "David";

        System.out.println(result1);

        boolean result2 = num1 == num2 ? true : false;

        System.out.println(result2);

        System.out.println(num1 != num2 - 3 ? "Hello" : "Bye");

        // you cannot store the result when options are returning different data types
        // int str2 =    num1 + 5 >= num2 *2 -4 ?  num1 * 10 : "I can do it";
        System.out.println(num1 + 5 >= num2 * 2 - 4 ? num1 * 10 : "I can do it");

        String result3 = "test".charAt(1) != "java".charAt(3) ? "You can compare" : "it is very easy";
        System.out.println(result3);





    }
}
