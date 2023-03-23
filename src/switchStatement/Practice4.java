package switchStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
         /*
         switch
        ask user to enter two numbers and name of an operator (operator names like: add, subtract, multiply)
        please use proper logical implementation for each operation to get correct result
        -apply matching operator and print the result
        Example output: if the operation is: multiplication
							  result is: firstNumber * secondNumber
          */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter two number to work with");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("What math operation you want to do with your numbers? like: add, subtract, multiply ");

        String operation = scanner.next().toLowerCase();

        switch (operation){

            case "add":
                System.out.println( "Result is : "+ (num2+num1));break;
            case "subtract": if (num2 > num1){
                System.out.println("Result is : "+ (num2 - num1));
            }else {
                System.out.println("Result is : "+ (num1 - num2));
            }break;
            case "multiply":
                System.out.println("Result is : "+(num2 * num1));
               break;
            case "divide":
                System.out.println("Result is : "+(num2 / num1));
                break;
            default:
                System.out.println("Not a valid operator, please try again");break;
        }

    }
}
