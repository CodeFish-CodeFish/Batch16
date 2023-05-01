package objectPractice;

public class PetTest {

    public static void main(String[] args) {
        PetStaticPractice pet1 = new PetStaticPractice("Orange",1);

        pet1.eat();

        PetStaticPractice.eat();

    }
}
