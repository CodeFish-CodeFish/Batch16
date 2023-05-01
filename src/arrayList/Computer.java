package arrayList;

import java.util.ArrayList;

public class Computer {
    String make, model;

    double price, screenSize;

    public Computer(String make, String model, double price, double screenSize) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    public static void priceRange(ArrayList<Computer> computers) {

        for (int i = 0; i < computers.size(); i++) {

            if (computers.get(i).price >= 500 && computers.get(i).price <= 1300) {

                System.out.println(computers.get(i).make + " -- " + computers.get(i).model);
            }
        }
    }


    public static Computer priceRange2(ArrayList<Computer> computers) {
        Computer computer = null;

        for (int i = 0; i < computers.size(); i++) {

            if (computers.get(i).price >= 500 && computers.get(i).price <= 1300) {

                computer = computers.get(i);
            }
        }
        return computer;
    }

    public static ArrayList<Computer> priceRange3(ArrayList<Computer> computers) {
            ArrayList<Computer> devices = new ArrayList<>();

        for (int i = 0; i < computers.size(); i++) {

            if (computers.get(i).price >= 500 && computers.get(i).price <= 1300) {

              devices.add( computers.get(i)  );
            }
        }
        return devices;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }
}
