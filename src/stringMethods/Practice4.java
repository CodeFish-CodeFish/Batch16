package stringMethods;

public class Practice4 {
    public static void main(String[] args) {

        String str = "microphone";

        // startsWith();

        boolean b1 = str.startsWith("m"); // TRUE
        System.out.println(b1);

        boolean b2 = str.startsWith("micro");
        System.out.println(b2); // true

        System.out.println(str.startsWith("phone")); // FALSE

        // endsWith();

        boolean b3 = str.endsWith("e");// true
        System.out.println(b3);

        System.out.println(str.endsWith("1")); // FALSE

        System.out.println(str.endsWith("one"));//TRUE

        System.out.println(str.endsWith("microphone")); // true

        System.out.println(str.endsWith("mirophone")); //false

        // contains()

        boolean b4 = str.contains("a");

        System.out.println(b4); //false

        System.out.println(str.contains("h"));
        System.out.println(str.contains("one"));
        System.out.println(str.contains("hp"));
        System.out.println(str.contains("ho"));
        System.out.println(str.contains("h" + "o"));

        System.out.println("--------------");
        //equals()equals()
        boolean b5 = str.equals("micro");// false
        System.out.println(b5);
        System.out.println(str.equals("Microphone")); // false
        String str2 = "MICROPHONE";
        System.out.println(str.equals(str2)); // false
        str = str.toUpperCase();
        System.out.println(str.equals(str2)); //
        System.out.println("--------------");
        // equalsIgnoreCase()

        boolean b6 = str.equalsIgnoreCase("MicroPhoNe");//true
        System.out.println(b6);
        System.out.println("MICROPHONE".equalsIgnoreCase("microphone")); //
        boolean b7 = "MICROPHONE".equalsIgnoreCase("microphone");

        System.out.println("----------");
        str = "microphone";
        // substring()
        String part1 = str.substring(5);
        System.out.println(part1);
        System.out.println(str.substring(str.indexOf('p')));

        // you take the substring 'one' from str
        String part2 = str.substring(str.indexOf("on"));

        System.out.println(part2);
        // "I want to buy ..one.. new ..phone.."
        System.out.println( "I want to buy "+ part2 + " new "+ part1);
        System.out.println("I want to buy "+ str.substring(str.indexOf('o',str.indexOf('o')+1))+" new "+str.substring(str.indexOf('p')));

        //=======microphone
        String part3 = str.substring(2,5);

        System.out.println(part3);

        // micro

        System.out.println(   str.substring( 0, 5 )   );
        // make above indexes numbers dynamic to get word 'micro' from str

        System.out.println(  str.substring(  str.indexOf('m'), str.indexOf('p')    )  );

        System.out.println(part1);
       // System.out.println(part1.charAt(10)); // StringIndexOutOfBoundsException
        System.out.println(part1.indexOf('o', 3));


    }
}
