package ternaryOperator;

public class Practice3 {
    public static void main(String[] args) {

        double money = 25.50, tax = 13.5;

        String str = money> 20 && tax > 20  ? "you will pay extra" : "you will be Ok";

        System.out.println( str);

        int number = 2;

        String answer = number == 0 ? "yes" : "no";

        System.out.println( answer);

        if (answer.equals("no")){
            System.out.println("**********");
        }


        // Nested Ternary

        String str2 = "flower";
        int num1 = 9;

        String result2 =  str2.contains("l") ? num1 >=11 ?  "Red" : "Blue"    : "WHITE";

        System.out.println(result2);


        System.out.println("==================");



        String result3 =  str2.contains("x") ? ( num1 >=11 ?  "Red" : "Blue" ) :  (num1 == 9 ? "Pink" : "GREEN") ;

        System.out.println( result3);

        System.out.println(  str2.contains("x") ?  num1 >=11 ?  100 : "Blue"  :  num1 == 9 ? 200 : 'A' );

        System.out.println( str2.contains("x") ? "y"   : "Test" ) ;



    }
}
