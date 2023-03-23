package ternaryOperator;

public class Practice2 {
    public static void main(String[] args) {

        int x = 2, y = 5;

        int result1 = x < y ? x++ + 10 : y++ + 10;
        System.out.println("y" + y);
        System.out.println(result1);

        System.out.println("x >> " + x); // 3

        int result2 = ++x < --y ? ++y + y++ : ++x + x--;

        System.out.println(result2);

        // nested ternary


    }
}
