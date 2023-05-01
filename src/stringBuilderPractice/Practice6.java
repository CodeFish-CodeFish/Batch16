package stringBuilderPractice;

public class Practice6 {
    public static void main(String[] args) {

        // "wdrgt247urthger&*%34" --> StringBuilder
        // Character --> isDigit();
        // find out sum of numbers from StringBuilder

        StringBuilder builder = new StringBuilder("wdrgt247urthger&*%34");
        int sum = 0;
        for (int i = 0; i < builder.length(); i++) {

            if (Character.isDigit(builder.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(builder.charAt(i)));
            }
        }
        System.out.println(sum);

        System.out.println( "result from method call "+ sumFinder(builder)   );

    }

    public static int sumFinder(StringBuilder builder) {
        int sum = 0;
        for (int i = 0; i < builder.length(); i++) {

            if (Character.isDigit(builder.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(builder.charAt(i)));
            }
        }
        return sum;
    }
}
