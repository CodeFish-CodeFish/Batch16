package accesModifiers;

public class ChildAnimal extends Animal{


    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.name = "Child";

        animal.runPublic();
        animal.runDefault();
        animal.runProtected();

    }

}
