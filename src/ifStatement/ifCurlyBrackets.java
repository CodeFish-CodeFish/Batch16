package ifStatement;

public class ifCurlyBrackets {
    public static void main(String[] args) {

        if (5 > 4) {

            System.out.println("Hello");
            System.out.println("This");
            System.out.println("Is first IF");
        }

        if (5 < 1) {
            System.out.println("Bye");
            System.out.println("this is in SECOND IF");

        }
        System.out.println("+++++++++++++++++++++++");
        // if block without curly brackets

        if (6 < 3)
            System.out.println("*****");
        System.out.println("!!!!!");

        int capacity = 20, studentNumber = 25;

        if (capacity > studentNumber)
            System.out.println("There is enough place in the room");
        studentNumber++;
        System.out.println(studentNumber);


        int a = 5, b = 10;

        if (b >= a)
            ++b;
            b++;
            a = ++b;
            System.out.println(a--);
        System.out.println(  a + " <<< latest value for a");

    }
}
