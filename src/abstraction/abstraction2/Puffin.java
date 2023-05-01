package abstraction.abstraction2;

public class Puffin extends CanRun implements CanFly, CanSwim {

    @Override
    public void speedingUp() {
        super.speedingUp();
    }
    @Override
    public void fly() {
        System.out.println("Puffin fly");
    }
    @Override
    public void landing() {
        System.out.println("puffin landing");
    }
    @Override
    public void run() {
        System.out.println("puffin running");
    }
    @Override
    public void swim() {
        System.out.println("puffin is swimming");
    }
    @Override
    public void diving() {
        System.out.println("puffin is diving");
    }
}
