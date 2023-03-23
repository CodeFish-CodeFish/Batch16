package ifStatement;

public class ElsePractice4 {

    public static void main(String[] args) {
        /*when your total purchase amount is  $1000 or more you get %20 discount
            -if the total purchase amount less than $1000, you get %5 discount

            - find out discount amounts and SHOW to user
            - find out final payment and SHOW it to user

             100 * 0.20
         */
        double amount = 700;

        if ( amount >= 1000){

            double discount20 = amount * 0.20;
            double paymentAfter20 = amount - discount20;

            System.out.println("Your 20% discount is : "+discount20);
            System.out.println("Your final payment after 20% discount is: "+ paymentAfter20);

        }else{

            double discount5 = amount * 0.05;
            double paymentAfter5 = amount - discount5;

            System.out.println("Your 5% discount is: " + discount5);
            System.out.println("Your final payment after 5% discount is: "+ paymentAfter5);
        }

    }
}
