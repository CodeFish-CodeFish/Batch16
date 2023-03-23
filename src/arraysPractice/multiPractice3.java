package arraysPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multiPractice3 {
    public static void main(String[] args) {

        int[][] test = { {2,3,6,7},  {4,5,3},   {1,6,7},    {1,2,8,8 } ,{2}   };

        // want to know size of each inner array
        // how can you print size of each array >> 4, 3, 3, 4, 1

        int[] lengths = new int[test.length];
        for (  int i=0; i< test.length; i++  ){

            System.out.println( test[i].length );

            lengths[i] = test[i].length;
        }
        System.out.println("------------");
        System.out.println(Arrays.toString(lengths));
       String str =  Arrays.toString(lengths);
        System.out.println("------------");

        for ( int[] individual : test){

            System.out.println(   individual.length );

        }
    }
}
