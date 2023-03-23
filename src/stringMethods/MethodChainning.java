package stringMethods;

public class MethodChainning {
    public static void main(String[] args) {
        String str = "Saturday";

        int num = str.toUpperCase().substring(5).replace('A', '$').indexOf('$');

        System.out.println(num); //

        char ch = str.toUpperCase().substring(5).replace('A', '*').toLowerCase().charAt(1);

        System.out.println(ch);

        System.out.println(str.toUpperCase().substring(5).replace('A', '*').toLowerCase().charAt(1));

        String test = "     from zero to hero   ";

        System.out.println(test.trim()); // from zero to hero

        System.out.println(test.trim().charAt(0)); // f/
        // test.trim().charAt(0)
        System.out.println(test.trim().indexOf('r')); // 1
        // test.trim().indexOf('r')

        System.out.println(test.trim().substring(6));


        //  System.out.println(test.trim().substring( test.indexOf('h')));
        test.trim().substring(test.indexOf('f')).substring(1).toLowerCase().substring(0).trim();

        System.out.println( test.trim().substring(test.indexOf('f')).substring(1).toLowerCase().substring(1).trim());


        String str2 = "hava";
        System.out.println( str2.substring( str2.indexOf('v'))  );

        test = "from  zero to hero";
       // System.out.println(  str2.substring(   test.indexOf('h')));

        System.out.println(   test.replace(" ", ""));
    }
}
