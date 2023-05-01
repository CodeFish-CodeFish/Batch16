package setPractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Practice2 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet();

        hashSet.add("apple");                   linkedHashSet.add("apple");                      treeSet.add("apple");
        hashSet.add("orange");                  linkedHashSet.add("orange");                     treeSet.add("orange");
        hashSet.add("grapes");                  linkedHashSet.add("grapes");                     treeSet.add("grapes");
        hashSet.add("kiwi");                    linkedHashSet.add("kiwi");                       treeSet.add("kiwi");
        hashSet.add("melon");                   linkedHashSet.add("melon");                      treeSet.add("melon");

        System.out.println("hash > "+hashSet);System.out.println("linked>"+linkedHashSet);    System.out.println("tree > "+treeSet);

        hashSet.add(null);                     linkedHashSet.add(null);                      //   treeSet.add(null);
        System.out.println("hash > "+hashSet); System.out.println("linked>"+linkedHashSet);    System.out.println("tree > "+treeSet);

        System.out.println("=========================");

        System.out.println(  treeSet.descendingSet() );
        treeSet.pollFirst(); // removing first element from treeSet
        System.out.println(treeSet);

        treeSet.pollLast();// removing last element from treeSEt
        System.out.println(treeSet);
        String str = treeSet.pollFirst();
        System.out.println(  treeSet.pollFirst());
        System.out.println(treeSet);

        System.out.println(str.concat("******"));



    }
}
