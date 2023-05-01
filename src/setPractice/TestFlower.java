package setPractice;

import java.util.HashSet;

public class TestFlower {

    // -create a method to find out red flowers
    public void findFlower(HashSet<Flower> bouquet){

        for ( Flower flower : bouquet ){

            if (flower.color.equalsIgnoreCase("red")){
                System.out.println(  flower.type + " is the flower that has " + flower.color + " color."  );

                // ..type.. is the flower that has ...red... color
            }
        }
    }
    public static void main(String[] args) {
        TestFlower test = new TestFlower();
        HashSet<Flower> vase = new HashSet<>();

        Flower f1 = new Flower("Rose", "Red","abcd", 5.99);
        Flower f2 = new Flower("Violet", "Purple","medium", 3.99);
        Flower f3 = new Flower("Lily", "Red","Large", 7.99);
        Flower f4 = new Flower("Rose", "yellow","small", 0.99);

        vase.add(f1);
        vase.add(f2);
        vase.add(f3);
        vase.add(f4);
          test.findFlower(vase);
        System.out.println("++++++++++++++");
        f1.findFlower(vase);

        System.out.println( f1.size);
    }


}
