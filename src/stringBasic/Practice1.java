package stringBasic;

import objectPractice.NetFlix;

public class Practice1 {
    public static void main(String[] args) {

        NetFlix.watch();

        System.out.println("This is first line");

        System.out.println(" ");
        System.out.println("_____________");

        String name = "Alex";
        System.out.println(name);// Alex

        System.out.println( name + "Smith"); // AlexSmith
        System.out.println(name); // Alex
        System.out.println(name + "12345");// Alex12345

        String test = name + "Smith"; // Concatenation is when you add more string value
                                        // to the existing string

        System.out.println(test); // AlexSmith
        System.out.println(name); // Alex
        System.out.println("==================");
        name = name + test;
        System.out.println( name );//AlexAlexSmith

        int number = 123;
        name = name + number;

        System.out.println(name);

        name = name +555;
        System.out.println(name);

        // compound assignments
        test = "java";
        name = "David";
        name += test;
        System.out.println( name); // Davidjava

        test += "test";


        String name1 = new String();
        System.out.println( name1);
        name1 = "Jessi";
        System.out.println("Are you there "+ name1);

        String name2 = new String("Diana");

        System.out.println( name1 + name2); // JessiDiana
        String name3 = "Lisa";
        String name4 = "Lisa";
        String name5 =  new String("Lisa");
        String name6 =  new String("Lisa");
        System.out.println(    name3 == name4); // true
        System.out.println(    name3 == name5 ); // false
        System.out.println(    name5 == name6 ); // false


        String number9="1";
        number9+="2";

        number9 += 2;

        System.out.println( number9);




    }
}
