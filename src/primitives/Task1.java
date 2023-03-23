package primitives;

public class Task1 {
    public static void main(String[] args) {
        /*
        A phone is $875 for sale,you can make monthly payment of $100
    if you go with the deal what will be the last month payment?
    -solve it by applying modulus operator-
         */
        double phone$ = 875;
        double payment$ = 100;
        double lastPayment = phone$ % payment$;

        System.out.println( "Your last payment will be $"+ lastPayment);

        // how many payments wil you make?

        System.out.println(  phone$ / payment$    ); //


    }
}
