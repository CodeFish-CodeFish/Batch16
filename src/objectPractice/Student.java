package objectPractice;

import java.util.Random;

public class Student {
    String name;
    String address;
    int age;
    /*
    -create a method that is named as 'study'
    -it will return hours of study for student, some "......"

    -create a constructor to initialize name of student
    -"......."

    ->Test your code<-
     */

    public int study() {
        int hours = numberCreator();
        System.out.println("Studying ..." + hours);
        return hours * 10;

    }

    public int sleep() {

        System.out.println("Sleeping .... " + numberCreator());
        return 10;
    }

    public int numberCreator() {
        Random random = new Random();
        int number = random.nextInt(24);
        return number;
    }


    public Student(String name) {
        this(11, "200 devon st");

        this.name = name;
        System.out.println("Constructor with name");


    }

    public Student(int age, String address) {

        this.age = age;
        this.address = address;
        System.out.println("Second Constructor");

    }
    // have another constructor to initialize all three instance variables


    public Student(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;

        this.info();
    }

    // create a method to show all info about a student object
    public String info() {
        System.out.println(name + address + age);
        return name + address + age;
    }

    //    public String toString(){
//
//        return name + " - "+ address + " - " +age;
//    }
    public String toString() {

        return "***STUDENT***";
    }

    public static void main(String[] args) {

        Student student = new Student("Vlad", "B16", 25);

        Student student1 = new Student("Victoria");

    }

}
