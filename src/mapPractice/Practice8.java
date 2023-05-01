package mapPractice;

import objectPractice.Student;

import java.util.HashMap;
import java.util.Map;

public class Practice8 {
    public static void main(String[] args) {
        HashMap<Integer,String> bcaStudents=new HashMap<>();//Integer--> id    String--> name
        HashMap<Integer,String> mcaStudents=new HashMap<>();

        bcaStudents.put(101,"Kutman");
        bcaStudents.put(102,"Anouar");
        bcaStudents.put(103,"Viktoria");
        bcaStudents.put(104,"Ozan");
        bcaStudents.put(105,"Janysh");

        mcaStudents.put(101,"Kseniia");
        mcaStudents.put(102,"Kuba");
        mcaStudents.put(103,"Baaber");
        mcaStudents.put(104,"Janysh");
        mcaStudents.put(105,"Kutman");
        mcaStudents.put(106,"Kutman");

        Map<String,Map<Integer,String>> students=new HashMap<>();//-->Map<CourseName, all students in that course>
        students.put("BCA",bcaStudents);
        students.put("MCA",mcaStudents);

        // print out the "students" map
        System.out.println("Map of Map: "+students);
        //BCA={101=Kutman,102=Anouar....MCA={101=Kseniia,}

        //Student id= 101   Student name = Kutman
        //students.values()//--> {101=Kutman, 102=Anouar, 103=Viktoria, 104=Ozan, 105=Janysh},{101=Kseniia, 102=Kuba, 103=Baaber, 104=Janysh, 105=Kutman}

        //find all students whose name is Kutman and change their values to Efe
        for (String key:students.keySet()) {
            Map<Integer, String> course = students.get(key);
            for (Map.Entry<Integer, String> eachStudent : course.entrySet()) {
                if(eachStudent.getValue().equalsIgnoreCase("Kutman")){
                    eachStudent.setValue("Efe");
                    //course.put(eachStudent.getKey(),"EFE");
                }
            }
        }

        for (String key:students.keySet()){// keySet()--> coolection of all keys-->"BCA","MCA"
            System.out.println(key+" course");
            Map<Integer,String> eachCourseStudents=students.get(key);

            for (Map.Entry<Integer,String> eachStudent:eachCourseStudents.entrySet()){//--> 101=Kutman
                System.out.println("Student id = "+eachStudent.getKey()+"      Student name = "+eachStudent.getValue());
            }
            System.out.println();
            System.out.println();
        }

        // print out the average of ids of students whose name is Kutman

        int sum=0;
        int count=0;

        for (String key:students.keySet()){
            Map<Integer,String> course=students.get(key);
            for (Map.Entry<Integer,String> eachStudent:course.entrySet()){
                if(eachStudent.getValue().equalsIgnoreCase("EFE")){
                    sum+=eachStudent.getKey();
                    count++;
                }
            }
        }
        int average=sum/count;//{1,3,45,6,87}-->sumOFnumbers/numberofelements that array has
        System.out.println("Average of id's of students whose name is EFE: "+average);//104--> 101+105+106/3
        //find all students whose name is Kutman and change their values to Efe






    }
}
