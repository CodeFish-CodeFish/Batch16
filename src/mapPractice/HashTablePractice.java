package mapPractice;

import java.util.Hashtable;

public class HashTablePractice {
    public static void main(String[] args) {

        Hashtable<String, Integer> table = new Hashtable();
        table.put("Alex", 25);
        table.put("David", 30);
        table.put("Sam", 21);

        System.out.println( table );
        // null key is not allowed in hashtable
      //  table.put(null, 45);
        System.out.println(table);

        //null values
       // table.put("Vlad", null);
        System.out.println(table);

        System.out.println(  table.values() );
        System.out.println(  table.keySet() );

    }
}
