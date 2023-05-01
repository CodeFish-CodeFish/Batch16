package objectPractice;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee();

        System.out.println( e1 );

        Employee e2 = new Employee(200);

        Employee e3 = new Employee(200);
        Employee e4 = new Employee(200);
        Employee e5 = new Employee(200);

        System.out.println( e1 == e2); //
        System.out.println(  e1.equals(e2)    ); //

        System.out.println( e3 == e4); // False
        System.out.println( e3.equals(e4)); // False

        Employee e6 = e5;
        System.out.println( e5 == e6);
        System.out.println( e5.equals(e6));

        e5 = null;

        e4 = null;
        e2 = null;

        System.gc();

    }
}
