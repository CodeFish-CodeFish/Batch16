package stringMethods;

public class Practice3 {
    public static void main(String[] args) {

        String str = "SElensiumS";

        // toUpperCase();
        // toLowerCase();

        str = str.toLowerCase();
        System.out.println(str); //selenium

        str = str.toUpperCase();
        System.out.println(str);

        // indexOf(); it will take char/string as parameter, will return index number of first matching char

        int positionOfLetterS = str.indexOf('S');

        System.out.println("positionOfLetterS >> " + positionOfLetterS);

        System.out.println(str.indexOf('l')); // if given char does not exist on the string, it will return '-1'

        System.out.println(str.indexOf('L'));

        // if there are multiple matching and looking for second matching char's indexNumber

        str.indexOf('S'); //- > 0 first matching char's index will be returned which is zero

        str = "SSleniSum";
        int number = str.indexOf('S', 1); //"SeleniSum"
        System.out.println(number);//6

        System.out.println(  str.indexOf("ium") );; // -1

        System.out.println(   str.indexOf("leni")  ); // 2



    }
}
