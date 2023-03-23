package Projects;

import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much soms do you have?");
        int som = scanner.nextInt();
        int oneDollar = 80;// 1$=80soms
        System.out.println("Your " + som + " soms is $" + (som / oneDollar));

        System.out.println("==================================");

        double oneInch = 0.0254;
        System.out.println("Please enter the number of inches:");
        double userInches = scanner.nextDouble();
        System.out.println("Your " + userInches + " inches is equal to " + (userInches * oneInch) + " meters");
        System.out.println("++++++++++++++++++++++++++++++++++");

        int minutes = 3456789;
        int oneHour = 60;
        int oneDay = oneHour * 24;//1440
        int oneYear = oneDay * 365;//525600

        int resultYear = minutes / oneYear;// will give us a number of years
        int resultDay = minutes % oneYear / oneDay; //will give us number of days from the remainder

        System.out.println(minutes + " minutes is approximately " + resultYear + " years and " + resultDay + " days");
        System.out.println("+++++++++++++++++++++++++++++++++++");

        double numberOfQuarters = 5;
        double numberOfDimes = 4;
        double numberOfNickles = 3;
        double numberOfPennies = 2;

        double oneQuarter = 0.25;
        double oneDime = 0.1;
        double oneNickle = 0.05;
        double onePennie = 0.01;

        double result = (numberOfQuarters * oneQuarter) + (numberOfDimes * oneDime) + (numberOfNickles * oneNickle) + (numberOfPennies * onePennie);

        System.out.println("The total in dollars is $" + String.format("%.2f", result));// method to print 2 digits after dot
        System.out.println("+++++++++++++++++++++++++++++++++");



        double dollarAmount=2.36;
        double balance=dollarAmount;

        numberOfQuarters=dollarAmount/oneQuarter;//2.36/0.25==9
        dollarAmount=dollarAmount%oneQuarter;//2.36%0.25==0.11
        numberOfDimes=dollarAmount/oneDime;//0.11/0.10==1
        dollarAmount=dollarAmount%oneDime;//0.11%0.10==0.01
        numberOfNickles=dollarAmount/oneNickle;//0.01/0.05==0
        dollarAmount=dollarAmount%oneNickle;//0.01%0.05==9
        numberOfPennies=dollarAmount/onePennie;//0.01/0.01==1;

        System.out.println("$"+balance+" will make "+String.format("%.0f",numberOfQuarters)+" quarters "+String.format("%.0f",numberOfDimes)+" dime "+String.format("%.0f",numberOfNickles)+" nickels and "+String.format("%.0f",numberOfPennies)+" pennies");
    }
}