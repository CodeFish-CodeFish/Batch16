package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {

        HashMap map1 = new HashMap();

        HashMap<String, Integer> map2 = new HashMap();

        Map map3 = new HashMap();
        Map<String, String> map4 = new HashMap();


        System.out.println(map2);

        map2.put("Alex", 100);
        System.out.println(map2);
        map2.put("Sam", 200);
        map2.put("Diana", 300);
        map2.put("Vlad", 400);
        System.out.println(map2); // {Diana=300, Alex=100, Vlad=400, Sam=200}
        System.out.println(map2.size());
        map2.put("Alex", 101);
        System.out.println(map2);
        map2.put("David", 200);
        System.out.println(map2); // {Diana=300, Alex=101, Vlad=400, David=100, Sam=200}

        System.out.println(map2.put("David", 200));
        System.out.println(map2.put("Alex", 101));
        System.out.println("================");
        System.out.println(map2.get("David"));
        System.out.println(map2.get("Vlad")); // 400

        Integer i = map2.get("Diana");
        System.out.println(i * 100);

        // want to reach out all elements one by one
        //   {Diana=300, Alex=101, Vlad=400, David=100, Sam=200}           //

        Set<String> keys = map2.keySet();
        System.out.println(keys); //     [Diana, Alex, Vlad, David, Sam]

        for (String key : keys) {

            System.out.println(map2.get(key));
            System.out.println("------");
            System.out.println(key + " -- " + map2.get(key));
        }

        map2.remove("Alex");
        System.out.println(map2);

        System.out.println(map2.get("Alex")); //  null

        System.out.println(map2.get("xyz"));    //  null

        map2.remove("David", 200);
        System.out.println(map2);

        // replace();
        map2.replace("Vlad", 999);
        System.out.println(map2);
        map2.replace("Vlad", 999, 888);
        System.out.println(map2);

        //containsValue()
        System.out.println(map2.containsValue(888));

        // containsKey()
        System.out.println(map2.containsKey("vlad"));
        map2.put("vlad", 777);
        map2.put("VLAD", 666);
        map2.put("VlaD", 555);
        System.out.println(map2);

        // isEmpty()
        System.out.println(map2.isEmpty());
        System.out.println("-----------");
        Object o = map2.clone();
        System.out.println(o);
        System.out.println("-----------");
        // clear
        map2.clear();
        System.out.println(map2);
        System.out.println(map2.isEmpty());


    }
}
