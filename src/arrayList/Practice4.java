package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Practice4 {


    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("White");
        colors.add("Red");
        colors.add("Black");
        System.out.println(colors);
        // remove()
        colors.remove("Blue");
        System.out.println(colors);
        colors.remove("Red"); // since there are multiple matching 'Red', it will remove first matching 'Red'
        System.out.println(colors);

        colors.remove(1);
        System.out.println(colors);

        Boolean b = colors.remove("BLACK");
        System.out.println(b);
        System.out.println(colors);

        // colors.remove(5);// IndexOutOfBoundsException

        //set()
        String str = colors.set(1, "ORANGE");
        System.out.println(str);
        System.out.println(colors);

        // isEmpty()
        System.out.println(colors.isEmpty()); // FALSE

        // clear()

        colors.clear();
        System.out.println(colors);

        System.out.println(colors.isEmpty()); // TRUE

        colors.add(null);
        colors.add(null);
        System.out.println(colors);
        System.out.println(colors.isEmpty());

        // contains()

        System.out.println(colors.contains("Pink"));

        colors.add("Violet");
        System.out.println(colors.contains("Violet"));


        ArrayList<String> cars = new ArrayList<>();
        cars.add("Kia");
        cars.add("Honda");
        cars.add("BMW");

        System.out.println(cars);

        // addAll()
        cars.addAll(colors);
        System.out.println(cars);

        // cars.addAll("Brown");
        ArrayList<Integer> plateNumbers = new ArrayList<>();

        plateNumbers.add(12);
        plateNumbers.add(13);
        //  cars.addAll(plateNumbers); data type does not match

        System.out.println( cars.get(5) +  cars.get(2) );
        System.out.println(   cars.get(5));


    }

}
