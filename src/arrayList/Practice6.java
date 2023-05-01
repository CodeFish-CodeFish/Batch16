package arrayList;

import setPractice.Flower;

import java.util.ArrayList;
import java.util.HashSet;

public class Practice6 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.add(23);
        numbers.add(32);
        numbers.add(45);
        numbers.add(63);

        System.out.println(numbers);


        numbers.removeIf(kutman -> (kutman%3==0));//i--> represented as each element in list
        numbers.add(67432);
        numbers.add(3432);
        numbers.add(6987);

        numbers.removeIf(java->(java%2==0));
        System.out.println(numbers);
        System.out.println();

        /*
        create 5 different types of flower
        store in a list called vase/store
        inside of vase remove all cheap flowers(flowerPrice<$50)
         */

        ArrayList<Flower> store=new ArrayList<>();
        store.add(new Flower("Rose","Red","Large",65.0));
        store.add(new Flower("Tulip","Orange","medium",30.0));
        store.add(new Flower("Daisy","White","small",10.0));
        store.add(new Flower("Lilly","Blur","small",80.0));
        store.add(new Flower("Chamomile","Yellow","Large",25.0));
        System.out.println(store);

        for (Flower flower:store){
            System.out.println("Type: "+flower.getType());
            System.out.println("Color: "+flower.getColor());
            System.out.println("Size: "+flower.getSize());
            System.out.println("Price: "+flower.getPrice());
            System.out.println();
        }
        store.removeIf(flower -> flower.getPrice()<50);
        System.out.println("++++++++++++++++++");
        for (Flower flower:store){
            System.out.println("Type: "+flower.getType());
            System.out.println("Color: "+flower.getColor());
            System.out.println("Size: "+flower.getSize());
            System.out.println("Price: "+flower.getPrice());
            System.out.println();
        }

        // remove all flowers with small size
        // check if list is empty

        store.removeIf(flower -> flower.getSize().equalsIgnoreCase("small"));
        System.out.println(store.isEmpty());


        ArrayList<Integer> numb=new ArrayList<>();
        numb.add(3);
        numb.add(4);
        numb.add(5);
        numb.add(4);
        numb.add(7);
        numb.add(3);
        System.out.println(numb);

        HashSet<Integer> numbNoDupl=new HashSet<>(numb);
        System.out.println(numbNoDupl);




    }
}
