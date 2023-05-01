package mapPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentInfoTask {
    public static void main(String[] args) {
        /*
        Each map represented as 1 student
        FirstName=Kutman
        LastName=John
        Gender=M
        City=Chicago
        Age=26

        List<Map<String,String>> listOfStudents

         */
        HashMap<String,String> student1=new HashMap<>();
        student1.put("FirstName","Kutman");
        student1.put("LastName","John");
        student1.put("Gender","M");
        student1.put("City","Chicago");
        student1.put("Age","26");

        HashMap<String,String> student2=new HashMap<>();
        student2.put("FirstName","Steve");
        student2.put("LastName","Taylor");
        student2.put("Gender","M");
        student2.put("City","Milwaukee");
        student2.put("Age","15");

        HashMap<String,String> student3=new HashMap<>();
        student3.put("FirstName","Anouar");
        student3.put("LastName","Sakji");
        student3.put("Gender","M");
        student3.put("City","Tunisia");
        student3.put("Age","29");

        HashMap<String,String> student4=new HashMap<>();
        student4.put("FirstName","Melek");
        student4.put("LastName","Kokal");
        student4.put("Gender","F");
        student4.put("City","Manassas");
        student4.put("Age","27");

        HashMap<String,String> student5=new HashMap<>();
        student5.put("FirstName","Viktoria");
        student5.put("LastName","Marcu");
        student5.put("Gender","F");
        student5.put("City","Tampa");
        student5.put("Age","30");

        HashMap<String,String> student6=new HashMap<>();
        student6.put("FirstName","Viktoria");
        student6.put("LastName","Bekham");
        student6.put("Gender","F");
        student6.put("City","Brooklyn");
        student6.put("Age","60");





        List<Map<String,String>> listOfStudents=new ArrayList<>();
        listOfStudents.add(student1);
        listOfStudents.add(student5);
        listOfStudents.add(student4);
        listOfStudents.add(student3);
        listOfStudents.add(student2);
        listOfStudents.add(student6);

        for (Map<String,String> student:listOfStudents){
            if(student.get("FirstName").equalsIgnoreCase("Viktoria") && student.get("LastName").equalsIgnoreCase("Marcu")){
                System.out.println(student);
            }
        }
        for (Map<String,String> student:listOfStudents){
            for (Map.Entry<String,String> pair:student.entrySet()){
                if(pair.getValue().equalsIgnoreCase("Marcu") ){
                    System.out.println(student);
                }
            }
        }
        String number="1000";
        System.out.println(number+45);//100045
        System.out.println(Integer.parseInt(number)+45);//1045

        for (Map<String,String> student:listOfStudents){
            if(Integer.parseInt(student.get("Age"))<30){
                System.out.println(student.get("FirstName"));
            }
        }

        // print out cities of all females
        for (Map<String,String> student:listOfStudents){
            if(student.get("Gender").equalsIgnoreCase("f")){
                System.out.println(student.get("City"));
            }
        }



    }
}
