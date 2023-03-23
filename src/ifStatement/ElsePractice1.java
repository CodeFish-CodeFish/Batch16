package ifStatement;

public class ElsePractice1 {
    public static void main(String[] args) {
        int capacity = 20, studentNumber = 15;

        // "We have spot for you" when studentNumber is less than 20
        // "We do not have spot, you may want to wait for next batch"

        int a = 25 * 5, b = a +100;
        System.out.println("the number b : "+ b);

        if ( studentNumber <= capacity){

            System.out.println("We have spot for you");
        }else {
            System.out.println("We do not have spot, you may want to wait for next batch");
        }

        System.out.println("this is after first if - else practice");

        if( b > 150){
            System.out.println("the number b is greater than 150");
        }else{

            System.out.println("the number b is less than 150");
        }
        System.out.println("===================");
        if (4 < 5 )
            System.out.println("IF");
       // System.out.println("******");
        else
            System.out.println("ELSE");
        System.out.println("+++++++++");
    }
}
