package exceptions;

import abstraction.abstraction2.Fish;

public class Practice2 extends NumberFormatException{

    // create a method, this method will give some type of exception
    // we are going handle that exception
    public static void run(String[] items){

        try{

            for (String item: items){
                System.out.println(item.concat(" ** "));
            }
        }catch (NullPointerException myException){
            System.out.println("To run you should not have null object, please check your data to not send null");
            System.out.println( myException.getMessage());
        }
    }

    public static void main(String[] args) {

        String[] items = {"Phone", "Cup", null, "Mic"};
        run(items);

        Fish fish = new Fish();
        fish.swim();
    }

}
