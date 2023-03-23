package primitives;

public class NumericPromotion {
    public static void main(String[] args) {

        byte by1 = 3, by2 = 5;

        // byte by3 = by1 + by2; compile time error

        int result1 = by1 + by2;
        double result2 = by1 + by2;

        System.out.println(result1 - result2); // 0.0, 0

        double result3 = result1 - result2;

        float fl = 3.4F;
        double dbl = .45;

        //float   result4 =   fl * dbl;

        double result4 = fl * dbl;

        System.out.println( fl * dbl );
    }
}
