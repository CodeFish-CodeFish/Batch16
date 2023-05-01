package inheritance.inheritancePractice5;

public class Shirt {

    final String LOGO = " :) ";
    double price;
    final String COLOR = "Blue";
    final String[] arr = {"a", "b", "c"};

    // create a constructor to init instance variables

    public Shirt(double price) {

        // this.logo = logo;
        // this.COLOR = color;
        this.price = price;
    }

    final public void washed() {

      //  arr = new String[5];

        System.out.println("Washable Shirt");
    }

}
