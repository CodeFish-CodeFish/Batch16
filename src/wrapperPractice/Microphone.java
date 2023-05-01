package wrapperPractice;

public class Microphone {
    String brand, color, price;

    public Microphone(String brand, String color, String price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }



    public static void priceChecker(Microphone[] microphones){

        for (int i=0; i< microphones.length; i++){

            double price = Double.parseDouble(   microphones[i].price    );
            if (price <50.0 ){

                System.out.println("Found it! Price is: "+ price);
                System.out.println("**info**"+ microphones[i].brand);
                System.out.println("**info**"+ microphones[i].color);

            }
        }

    }

}
