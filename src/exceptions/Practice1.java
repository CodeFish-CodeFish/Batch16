package exceptions;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println("STARTING to Class");

        try {
            // parsing  --> converting String to Numbers/Boolean

            int result = 7 / 2;

            System.out.println(result);

            String str = "123Z"; // NumberFormatException
            int number = Integer.parseInt(str);
            System.out.println( "number from string >> "+ ( number+ 1));

        } catch ( IllegalArgumentException exception) {
            System.out.println("This is from the Catch block");
            System.out.println(exception.getMessage());

        }catch (ArithmeticException exception){

            System.out.println("Please go check your implementation for Parsing, something could be wrong about parsing!");
        }


        System.out.println("This is after math question");

        // handle a type of exception that you create
        try {
            String str = "The last day is today";
            for (int i=0; i < str.length(); i++){
                System.out.println(str.charAt(i));
            }
        }catch (StringIndexOutOfBoundsException outBound ){
            System.out.println("Hey Anouar, you must be making mistake for index of your string value");

        }finally {
            System.out.println("FINALLY IT IS THE END");
            System.gc();
        }

        System.out.println("Last Line");

    }

}
