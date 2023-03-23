package loops;

import java.util.Arrays;

public class ForEachTask {
    public static void main(String[] args) {
        String[] studentNames = {"Alex", "David", "Sam", "Jenny", "John", "Sarah", "Diana", "Aida"};

        // generate e-mail address for each student as following
        // and store those e-mail address to another array for future usage
        // alex@gamil.com, david@gamil.com ....
        // if the name of student starts with 'J'
        // create an email for that student with '@yahoo.com' extension

        String email = "";
        int i = 0;
        String[] emailList = new String[studentNames.length];

        for (String name : studentNames) {

            if ( name.startsWith("J") || name.startsWith("j")){
                System.out.println(name.toLowerCase().concat("@yahoo.com"));
                email = name.toLowerCase().concat("@yahoo.com");
             //   emailList[i] = email;
            }else {
                email = name.toLowerCase().concat("@gmail.com");
              //  emailList[i] = email;
            }

            emailList[i] = email;

            i++;
        }
        System.out.println(Arrays.toString(emailList));
    }
}
