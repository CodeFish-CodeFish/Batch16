package arrayList;

import java.util.ArrayList;

public class Practice2 {
    /*
    create a method that will print out names of drinks from an ArrayList by making
    each drink's name as uppercase
     water --> WATER, Coke --> COKE
     */

    public void drinkPrinter(ArrayList<String> drinks) {

        for (String drink : drinks) {

            System.out.println(drink.toUpperCase());
        }
    }

    public void drinkPrinter1(ArrayList<String> drinks) {

        for (int i = 0; i < drinks.size(); i++) {

            System.out.println(drinks.get(i).toUpperCase());

        }
    }

    // create a method to
    // print out drink that has 5 letters or more on its name

    public void drinkPicker(ArrayList<String> drinks) {
        for (String drink : drinks) {
            if (drink.length() >= 5) {
                System.out.println(">>>> " + drink + " <<<<");
            }
        }
    }
    public void drinkPicker1(ArrayList<String> drinks) {
        for (int i=0; i< drinks.size(); i++) {
            if (drinks.get(i).length() >= 5) {
                System.out.println("** " +drinks.get(i) + " **");
            }
        }
    }
    public static void main(String[] args) {
        Practice2 practice2 = new Practice2();
        ArrayList<String> beverages = new ArrayList<>();
        beverages.add("water");
        beverages.add("Water");
        beverages.add("Coke");
        beverages.add("PepSI");
        practice2.drinkPrinter(beverages);
        System.out.println("++++++++++++++");
        practice2.drinkPrinter1(beverages);
        System.out.println("++++++++++++++");
        practice2.drinkPicker(beverages);
        System.out.println("++++++++++++++");
        practice2.drinkPicker1(beverages);
    }
}
