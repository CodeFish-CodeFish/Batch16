package inheritance.inheritancePractice1;

public class Cat extends DomesticAnimal {


    @Override
    public int jump() {

        System.out.println("Cat is so cute, when it jumps to high");
        return 0;
    }

    public Double relax() {

        System.out.println("Cat is on the pillow");

        return 0.1;
    }

    @Override
    public Lion takingNap() {

        System.out.println("Cat is taking NaP");

        Lion lion = new Lion();
        lion.name = "***";
        return lion;
    }
}
