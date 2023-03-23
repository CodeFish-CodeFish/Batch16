package variables;

public class Practice2 {

    public static void main(String[] args){

        // Java is case sensetive
        int yellowApples = 4;
        int redApples = 8;
        int greenApples = 3;

        System.out.println( yellowApples + redApples + greenApples ); // 15

        System.out.println( "there are "+ (yellowApples+ redApples+ greenApples) + " apples in the basket"  );

        int totalNumberOfApples = yellowApples+ redApples +greenApples;

        System.out.println(   totalNumberOfApples  ); // 15

        int x = 6+ 9+11;
        System.out.println( x );

        // is expensive store
        // price for each apple
        // yellow --> $1, red--> $3, green--> $5
        // "The total cost of apples is ....."

        int yellowEach$ = 1;
        int redEach$ = 3;
        int greenEach$ = 5;
        System.out.println( "The total cost of apples is $" +   (yellowApples * yellowEach$ + redApples * redEach$ + greenApples * greenEach$ ) );

    }
}
