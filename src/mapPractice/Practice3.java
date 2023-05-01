package mapPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Practice3 {

    public static void main(String[] args) {
        HashMap<String, String> hash = new HashMap<>();

        hash.put("toyota", "corolla");
        hash.put("lexus", "ES350");
        hash.put("bmw", "X7");
        hash.put("honda", "accord");

        // values()

        System.out.println(hash.values());

        Collection<String> values = hash.values();

        System.out.println(values);
        // if the value of car is corolla, tell user to take it to dealer

        for (String name : hash.values()) {

            if (name == "corolla") {
                System.out.println("Take your car to dealer");
            }
        }


    }
}
