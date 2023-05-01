package abstraction.abstraction1;

public class Test {

    public static void main(String[] args) {

        //Student student = new Student();

        Campus campus = new Campus("Harun", 21);
        campus.attend();
        campus.eat();
        campus.study();
        System.out.println("=========");
        Online online = new Online("Melek", 16);
        online.attend();
        online.eat();
        online.study();
        online.havePJ();
        System.out.println("=========");
      //  SelfLearner self = new SelfLearner();
        Alex alex = new Alex("Alex", 21);
        alex.attend();
        alex.tableTennis();

        System.out.println("========");

        John john = new John("John", 18);
        john.eat();
        john.hike();
        john.attend();
        john.study();

        System.out.println("========");
        Victoria victoria = new Victoria("Victoria", 21);

        victoria.callOffice();
        victoria.stop();
       // victoria.dance(); -> private method, victoria cannot reach

        // when you create object from any class
        // you can refer to parent class
        // if there is a parent class

        John john1 = new John("j",2);
        john1.hike();
        SelfLearner john2 = new John("j2", 2);
        //john2.hike();
        Student john3 = new John("j3", 3);
        john3.attend();


    }
}
