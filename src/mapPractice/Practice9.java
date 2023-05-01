package mapPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice9 {
    public static void main(String[] args) {
        //Can we use map as a key?

        Map<Integer,String> student1=new HashMap<>();
        student1.put(101,"Kutman");

        Map<Integer,String> student2=new HashMap<>();
        student2.put(201,"Melek");

        Map<Integer,String> student3=new HashMap<>();
        student3.put(301,"Ozan");

        Map<Integer,String> student4=new HashMap<>();
        student4.put(401,"Vlad");

        Map<Integer,String> student5=new HashMap<>();
        student5.put(501,"Viktoria");

        Map<Integer,String> student6=new HashMap<>();
        student6.put(601,"Janysh");



        Map<Map<Integer,String>, ArrayList<String>> map=new HashMap<>();//--> map of student and courses that they are taking

        String[] courseFor1st={"Java","Selenium WebDriver","Rest-Assured","JDBC","Appium","Jenkins"};
        map.put(student1,new ArrayList<>(Arrays.asList(courseFor1st)));

        String[] courseFor2nd={"Java","Postman","Cucumber","JMeter","MySQL","TestNG","JDBC"};
        map.put(student2,new ArrayList<>(Arrays.asList(courseFor2nd)));

        String[] courseFor3rd={"Java","JUnit","Cucumber","Jira","Slack","Python","Gherkin"};
        map.put(student3,new ArrayList<>(Arrays.asList(courseFor3rd)));

        String[] courseFor4th={"C++","Postman","Android Studio","JMeter","MySQL","Kotlin","Cypress"};
        map.put(student4,new ArrayList<>(Arrays.asList(courseFor4th)));

        String[] courseFor5th={"C#","Visual Studio","JMeter","IntelliJ","TestNG","Oracle SQL"};
        map.put(student5,new ArrayList<>(Arrays.asList(courseFor5th)));

        String[] courseFor6th={"Java","Postman","Cucumber","JMeter","MySQL","TestNG","JDBC","Selenium WebDriver"};
        map.put(student6,new ArrayList<>(Arrays.asList(courseFor6th)));

        System.out.println("Map as key: "+map);

        //print out the names of students who covered Java
        System.out.println("Names of students who covered Java:");
        for (Map.Entry<Map<Integer,String>,ArrayList<String>> pair:map.entrySet()){
            if(pair.getValue().contains("Java")){
                for (Map.Entry<Integer,String> student:pair.getKey().entrySet()){
                    System.out.println("-"+student.getValue());
                }
            }
        }

        //please print me all course names of student id=301
        System.out.println();
        System.out.println("Student at id=301 have learned these courses: ");
        for (Map.Entry<Map<Integer,String>,ArrayList<String>> pair:map.entrySet()){
            if(pair.getKey().containsKey(301)){
                for (String i:pair.getValue()){
                    System.out.println("-"+i);
                }
            }
        }


        //print me the ids of students who have learnt Java, Cucumber, MySQL
        System.out.println();
        System.out.println("ID's of students who learnt Java, Cucumber and MySQL");
        for (Map.Entry<Map<Integer,String>,ArrayList<String>> pair:map.entrySet()){
            if(pair.getValue().contains("Java") && pair.getValue().contains("Cucumber") && pair.getValue().contains("MySQL")){
                for (Map.Entry<Integer,String> student:pair.getKey().entrySet()){
                    System.out.println("-"+student.getKey());
                }
            }
        }



    }
}
