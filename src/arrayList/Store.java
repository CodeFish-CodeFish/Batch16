package arrayList;

import java.util.ArrayList;

public class Store {


    public static void main(String[] args) {

        ArrayList<Computer> items = new ArrayList<>();

        Computer c1 = new Computer("Apple", "Air", 1100, 11.5);
        Computer c2 = new Computer("Apple", "Pro", 2000, 17.0);
        Computer c3 = new Computer("Dell", "XPS", 600, 13.5);
        Computer c4 = new Computer("HP", "Envy", 400, 9.5);


        items.add(c1); items.add(c2); items.add(c3); items.add(c4);

        Computer.priceRange( items   );

        System.out.println("===========");
        System.out.println( Computer.priceRange2(items));

       ArrayList<Computer>  list = Computer.priceRange3(items);

        System.out.println(list);

    }

}
