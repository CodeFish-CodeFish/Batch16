package stringBuilderPractice;

public class Practice2 {

    // create a method that will print and return upperCase alphabet as a single StringBuilder

    // test your method

    public static StringBuilder alphabet(  ){
        StringBuilder builder = new StringBuilder();
        for (  char i='A'; i <='Z'; i++){
            builder.append(i);
        }
        System.out.println( builder );
        return builder;
    }

    public static void main(String[] args) {

        alphabet();

        StringBuilder stringBuilder =  alphabet();
        System.out.println( stringBuilder.append('!')  );
        System.out.println("=================");

        //methods
        StringBuilder builder = new StringBuilder();
        builder.append("talking is valuable");
        // charAt()
        builder.charAt(0); // t
       // builder.charAt(100); // StringIndexOutOfBoundsException

        // indexOf()
        System.out.println(   builder.indexOf("k")  );
        System.out.println(   builder.indexOf("a", 2)   );

        // substring()
        System.out.println( builder.substring(  builder.indexOf("k")  ) ); // king is valuable
        System.out.println(  builder.substring(2,5)); //

        //length()
        System.out.println( builder.length());

        // lastIndex(); returning index of last matching string
        System.out.println( builder.lastIndexOf("l") );;

        // insert() --> is not replacement for the given index, rather inserting the new value to the given index
        builder.insert(10, " most");
        System.out.println(builder);

        System.out.println( builder.length());

        // delete()
        builder.delete(10,15);
        System.out.println( builder);

        // deleteCharAt();

        builder.deleteCharAt(8);
        System.out.println(builder);

        //replace()
        builder.replace(2,3, "******");
        System.out.println(builder);





    }
}
