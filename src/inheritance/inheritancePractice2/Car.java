package inheritance.inheritancePractice2;

public class Car extends Vehicle {

    //variables:
   String model;
   String  engineType;

   // Methods:
   // Override move(); --> Car is moving

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    //Override accelerate(); --> return COVARIENT-TYPE and calls model from parent class

    @Override
    public Car accelerate(){
        System.out.println("Car is getting faster");

        System.out.println( "++++ "+ model +" +++++");
        System.out.println(  super.model );

        return new Car();
    }


}
