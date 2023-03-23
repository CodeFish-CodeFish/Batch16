package MentoringWithKutman;

import java.util.Scanner;

public class Mentoring2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number= scanner.nextInt();

        if(number%2==0){
            System.out.println("EVEN");
        } else if (number%2!=0) {
            System.out.println("ODD");
        }
        else {
            System.out.println("TRY AGAIN");
        }

        System.out.println("++++++++++++++++++++++++++++");

        System.out.println("Enter 1st number:");
        int n1=scanner.nextInt();
        System.out.println("Enter 2nd number:");
        int n2= scanner.nextInt();

        if(n1>n2){
            System.out.println(n1+" is greater than "+n2);
        }
        else if(n2>n1){
            System.out.println(n2+" is greater than "+n1);
        }
        else {
            System.out.println(n1+" is equal to "+n2);
        }

        System.out.println("+++++++++++++++++++++");


        System.out.println("Enter 1st number:");
        int firstNumber=scanner.nextInt();//123
        System.out.println("Enter 2nd number:");
        int secondNumber=scanner.nextInt();//456
        System.out.println("Enter 3rd number:");
        int thirdNumber=scanner.nextInt();//12

        int largestNumber=firstNumber;//123
        if (secondNumber>largestNumber){
            largestNumber=secondNumber;//456
        }
        if(thirdNumber>largestNumber){//12>456?
            largestNumber=thirdNumber;
        }

        System.out.println("The largest number is "+largestNumber);
    }
}
