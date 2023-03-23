package primitives;

public class MultipleVariables {
    public static void main(String[] args){

        // you can create multiple variables on the same line/statement
            // if those variables shares same data type

        int number1 = 9;
        int number2 = 8;
        int number3 =9;

        int count1 = 3, count2 = 7, count3= 5, count4 = 10;

        int money = count1 * 8, money2 = 24 * 10 ;
        count2 = 77;

        System.out.println( money2);

        System.out.println( count4);

        int studentNumber, day = 40, numberOfQuestion = 95;

        studentNumber = numberOfQuestion / day;
        System.out.println("Student number is "+studentNumber);

        char letter1 = '%', letter2 = 'r', letter3, letter4 = 'A';

        double result  = letter2 * letter1;

        System.out.println("Result is "+result);

        letter3 = letter4;
        System.out.println( letter3); // A

    }
}
