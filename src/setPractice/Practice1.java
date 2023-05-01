package setPractice;

import java.util.HashSet;

public class Practice1 {

    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        HashSet<String> set2 = new HashSet();

        set2.add("Alex");
        set2.add("David");
        set2.add("Vlad");
        set2.add("Dmitry");

        System.out.println(set2);

        // set cannot have duplicate values
        set2.add("Alex");
        System.out.println(set2);

        set2.add(null);
        System.out.println(set2);
        set2.add(null);
        System.out.println(set2);

        // size()
        System.out.println(set2.size());


        // reach out every element one by one

        for (String name : set2) {

            System.out.println("Hello " + name);
        }
        // Alex@school, ... by using concat() method
        System.out.println("==============");

        for (String name : set2) {

            if (name != null && name != "David")
                System.out.println(name.concat("@School"));
            else if (name != null && name.equalsIgnoreCase("david")) {

                System.out.println(name.concat("@HOME"));
            }
        }

        System.out.println("----------------");

        for (String str : set2) {
            if (str != null) {
                if (str.equalsIgnoreCase("david")) {

                    System.out.println(str.concat("@school"));
                } else {
                    System.out.println(str.concat("@HOME"));
                }
            }
        }

        System.out.println("===========");
        System.out.println(set2);
        set2.remove(null);
        System.out.println(set2);

        set2.remove("Alex");
        System.out.println(set2);

    }
}

