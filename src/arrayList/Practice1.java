package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {

        // create arraylist

        ArrayList fruits = new ArrayList();
        ArrayList<String> fruits1 = new ArrayList();
        ArrayList<String> fruits2 = new ArrayList<>();

        List fruits3 = new ArrayList();
        List<String> fruits4 = new ArrayList();

        System.out.println(fruits1);

        fruits1.add("Apple");
        System.out.println(fruits1);
        fruits1.add("Orange");
        fruits1.add("Kiwi");
        fruits1.add("Melon");
        System.out.println(fruits1); // [Apple, Orange, Kiwi, Melon]

        System.out.println(fruits1.size());
        int i = fruits1.size();

        System.out.println("size of arraylist is " + i);

        fruits1.add(2, "Strawberry");
        System.out.println(fruits1); // [Apple, Orange, Strawberry, Kiwi, Melon]

        String item1 = fruits1.get(1); // Orange

        System.out.println(fruits1.get(1)); // Orange

        System.out.println(item1);
        System.out.println(item1.equals(fruits1.get(1))); // TRUE

        /*
        add()
        size()
        get()
        printed whole arraylist
        -print each element one at a time
         */


        for (int index = 0; index < fruits1.size(); index++) {

            System.out.println(fruits1.get(index));

        }
        System.out.println("============");

        for (String fruit : fruits1) {

            System.out.println(fruit);
        }

    }


}
