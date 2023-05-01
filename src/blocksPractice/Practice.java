package blocksPractice;

public class Practice {
    static int number1;
    String name1;

    // instance block runs for evey object
    {
        //number1 = 12;
        name1 = "Alex";
        System.out.println("Instance Block");
    }

    // static block runs only one time
    // it runs as first thing in the class
    static {
        number1 = 50;
        System.out.println("Static Block");
    }


}
