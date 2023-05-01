package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray {
    public static void main(String[] args) {

        // toArray();
        ArrayList<String> food = new ArrayList<>();

        food.add("Burger");
        food.add("Pilov");
        food.add("Cheese");
        food.add("Baklava");

        Object[] foodAsArray = food.toArray();

        System.out.println(Arrays.toString(foodAsArray));
        System.out.println(foodAsArray[3]);




    }
}
