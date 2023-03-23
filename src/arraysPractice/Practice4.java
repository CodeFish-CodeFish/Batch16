package arraysPractice;

import java.util.Arrays;

public class Practice4 {
    public static void main(String[] args) {
        Object[] items = {"bottle", true, 6, 7, 8.9, 'g'};

        System.out.println(Arrays.toString(items));
        System.out.println(items[5]); // g

        // char letter1 = items[5]; compile time error
        Object letter1 = items[5];

        char letter2 = (char) items[5];

        Object str1 = items[0];

        String str2 = (String) items[0];

        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.toString();

        System.out.println(str3);


        Object num1 = items[2]; // 6

        String str4 = num1.toString();
     //   System.out.println(  str4 * 6 );
        int num2 = (int)items[2];
        System.out.println(  num2 * 6 );
        System.out.println("_____________________");
        // print out every element one by one
        // while you show elements add following text "good morning" to each element

        // store all new messages into a String array
         String[] messages = new String[items.length];
        for (int i =0; i< items.length; i++){

          //  System.out.println(   items[i] + "good morning" );

            messages[i] = items[i].toString().concat(" -> good morning");


        }
        System.out.println(Arrays.toString(messages));

            String str5 = messages[0];

    }
}
