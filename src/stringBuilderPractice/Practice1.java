package stringBuilderPractice;

public class Practice1 {

    // immutability

    // write a java code to print lowercase alphabet as a single string

    public static void main(String[] args) {

        String str = "";
        for ( char ch = 'a'; ch <= 'z'; ch++ ){

            str = str + ch;
            System.out.println(str);

        }

        System.out.println("=======================");

        String str2 = "Coffee";
        str2.concat("is Hot");
        System.out.println(str2);

        System.out.println("=======================");
        StringBuilder builder = new StringBuilder("Food");
        System.out.println( builder );

        StringBuilder builder1 = new StringBuilder();
        builder1.append("Drink");
        System.out.println(builder1);
        builder1.append(" is COLD");
        System.out.println( builder1);
        builder1 = builder1.append(" -123- ");
        System.out.println( builder1); //
        builder1 = builder1.append(" -123- ");
        System.out.println( builder1);

        builder1.append(builder1);
        System.out.println(builder1); // ?
        builder1.append("dinner");
        System.out.println(builder1);

        System.out.println("--------");
        builder1 = new StringBuilder();
        System.out.println(builder1);

        builder1.append(1234);
        builder1.append(true);
        builder1.append(str2);
        System.out.println( builder1);


    }

}
