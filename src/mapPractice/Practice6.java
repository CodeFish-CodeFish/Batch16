package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Practice6 {
    public static void main(String[] args) {
        HashMap<Integer,String> studentsList=new HashMap<>();
        studentsList.put(1,"Ahmed");//1.Ahmed
        studentsList.put(2,"Steve");
        studentsList.put(null,"NULL");//null.NULL
        studentsList.put(null,"CodeFish");
        //entrySet()--> list of pairs of the map
        //key=value --> 1 pair

        //{1=Ahmed,2=Steve, null=CodeFish}
        for (Map.Entry<Integer,String>   pair:studentsList.entrySet()){
            System.out.println(pair.getKey()+"."+pair.getValue());
        }
        //null.CodeFish
        //1.Ahmed
        //2.Steve
        System.out.println("++++++++++++++++++++");
        LinkedHashMap<Integer,String> studentsList2=new LinkedHashMap<>();
        studentsList2.putAll(studentsList);
        studentsList2.put(3,"Taha");
        studentsList2.put(4,"Kutman");
        for (Map.Entry<Integer,String>   pair:studentsList2.entrySet()){
            System.out.println(pair.getKey()+"."+pair.getValue());
        }

        studentsList2.keySet();//--> Set<Keys> will give all keys map has KEYS:null,1,2,3,4,
        System.out.println("++++++++++++++");
        System.out.println(studentsList2.keySet());
        for (Integer key:studentsList2.keySet()){
            System.out.println(studentsList2.get(key));
        }
        System.out.println();
        System.out.println(studentsList2.values());

        /*
        null.CodeFish
        1.Ahmed
        2.Steve
        3.Taha
        4.Kutman
         */
        System.out.println(studentsList2.entrySet());


    }
}
