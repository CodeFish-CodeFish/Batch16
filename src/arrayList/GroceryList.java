package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    /*
    Create a java class(GroceryList) that keeps track of a list of groceries using an ArrayList.
    The program should have the following functionality:
    Allow the user to add an item to the grocery list
    Allow the user to remove an item from the grocery list
    Allow the user to view the current list of groceries
    Allow the user to check if a specific item is on the grocery list
     */
    ArrayList<String> groceryList=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void removeGroceryItem(String item){
        groceryList.remove(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }

    public boolean onList(String item){
        return groceryList.contains(item);
    }

    public static void main(String[] args) {
        GroceryList list=new GroceryList();

        list.addGroceryItem("Apples");
        list.addGroceryItem("Bananas");
        list.addGroceryItem("Oranges");

        list.printGroceryList();

        System.out.println("Enter the item you want to add to the list:");
        String newItem=list.scanner.nextLine();
        list.addGroceryItem(newItem);

        list.printGroceryList();

        /*
        remove item you got from user, if there is no such kind of item than say "We do not have that item in grocery list"
         */
        System.out.println("Enter the item you want to remove to the list:");
        String removeItem=list.scanner.nextLine();

        if(list.onList(removeItem)){
            list.removeGroceryItem(removeItem);
        }
        else {
            System.out.println("We do not have that item in grocery list");
        }
        list.printGroceryList();



    }

}
