package MentoringWithKutman;

import java.util.HashMap;
import java.util.Map;

public class MapOfMap {
    public static void main(String[] args) {
        Map<Integer,String> student1=new HashMap<>();
        Map<Integer,String> courses1=new HashMap<>();

        Map<Map<Integer,String>,Map<Integer,String>> mapOfStudents=new HashMap<>();

        student1.put(1,"Kutman");
        courses1.put(101,"Java");
        courses1.put(102,"Selenium");
        courses1.put(103,"Postman");
        courses1.put(104,"MySQL");
        courses1.put(105,"Appium");
        mapOfStudents.put(student1,courses1);

        Map<Integer,String> student2=new HashMap<>();
        Map<Integer,String> courses2=new HashMap<>();
        student2.put(2,"Tina");
        courses2.put(201,"Python");
        courses2.put(102,"Selenium");
        courses2.put(203,"JDBC");
        courses2.put(204,"Oracle SQL");
        courses2.put(205,"Android Studio");
        mapOfStudents.put(student2,courses2);

        Map<Integer,String> student3=new HashMap<>();
        Map<Integer,String> courses3=new HashMap<>();
        student3.put(3,"Nazik");
        courses3.put(101,"Java");
        courses3.put(202,"Selenium");
        courses3.put(303,"Karate");
        courses3.put(204,"Oracle SQL");
        courses3.put(305,"Apache POI");
        mapOfStudents.put(student3,courses3);

        Map<Integer,String> student4=new HashMap<>();
        Map<Integer,String> courses4=new HashMap<>();
        student4.put(4,"Galiya");
        courses4.put(201,"Python");
        courses4.put(202,"Selenium");
        courses4.put(303,"Karate");
        courses4.put(104,"MySQL");
        courses4.put(305,"Apache POI");
        mapOfStudents.put(student4,courses4);

        Map<Integer,String> student5=new HashMap<>();
        Map<Integer,String> courses5=new HashMap<>();
        student5.put(5,"Oleksandr");
        courses5.put(501,"C++");
        courses5.put(202,"Selenium");
        courses5.put(303,"Karate");
        courses5.put(504,"SQL");
        courses5.put(305,"Apache POI");
        mapOfStudents.put(student5,courses5);

//        System.out.println(mapOfStudents);

        /*
        print each pair one by one
            {1=Kutman}={101=Java, 102=Selenium, 103=Postman, 104=MySQL, 105=Appium}
         */
        for (Map.Entry<Map<Integer,String>,Map<Integer,String>> pair:mapOfStudents.entrySet()){
            System.out.println(pair);
        }
        /*
        print out the names of students whoever learnt Java
         */
        System.out.println("The names of students whoever learnt Java:");
        for (Map.Entry<Map<Integer,String>,Map<Integer,String>> pair:mapOfStudents.entrySet()){
            if(pair.getValue().containsValue("Java")){
                for (Map.Entry<Integer,String> student:pair.getKey().entrySet()){
                    System.out.println("-"+student.getValue());
                }
            }
        }
        /*
        print out course names where the id is 2XX
         */
        System.out.println();
        System.out.println();
        System.out.println("Course names where the id is 2XX:");
        String result="";
        for (Map.Entry<Map<Integer,String>,Map<Integer,String>> pair:mapOfStudents.entrySet()){
            for (Map.Entry<Integer,String> course:pair.getValue().entrySet()){
                if(course.getKey()>=200 && course.getKey()<300){
                    if(!result.contains(course.getValue())){
                        result+="-"+course.getValue()+"\n";
                    }
                }
            }
        }
        System.out.println(result);

        /*
        1.calculate the average of course id's of student where id = 3

        2.list me the names of courses that student id=5 covered

        3.Print all course names and id's in ascending order

        101=Java
        102=Selenium

         */

    }
}
