package mapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice5 {
    public static void main(String[] args) {

        // entrySet()
        HashMap<String, Integer> map = new HashMap<>();

        map.put("IT", 100);
        map.put("HR", 200);
        map.put("Admin", 300);
        map.put("Sales", 400);

        System.out.println(map); // {Sales=400, HR=200, IT=100, Admin=300}

        System.out.println(map.entrySet()); // [Sales=400, HR=200, IT=100, Admin=300]

        Set<Map.Entry<String, Integer>> pairs = map.entrySet();
        System.out.println(pairs);
        System.out.println(pairs.size());
        // print each element from pairs one by one


        for (Map.Entry<String, Integer> pair : pairs){
            System.out.println( pair);
        }

        // -----------------------
        System.out.println("____________________");
      Set  pairs2 =   map.entrySet();


        for ( Object abcd : pairs2){
            System.out.println( abcd );
        }
    }
}
