package inheritance.inheritancePractice1;

import inheritance.inheritancePractice4.Book;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();

        System.out.println(animal.name);
        animal.name = "Animal";

        WildAnimal wild = new WildAnimal();

        System.out.println(wild.name);
        wild.name = "Wild";

        Lion lion = new Lion();
        System.out.println(lion.name);
        lion.name = "Simba";

        animal.eat();
        wild.eat();
        lion.eat();

        DomesticAnimal domestic = new DomesticAnimal();
        domestic.sleep();
        System.out.println("============");
        wild.hunt();
        lion.hunt();
        // animal.hunt();
        // domestic.hunt();
        System.out.println("_______________");
        lion.eat();
        wild.eat();//
        domestic.sleep();
        lion.sleep();
        wild.sleep();
        System.out.println("+++++++++++++++++");

        Cat cat = new Cat();
        Double d = cat.relax();
        System.out.println(d * 10);

        Lion littleLion = cat.takingNap();

        System.out.println(littleLion);
        System.out.println( littleLion.name  );

        Book book = new Book("*JAVA*", 300);
        System.out.println( book.pageNumber ); //
    }

}
