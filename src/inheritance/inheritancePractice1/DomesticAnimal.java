package inheritance.inheritancePractice1;

public class DomesticAnimal extends Animal {


    @Override
    public void sleep() {

        System.out.println("Domestically sleeping");
    }


    int jump() {
        System.out.println("Jump in Domestic");
        return 0;
    }

    public Number relax(){
        System.out.println("Relaxing in domestic");
        return 0;
    }

    public WildAnimal takingNap(){
        System.out.println("Nap domestic");
        WildAnimal w1 = new WildAnimal();
        return w1;
    }



}
