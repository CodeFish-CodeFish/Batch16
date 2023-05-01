package setPractice;

import java.util.HashSet;

public class Practice3 {

    /*
    create a method that will take a set of Strings as a parameter
    return type of the method is 'void'
    this method will find out flower type
    if the flower type is rose --> it is going to print >> "roses are the best flowers"
     */
    public static void roseFinder(HashSet<String> flowers){

        for ( String fl : flowers){

            if (fl.equalsIgnoreCase("rOSE")){
                System.out.println("roses are the best flowers");
            }
        }
    }
    // create a method to
    // create message for each flower and return those messages in an HashSet
    // "..Rose.. smells good", "..Sun flower.. smells good", ....

    public static HashSet<String> messageCreator(HashSet<String> flowers){

        HashSet<String> messages = new HashSet<>();

        for ( String type: flowers){

            messages.add(type.concat(" smells good !"));
        }

        return messages;
    }



    public static void main(String[] args) {
        HashSet<String> vase = new HashSet<>();
        vase.add("rose");
        vase.add("tulip");
        vase.add("orchid");

        System.out.println( messageCreator(vase) );

        roseFinder(vase);



    }
}
