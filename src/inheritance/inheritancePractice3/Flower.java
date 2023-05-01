package inheritance.inheritancePractice3;

public class Flower {

    String type, color, size;
    double price;

    //METHOD
    public void watering(int times){

        System.out.println("Flower getting water for "+times +" times.");
    }

//    public Flower(){
//        System.out.println("No param Constructor");
//    }

    public Flower(double price){
        this.price = price;
        System.out.println("Constructor with Price param");

    }

    public Flower(String type, String color, String size) {
        this.type = type;
        this.color = color;
        this.size = size;
        System.out.println("Three Argument Constructor");
    }
}
