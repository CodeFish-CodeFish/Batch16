package objectPractice;

public class TestAnimal {
    public static void main(String[] args) {


        Animal cat = new Animal();

        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println("color of cat " + cat.color);

        cat.name = "Tom";
        System.out.println(cat.name);

        cat.age = 3;
        System.out.println(cat.age);

        String nameAsUpperCase = cat.name.toUpperCase();
        System.out.println(nameAsUpperCase);

        System.out.println("+++++++++++++");
// create a new animal, initialize all variables and pint them out

        Animal bird = new Animal();

        System.out.println(bird.color);
        bird.name = "Tweeter";
        bird.color = "Yellow";
        bird.age = 15;
        System.out.println(bird.name);
        System.out.println(bird.color);
        System.out.println(bird.age);

        cat.sleep();

        bird.sleep();

        // create a method which is called 'eat'
        // this method will send a message like >> "... is eating"
        // call the eat method with a new animal object
// "brown dollar is eating

        Animal capybara = new Animal();
        capybara.name = "Dollar";
        capybara.color = "GREEN";
        capybara.eat();


        // want animal to gain calories as they eat

        System.out.println(cat.calories );

        System.out.println( capybara.calories  );

    }

}
