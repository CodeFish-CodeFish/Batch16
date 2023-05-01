package objectPractice;

public class Car {

    String name;

    public void move(){
        System.out.println( "Car is moving");
    }

    public Car(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("*********");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    // overloading method
    // overload 'move' method and call it in the test class

    public void move(int speed){
        System.out.println("Car is moving with speed of "+speed);

    }

}
