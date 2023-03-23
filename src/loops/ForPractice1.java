package loops;

public class ForPractice1 {
    public static void main(String[] args) {

        // "1. Hello John" -- for 5 times by using for loop
        int n = 5, c = 1;
        while(n > 0){
            System.out.println(c +". Hello John");
            n--;
            c++;
        }

        System.out.println("++++++++++++++++++++++");

        int x = 9;

        for ( int num = 5, count = 1  ;  num > 0   ; num-- , count++ ){


            System.out.println(count + " - Hello Marry");

            System.out.println(x);
        }
      //  System.out.println( count ); since count is a local variable in the for loop
        // you cannot reach/use count out of for loop

        System.out.println( x ) ;











    }
}
