package objectPractice;

public class studentTest {
    public static void main(String[] args) {

        Student student1 = new Student("David");

        System.out.println(student1.name); // David

        System.out.println(student1.study());

        Student student2 = new Student(21, "123 Main st Chicago");

        System.out.println(student1.age);
        student1 = new Student(12, "Devon St");
        System.out.println(student1.age);
        System.out.println(student2.age);

        Student student3 = new Student("Sam", "112 Main St",45);

        System.out.println( student3 );
        student1.info();
        System.out.println("--------");
        student2.info();
        System.out.println("---------");
        student3.info();
        System.out.println("++++++++++++=");
        System.out.println( student1  );
        System.out.println("++++++++++++=");

        student3.study();
        int a = student3.sleep();
        System.out.println( a );
        System.out.println( student3.numberCreator());
        System.out.println("*****************");
        System.out.println(  student1.study() );
        System.out.println("*****************");
        System.out.println(   student1.sleep());

        Student st4 = new Student( student2.numberCreator(), "abcd");

        System.out.println( st4.age );
    }
}
