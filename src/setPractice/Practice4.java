package setPractice;

import java.util.HashSet;

public class Practice4 {
    public static void main(String[] args) {



        // use set into your solution to find out repeating elements form given array
        // print out those repeating element --> blue, black
        // try to add given color to another set

        String[] colors = {"red","blue", "blue", "yellow", "white", "black", "black", "purple"};

        HashSet<String> set = new HashSet<>();

        for (  String color : colors){


            if (  !set.add(color) ){


                System.out.println(color);
            }
        }

    }
}
