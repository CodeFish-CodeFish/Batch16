package abstraction.abstraction2;

public class Test {

    public static void main(String[] args) {
        // you cannot create an object from interface
        // CanFly fly = new CanFly();
        //CanSwim swim = new CanSwim();

        Bird bird = new Bird();

        System.out.println( bird.WINGS);

        // variables in interface are static and final by default
       // bird.WINGS = 5;

        bird.fly();
        bird.landing();

        Fish fish = new Fish();
        System.out.println(  fish.GILLS  );

        fish.swim();
        fish.diving();

        Duck duck = new Duck();

        System.out.println( duck.GILLS);
        duck.diving();
        duck.fly();
        duck.landing();
        duck.swim();

        duck.eat();
        System.out.println("==============");
        Puffin puffin = new Puffin();

        puffin.eat();
        puffin.run();

        System.out.println("++++++++++++");
        System.out.println( fish.eye); //2
        fish.eye = 6;
        System.out.println( fish.eye); // 6

       // fish.GILLS = 9;

        Fish fish1 = new Fish();
        fish1.swim();
        Animal fish2 = new Fish();
            // fish2.swim();
        CanSwim fish3 = new Fish();
        fish3.swim();

        CanSwim duck2 = new Duck();

        duck2.swim();


    }
}
