package ifStatement;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        /*
        Use scanner to get an integer number between 1 and 5 from user
        if the number is 1 --> "Monday"
        if the number is 2 --> Tuesday
         ...
        if the number is 5 --> Friday
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer value between 1 and 5");
        int num = input.nextInt();
        // if the number is 1 --> "Monday"
        if(num==1){
            System.out.println("It is Monday");
        }
        if (num==2){
            System.out.println("It is Tuesday");
        }
        if (num==3){
            System.out.println("This is Wednesday");
        }
        if (num==4){
            System.out.println("It is Thursday");
        }if (num==5){
            System.out.println("It is Friday");
            System.out.println("it is last day of week");
        }
        // user gives number more than 5 less than 1 ???
        // when user enters number more than 5 less than 1,print >> "your entry is out of range"
//        if(num > 5){
//            System.out.println("your entry is out of range");
//        }
//        if (num < 1){
//            System.out.println("your entry is out of range");
//        }
        if(num > 5 || num < 1){
            System.out.println("your entry is out of range");
        }

    }
}
