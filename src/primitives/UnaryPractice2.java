package primitives;

public class UnaryPractice2 {

    public static void main(String[] args) {

        int burger = 10;

        int drink = burger++ + ++burger + burger;

        System.out.println("drink is now " + drink); //

        System.out.println("Burgers now " + burger);//

        int a = 5, b = ++a + 5, k = ++b + a++;

        --k;
        a = --k;
        System.out.println(--a); // 15, 11, 10, 17, 12, 16, 18
        System.out.println(  5+5 );

    }
}
