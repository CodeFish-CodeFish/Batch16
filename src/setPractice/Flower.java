package setPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class Flower {

    String type, color, size;//(small, medium, large ),
    Double price;


    public Flower(String type, String color, String size, Double price) {
        this.type = type;
        this.color = color;
        this.price = price;

        if (this.size != null && (this.size.equalsIgnoreCase("small")
                || this.size.equalsIgnoreCase("medium")
                || this.size.equalsIgnoreCase("large")) ){
            this.size = size;
        }else {
            this.size = "SMALL";
        }

    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public Double getPrice() {
        return price;
    }

    public void findFlower(HashSet<Flower> bouquet){

        for ( Flower flower : bouquet ){

            if (flower.color.equalsIgnoreCase("red")){
                System.out.println(  flower.type + " is the flower that has " + flower.color + " color."  );

                // ..type.. is the flower that has ...red... color
            }
        }
    }


}
