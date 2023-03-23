package stringMethods;

public class Practice1 {
    public static void main(String[] args) {

        String str = "Test";

        str += "Sunday";
        str  =  "Sunday";

        System.out.println(str); // Sunday

        System.out.println( str+ "Test");// SundayTest

        System.out.println( str );// Sunday

        // concat();
        str.concat(" Afternoon");
        System.out.println(str); // Sunday

        // reassigning value of string after concat to the 'str'
        str = str.concat(" Afternoon");
        System.out.println(str); // Sunday Afternoon

        System.out.println( str.concat(" is here"));// Sunday Afternoon is here
        System.out.println(str); // Sunday Afternoon



    }
}
