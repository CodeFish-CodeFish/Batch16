package blocksPractice;

public class TestPractice {
    public static void main(String[] args) {

        Practice practice = new Practice();
        Practice practice1 = new Practice();
        Practice practice2 = new Practice();
        Practice practice3 = new Practice();
        System.out.println( practice.number1);
        System.out.println(practice1.number1);
        practice.number1 = 90;
        System.out.println( practice.number1);
        System.out.println(practice1.number1);
        System.out.println(  practice3.name1  );
        System.out.println(  practice3.number1);


        System.out.println(    Practice.number1     );

    }
}
