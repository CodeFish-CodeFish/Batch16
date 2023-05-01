package objectPractice;

import java.time.LocalDate;

public class MethodPractice1 {

    /*
    create a method to calculate your age and return it
     */
    public int ageCalculator(int birthYear) {
        int currentYear = LocalDate.now().getYear();

        int age = currentYear - birthYear;
        return age;

    }
    // create a method that will take three parameters,  two numbers and a name for operation
    // it will return the result based on operation type

    // 5,4 Multiply --> return 20
    // 5,4 Add --> return 9
    // 5,4 subtract --> 1

    public double calculator(double n1, double n2, String operation) {
            double d = 0;
        if (operation.equalsIgnoreCase("multiply")) {

            d = n1 * n2;
           // return n1 * n2;

        } else if (operation.equalsIgnoreCase("add")) {

            d = n1 + n2;
           // return n1 + n2;
        } else {

            d = n1-n2;
           // return n1 - n2;
        }
        return d;
    }
    public static void main(String[] args) {

        MethodPractice1 sam = new MethodPractice1();

        System.out.println(sam.ageCalculator(2000));
        int age = sam.ageCalculator(2000);
        System.out.println("your age will be " + (age + 1) + " next year");

        double result1 = sam.calculator(5, 4, "multiply");
        System.out.println(result1);
        double result2 = sam.calculator(5, 4, "add");
        System.out.println(result2);
    }


}
