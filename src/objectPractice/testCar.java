package objectPractice;

public class testCar {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Toyota");
        Car car3 = new Car("Toyota");
        Car car4 = new Car("Toyota");
        Car car5 = new Car("Lexus");

        car1.move();
        car5.move();

        car1 = null;
        car2= null;

        System.gc();

        System.out.println( car4 .name );


        System.out.println( car4); //
        System.out.println(car5);



        car5.move();
        car5.move(70);





        System.out.println("--------");
        Student student = new Student("Alex");
        student.info();
        System.out.println( student );
    }
}
