package ifStatement;

public class ElseIfPractice1 {
    public static void main(String[] args) {

        /*
        you will pick a number between 1 and 15

        when the number is 1 - 5 --> "your number is in range of 1 -5"
        when the number is 6 - 10 --> "your number is in range of 6 - 10"
        when the number is 11 - 15 --> "your number is in range of 11 - 15"
         */

        int number  = -23 ;

        if ( number >= 1 && number <= 5){
            System.out.println( "your number is in range of 1 - 5");
        }else if(number >=6 && number <= 10){
            System.out.println("your number is in range of 6 - 10");
        }else if( number >= 11 && number <= 15){
            System.out.println("your number is in range of 11 - 15");
        }else{
            System.out.println("Out of Range");
        }

    }
}
