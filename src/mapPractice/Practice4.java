package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice4 {
    //create a method that will take a map<Integer, String>
    // this method will print all keys from the map

    static public void printKeys(Map<Integer, String> map) {

        System.out.println(map.keySet());

        // print each key one by one
        for (Integer key : map.keySet()) {
            System.out.println("-- " + key + " --");
        }

    }

    //======================================================//
    //create a method that will take a map<Integer, String>
    // this method will print each value by using get() method
    // need to return of the values as a list

    public static List<String> printValues(Map<Integer, String> map) {
        // get(key) --> returns value

        List<String> valueList = new ArrayList<>();
        for (Integer key : map.keySet()) {

            valueList.add( map.get(key)  );

           // System.out.println(map.get(key));
        }
        return  valueList;
    }


    public static void main(String[] args) {

        HashMap<Integer, String> cars = new HashMap<>();

        cars.put(1, "corolla");
        cars.put(2, "X7");
        cars.put(3, "Ex350");

       List<String> myList =  printValues(cars);
        System.out.println( myList );
        printKeys(cars);
    }
}
