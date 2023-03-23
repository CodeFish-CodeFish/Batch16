package loops;

public class DoWhilePractice3 {
    public static void main(String[] args) {
        /*
        print out numbers from 20 to 0
        -counting down-
         */
        int num = 20;
        do {
            num--;
            System.out.println(num);
        } while (num >= 0);

        System.out.println("========");

        // print only odd numbers between 20 and 0

        int num1 = 20;
        while (num1 >= 0) {
            //  System.out.println(num1); this is showing all numbers from 20 to 0

            if (num1 % 2 != 0) {
                System.out.println(num1);
            }

            num1--;
        }

        /// print only numbers between 20 and 0 which are multiples of 3

        System.out.println("+++++++++++++++++++");
        int num2 = 20;
        while (num2 > 0) {
            //  System.out.println(num1); this is showing all numbers from 20 to 0

            if (num2 % 3 == 0) {
                System.out.println(num2 + " << is multiple of 3");
            }

            num2--;
        }

    }
}
