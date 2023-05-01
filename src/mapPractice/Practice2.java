package mapPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Practice2 {
    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();
        LinkedHashMap <String, String> linked = new LinkedHashMap<>();
        TreeMap<String, String> tree = new TreeMap<>();

        //no order                          insertion                           ascending
        hash.put("toyota","corolla");     linked.put("toyota", "corolla");     tree.put("toyota", "corolla");
        hash.put("lexus","ES350");        linked.put("lexus","ES350");          tree.put("lexus","ES350");
        hash.put("bmw","X7");             linked.put("bmw","X7");               tree.put("bmw","X7");
        hash.put("honda", "accord");      linked.put("honda", "accord");         tree.put("honda", "accord");

        System.out.println(hash);           System.out.println(linked);             System.out.println(tree);
        System.out.println("-------------------");
        // null keys for each type of map
        hash.put(null, "accord");      linked.put(null, "accord");       //  tree.put(null, "accord");
        System.out.println(hash);           System.out.println(linked);             System.out.println(tree);

        System.out.println("-------------------");
        // null values for each type of map
        hash.put("VW", null);      linked.put("VW", null);         tree.put("VW", null);
        System.out.println(hash);           System.out.println(linked);             System.out.println(tree);

        System.out.println("-------------------");
        // multiple null values for each type of map
        hash.put("Audi", null);      linked.put("Audi", null);         tree.put("Audi", null);
        System.out.println(hash);           System.out.println(linked);             System.out.println(tree);
    }








}
