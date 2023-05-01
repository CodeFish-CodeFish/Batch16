package objectPractice;

public class PetStaticPractice {

    String name;
    int age;
    static  int foodAmount = 20;

    public PetStaticPractice(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void eat(){
        foodAmount = foodAmount-1;
        System.out.println(" eating. New food amount is: "+ foodAmount);
    }

    public static void main(String[] args) {

        PetStaticPractice pet1 = new PetStaticPractice("King", 10);
        PetStaticPractice pet2 = new PetStaticPractice("Dollar", 3);

        System.out.println(pet1.name);
        System.out.println(pet1.age);
        System.out.println(pet1.foodAmount);
        pet1.eat();
        pet1.eat();
        System.out.println("------------");
        System.out.println( pet2.name);
        System.out.println(pet2.age);
        System.out.println(pet2.foodAmount);
        pet2.eat();

    }
}
