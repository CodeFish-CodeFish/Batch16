package variables;

public class Practice3 {

    public static void main(String[] args){


        // Declaring and Initializing variables

        int number; // Declaring variable

        number = 7; // Initializing variable

        System.out.println(  100 + number); //107

        System.out.println( number + number + number - number); //14

        int result = number * number;
        System.out.println( "Result is => " + result + " Is it correct?");

        number = 15; // reassignment --> giving a new value to the variable

        System.out.println( number + 1); // 16

        int number2 = 24; // Declaring and Initializing at the same time/line

        int  studentNumber;

      //  System.out.println(   studentNumber ); Compile time error since we did not initialize
                                                // studentNumber with a value

        studentNumber = 48;
       // System.out.println( studentNumber);

        int _numberOfItems = 9;
        int $numberOfItems = 9;
        int number_Of_Items_ = 9;
        int number5OfItems= 9;
        int numberOfItems5 = 9;

       // int _numberOfItems =12; Same naming is not allowed
        int  num;
        num = 9;

      //  int  void = 12; you cannot use java reserved words in your variable names (Ex: void)
       // int class = 11;

    }
}
