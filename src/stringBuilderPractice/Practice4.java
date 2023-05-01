package stringBuilderPractice;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {

        //StringBuilder b1= "Morning"; compile time error
        StringBuilder builder = new StringBuilder();

        builder.append("Morning");
        builder.append(" Chicago");
        System.out.println(builder);

        builder.insert(0, "HI ");
        System.out.println( builder );

        // insert array to the stringBuilder
        String[] colors = {"red", "black", "violet", "orange"};

        builder.insert(2, Arrays.toString(colors));
        System.out.println(builder);

        System.out.println(builder.charAt(2) ); // [




    }

}
