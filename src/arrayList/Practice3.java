package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice3 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();

        list1.add(12);
        list1.add("Number");
        list1.add(true);

        list1.add(0,"word");
        list1.add(0, "strawberry");
        System.out.println(list1 ); // [strawberry, word, 12, Number, true]


        List    list2 = new ArrayList<>();

        list2.add("Alex");
        list2.add(5.5);
        list2.add('T');
        System.out.println( list2);

        // print out each element one at a time
        System.out.println("================");
        for(  Object item  : list2 ){
            System.out.println( item);
        }
        System.out.println("================");

        List<Integer> list3 = new ArrayList<>();

        list3.add(100);
        list3.add(200);
        list3.add(1, 500);
        System.out.println(list3);

       // list3.add(5, 777); // IndexOutOfBoundsException
        list3.add(3,555);
        System.out.println(list3);

      //  System.out.println(   list3.get(9)  ); // IndexOutOfBoundsException

      //  System.out.println(  list3.get(-2)   ); // IndexOutOfBoundsException

        list3.add(null);
        System.out.println(list3);

    }
}
