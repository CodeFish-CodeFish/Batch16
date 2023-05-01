package inheritance.inheritancePractice1;

public class Lion extends WildAnimal {


    String name;

    @Override
    public void hunt() {
        System.out.println("Lion is hunting");
    }

    @Override
    public void eat() {
        System.out.println("Lion is eating it's own prey");
    }

    @Override
    public String toString() {
        return "Lion{" +
                "name='" + name + '\'' +
                '}';
    }
}
