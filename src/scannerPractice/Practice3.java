package scannerPractice;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        /*
        find out Body Mass Index(BMI) for user
        The formula for BMI is weight in kilograms divided by height in meters squared.
        BMI = weight / height * height
        take weight and height by using scanner

        If your BMI is 18.5 to 24.9, it falls within the Healthy Weight range.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your weight in kg");

        double weight = scanner.nextDouble();

        System.out.println("Please enter your height in meters");

        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        System.out.println( "Your BMI is: "+bmi );

    }
}
