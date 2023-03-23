package loops;

public class ForEachPractice1 {

    public static void main(String[] args) {

        int[] zipCodes = {222,333,555,777,909};

        // print out every zipcodes one at a time

           for ( int number : zipCodes){

               System.out.println(number);

               System.out.println( zipCodes[3]);
        }

    }
}
