package abstraction.abstraction2;

public class Fish extends Animal implements CanSwim{

    int eye = 2;

    public void swim(){
        System.out.println("Fish swims");
    }

    public void diving(){
        System.out.println("Fish dives");
    }


}
