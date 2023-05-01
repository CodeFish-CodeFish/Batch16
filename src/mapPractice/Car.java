package mapPractice;

public class Car {
    /*
    Create a class car with instance variables like VIN,color,year,make, model
    Create a class Dealership with instance variable as Map
     */
    String VIN,color,make,model;
    int year;

    public Car(String make, String model,int year,String VIN, String color ) {
        this.VIN = VIN;
        this.color = color;
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
