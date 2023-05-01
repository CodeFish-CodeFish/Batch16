package objectPractice;

public class Computer {

    String brand;
    double price;
    String color;

    public void playGame(int hour) {
        System.out.println("Gaming" + hour);
    }

    public Computer() {
        System.out.println("This is No Argument Constructor");
    }

    public Computer(String brand) {

        this.brand = brand;

        System.out.println("One argument constructor");
    }


}
