package stringMethods;

public class Practice2 {
    public static void main(String[] args) {
        String day = "Tuesday";

        day += 123;

        day += true;

        day += 5.6;

        System.out.println(day); //

        // concat();
        day = day.concat(" is your day");
        System.out.println(day); //

        day = day.concat("true");
        System.out.println(day);
        //     0123456
        day = "tuesday";

        // charAt(); takes index(integer) number as parameter, gives(returns) char

        char letter = day.charAt(3); // s
        System.out.println(letter);

        System.out.println(day.charAt(5)); // a

        // length(); it will return count/numbers of character from string

        int count = day.length();
        System.out.println(count);

        day = day.concat("*** ! ***");
        int count2 = day.length();
        System.out.println(count2);

        System.out.println(day.charAt(15)); // *
        //    System.out.println(   day.charAt(16)  ); // StringIndexOutOfBoundsException

        System.out.println( day.length() );

        int number = 8;

        char letter2 = day.charAt(number);
        System.out.println("this is the char on index 8 >> "+letter2);

        // show the last char from string by using length method/do not give index number directly

        String str = "Computer";

        int a = str.length()- 1;

        System.out.println(    str.charAt(a) );

        System.out.println(   str.charAt( str.length() -1    )    );








    }
}
