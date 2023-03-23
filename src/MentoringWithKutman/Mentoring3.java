package MentoringWithKutman;

import java.util.Scanner;

public class Mentoring3 {
    public static void main(String[] args) {
        //Write a program to find the factorial value of any number entered through the keyboard.
        //5--> 1*2*3*4*5=120
        //10-->3628800
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();//
        int factorial=1;//0
        for (int i=1;i<=n;i++){// our for loop will run 5 times
            factorial*=i;//1*2*3*4*.....//factorial+=i
        }
        System.out.println("Factorial:"+factorial);

        //Two numbers are entered through the keyboard. Write a program to find the value of one
        // number raised to the power of another. (Do not use Java built-in method)

        //3^2=9-->3*3
        //3^3=27-->3*3*3              4^2=16-->4*4       5^3=125-->5*5*5

        System.out.println("Enter the base number:");
        int baseNumber=scanner.nextInt();//5
        System.out.println("Enter the power number:");
        int powerNumber=scanner.nextInt();//3
        int result=1;

        for (int i=1;i<=powerNumber;i++){//
            result*=baseNumber;//1*5*5*5=125
        }

        System.out.println(baseNumber+" to the power of "+powerNumber+" is "+result);

    }
}
