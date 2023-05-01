package abstraction.abstraction1;

public class Campus extends Student {

    public Campus(String name, int age){
        super(name, age);
    }

    public int attend(){

        System.out.println("Campus student in the class now!");
        return 3;

    }

    public void eat(){

        System.out.println("Campus student is eating in Kitchen");
    }
    // since 'Campus' class is non-abstract class,
    // you cannot have abstract method in it

    // public abstract void run();

}
