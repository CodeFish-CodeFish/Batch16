package arrayList;

import accesModifiers.Animal;

public class Child2Animal extends Animal {




    public static void main(String[] args) {



        Animal animal = new Animal();

        animal.name = "Child2";
        animal.runPublic();


        Child2Animal child2 = new Child2Animal();

        child2.color = "Blue";
        child2.name = "David";
        child2.runProtected();
        child2.runPublic();



    }
}
