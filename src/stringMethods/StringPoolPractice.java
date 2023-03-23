package stringMethods;

public class StringPoolPractice {

    public static void main(String[] args) {

        String name1 = "David";
        String name2 = "David";
        String name3 = new String("David");
        String name4 = new String("David");

        System.out.println(   name1.equals(name2)   ); // TRUE
        System.out.println( name1.equals(name3) ); // TRUE
        System.out.println( name3.equals(name4) ); // TRUE
        System.out.println("====================");

        // ==

        System.out.println(  name1 == name2  ); // TRUE
        System.out.println(  name1 == name3  ); // FALSE
        System.out.println(  name3 == name4  ); // FALSE

        String name5 = name1;
        System.out.println( name5 == name1); //

        String name6 = name5;

        System.out.println( name1.equals(name6)); // TRue

        System.out.println( name1 == name6 );

        String name7  = new String("DAVID");

        System.out.println( name1.equals(name7)   );
        System.out.println( name1.toLowerCase().equals(name2));
        System.out.println(  name1.toUpperCase() == name7); //
        System.out.println(   name1.toUpperCase().equals( name7));

    }
}
