package objectPractice;

public class TestCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        calculator.sumOfTwo();
        calculator.sumOfTwo();
        calculator.sumOfTwo();
        System.out.println( "---------");

        calculator.sum2(5, 6);
        calculator.sum2( 11, 88);
        System.out.println( "--+++++----++---");

        calculator.total(10,10);
        System.out.println(  calculator.total(5,5)       );

      //  System.out.println(   calculator.sum2(1,1)  );
      int total1 =   calculator.total(2,2);

        System.out.println(">>>> this is from total1 variable "+total1);

    }
}
