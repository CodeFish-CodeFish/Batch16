package objectPractice;

public class Employee {

    String name;
    int id;
    double salary;


    public Employee() {
        this("Buket",150);
       // this("Vlad", 123);
        System.out.println("Empty Constructor");
    }

    public Employee(double salary) {
        this.salary = salary;
        System.out.println("Salary Constructor");
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;

        System.out.println("Constructor with Id and Name");
    }

    // override toString() method and check properties of any employee object

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Collecting garbage");
    }
}
