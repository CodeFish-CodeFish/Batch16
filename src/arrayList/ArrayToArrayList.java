package arrayList;

import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    public static void main(String[] args) {

        String[] cities = {"Chicago", "LA", "Denver", "Dallas", "Houston"};
        System.out.println(Arrays.toString(cities));

        //  cities[5] = "Mt Prostpect";

        // asList()

        List<String> list = Arrays.asList(cities);

        System.out.println(list);

      //  list.add("Mt Prospect"); // UnsupportedOperationException

      //  list.remove("LA"); // UnsupportedOperationException

        System.out.println(list);

    }
}
