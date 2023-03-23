package primitives;

public class Practice1 {
    public static void main(String[] args){

        byte b1= 9;
        System.out.println( b1);

        byte b2 = 127;
        byte b3 = -128;
       // byte b4 = 1.2;
        System.out.println( b3  );
        short  sh = 1;
        short sh1 = 3500;

        int i = 23;

       //  int i2 = 5.5;

        float fl = 6.8f;
        float fl2 = 5.6F;

        double db = 4.56d;
        double db2 = 3; // 3 => 3.0
        System.out.println(  db ); // 4.56

        System.out.println( db2 ); //
        int number = 3;
        System.out.println( number);

        double count;

        count = 33.5;
        count = 99.8;

        count = count * count - 2 + 1;
        count = 8;
        System.out.println( count + 1); //


        char model = 'T';
        System.out.println(  model); //

        char symbol = '@';
        char symbol1 = '6';
        System.out.println( symbol1);
        char symbol2 = '9';
        System.out.println( symbol1 + symbol2 );

        boolean isItHere = true;
        boolean isItBreakTime = false;
        System.out.println( isItBreakTime);


        // long data type

        long number5 = 12;

        long number6 = 252256257373568l;

        // underscores can be used between digits
        long number7 = 60_000_000_000L;



    }
}
