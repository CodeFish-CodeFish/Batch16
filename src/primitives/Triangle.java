package primitives;

public class Triangle {

    public static void main(String[] args) {


        /*
       // find the area of a triangle if:
        base is= 13.5;
        height is=  56.4;
        //Area = b * h / 2;
       */

        double base = 13.5;
        double height = 56.4;

        double area = base * height / 2;

      //  double area1 = base * height *  0.5;

        System.out.println("Area is ==> "+  area);

        // Arithmetic operations with CHAR

        char letter = 'y';
        char letter2 = 'w';

        System.out.println(   letter * letter2 + letter2 - letter );

        int number = letter * letter2 + letter2 - letter;

        System.out.println(  'T' % 'a'  );

        // System.out.println( true + true  ); You cannot apply mathematical operations on boolean variables


      //  System.out.println(   "java" * "selenium"     ); You cannot apply mathematical operations on String values



    }
}
