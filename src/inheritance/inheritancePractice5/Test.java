package inheritance.inheritancePractice5;

public class Test {

    public static void main(String[] args) {

        Shirt shirt = new Shirt(20);
        // shirt.COLOR = "Red";
        System.out.println(shirt.COLOR);

        System.out.println(shirt.COLOR.toLowerCase());

        T_Shirt t_shirt = new T_Shirt();
        //t_shirt.COLOR = "black";
        System.out.println(t_shirt.COLOR.charAt(2));

        shirt.washed();

        t_shirt.washed();

        t_shirt.info();

        Shirt shirt1 = new T_Shirt();





    }


}
