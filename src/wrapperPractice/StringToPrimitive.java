package wrapperPractice;

public class StringToPrimitive {
    public static void main(String[] args) {

        String str1 = "10";
        String str2 = "20";
        System.out.println(str1 + str2); // 1020

        // parsing
        int number = Integer.parseInt(str1);
        System.out.println(number + 55); //


//        String str3 = "does it work with 567";
//        Integer.parseInt(str3); //NumberFormatException

        String str4 = "12345678";
        int number2 = Integer.parseInt(str4);
        System.out.println(number2 * 100);

        // money is 100.25 is stored in String value as >>  String money = "100.25;
        // find out 1/4 your money
        // if 1/4 of your money is enough to buy a book which is $25.00
        //tell me if you can buy a book or not

        String money = "0.25";

        double realMoney = Double.parseDouble(money);

        if (realMoney / 4 >= 25.00) {
            System.out.println("you can buy the book");
        } else {
            System.out.println("your money is short");
        }

        System.out.println(realMoney / 4 >= 25.0 ? "*you can buy the book*" : "*Short on Money**");

        // from string to wrapper class data

        String str5 = "123";

        Integer num1 = Integer.parseInt(str5); // parsing string to int, and AutoBoxing to wrapper object

        // from primitive to String conversion

        // valueOf()

        char ch = 'm';

        String str6 = String.valueOf(ch);
        System.out.println(str6.concat(" -->Test"));

        Character ch2 = 'N';

        String str7 = String.valueOf(ch2); // ch2 is Unboxed and converted to String, you can store it in String

        System.out.println( str7.concat(" --> Letter as String now"));

        String str8 = ch2.toString();
        System.out.println( str8.concat(" >>><<<"));
    }
}
