package inheritance.inheritancePractice2;

public class Vehicle {


    //   Variables:
    protected String model;
    Integer year;
    public String brand;

    //methods
    public void move() {
        System.out.println("vehicle is moving");
    }
   public boolean stop(){
       System.out.println("Vehicle is stopping");
       return true;
   }

    protected boolean start(){
        System.out.println("Vehicle is starting");
        return true;
    }

    //-->return <OneOfObject-Vehicle/Car>
    Vehicle accelerate(){

        System.out.println("Vehicle is getting faster");

        return new Vehicle();
    }


}
