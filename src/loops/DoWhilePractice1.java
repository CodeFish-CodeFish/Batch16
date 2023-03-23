package loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {

        int num1 = 6, num2 = 2;

        do {
            System.out.println("Say by!");
            num1--;
        } while (num1 > num2);

        num1 = 6;
        num2 = 2;

        do {
            System.out.println("Say HI");
            num1--;
        } while (num1 < num2);

        System.out.println("=========if it was while loop=======");
        num1 = 6;
        num2 = 2;

        while (num1 < num2) {

            System.out.println("Say **H**I**");
            num1--;
        }

        System.out.println("--------");
        char letter = 'm';
        do {

            System.out.println("going home almost");
            letter--;
        }while (letter > 'b');
        System.out.println("===============");
        do {

            System.out.println("going home almost");
            letter--;
        }while (letter > 'b');

    }
}
