package inheritance.inheritancePractice3;

import java.util.concurrent.Flow;

public class Rose extends Flower {
    String size;
    String smell;
    public Rose(){
        super(8.9);
    }

    public Rose(String size){
        super(7.7);
        this.size = size;
    }

    public Rose(String type, String color, String size, String size1, String smell) {
        super(type, color, size);
        this.size = size1;
        this.smell = smell;
    }

    public static void main(String[] args) {

        Flower flower = new Flower(4.5);
        flower.watering(5);
        System.out.println( flower.price); ///

        Rose rose = new Rose();
        rose.watering(10);

        System.out.println(rose.price);

        Rose rose2 = new Rose("small");
        System.out.println(rose2.price);

        System.out.println( rose2.size);

        Rose rose3 = new Rose("Rose","Red","SMALL","Medium","Good");
        System.out.println(rose3.price);
        rose3.price = 1.0;
        System.out.println( rose3.price);
        System.out.println( rose3.size);//
        Flower flower1 = new Flower(5);
        System.out.println(flower1.size); //
        flower1.size = "Large";





    }

}
