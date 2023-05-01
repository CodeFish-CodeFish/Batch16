package objectPractice;

public class CatTest {

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.name = "Ginger";
        cat.run("West");
        System.out.println("========");
        cat.foodAmount = 20;
        cat.run("Tree");

        System.out.println("========");
        System.out.println(cat.color);
        cat.color = "Gray";
        System.out.println(cat.color);

        cat.setColor("White");
        System.out.println(cat.color);

        cat.setGender('M');
        System.out.println(cat.gender);

        System.out.println("============");
        System.out.println(  cat.getGender() );

    }
}
