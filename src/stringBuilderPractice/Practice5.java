package stringBuilderPractice;

import java.util.Arrays;

public class Practice5 {

    public static void main(String[] args) {

        // Replace middle char with '$' from each word in a StringBuilder array
        // if the words length is odd number

        StringBuilder[] array  = new StringBuilder[5];
        StringBuilder[] brands = {new StringBuilder("adidas"), new StringBuilder("nike"), new StringBuilder("puma"), new StringBuilder("reebok"),new StringBuilder("apple")};

        for (int i=0; i< brands.length; i++){

            if ( brands[i].length() % 2 != 0){

                brands[i].replace( brands[i].length()/2, (brands[i].length()/2 )+ 1, "$"   );
            }

        }
        System.out.println(Arrays.toString(brands));




    }


}
