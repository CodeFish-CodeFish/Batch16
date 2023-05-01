package abstraction.abstraction2;

public class Duck extends Animal implements CanFly, CanSwim {

    public void fly(){
        System.out.println("Duck flies");
    }
    public void landing(){
        System.out.println("Duck is landing");
    }

    public void swim(){
        System.out.println("Duck is swimming");
    }
    public void diving(){
        System.out.println("Duck is diving for food");
    }


}
