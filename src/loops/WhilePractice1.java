package loops;

public class WhilePractice1 {
    public static void main(String[] args) {

        System.out.println("GOOD MORNING STUDENT");

        int studentNumber = 1, limit = 10;

        while (studentNumber <= limit) {

            System.out.println("Good morning, please be on time next time!");

            studentNumber++;
        }
        System.out.println("*************");
        System.out.println(studentNumber);
        System.out.println("*************");

        studentNumber = 5;

        while (studentNumber <= limit) {

            studentNumber++;
            System.out.println("+++Good morning, please be on time next time!++");

        }
        System.out.println("*************");




    }
}
