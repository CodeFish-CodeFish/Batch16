package ifStatement;

import java.util.Scanner;

public class NestedIfPractice4 {
    public static void main(String[] args) {
        /*
        Let's say there is a candidate for a job interview and s/he will be asked abut java, selenium, API, SQL knowledge
        first ask candidate if s/he knows java
          if s/he says 'yes' --> ask about selenium knowledge
            if s/he says 'yes' --> ask about API testing
              if s/he says 'yes' --> ask about SQL knowledge
               "Congrats! You are hired"
                if s/he says 'no' --> we need SQL knowledge
              if s/he says 'no' --> "We need API knowledge"
            if s/he says 'no' --> "We need selenium skills"
          if s/he says 'no' --> "please learn java and try again"
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Do you know java? yes/no");
        String java = scanner.nextLine();
        if (java.equalsIgnoreCase("yes")){

            System.out.println("Do you know selenium? yes/no");
            String selenium = scanner.nextLine();
            if (selenium.equalsIgnoreCase("yes")){

                System.out.println("Do you know API testing? yes/no");
                String api = scanner.nextLine();
                if (api.equalsIgnoreCase("yes")){

                    System.out.println("Do you know SQL? yes/no");
                    String sql = scanner.nextLine();
                    if (sql.equalsIgnoreCase("yes")){
                        System.out.println("Congrats!! You are HIRED!!");
                    }else {
                        System.out.println("Please learn SQL");
                    }

                }else{
                    System.out.println("Please Learn API testing");
                }

            }else{
                System.out.println("Please learn Selenium");
            }

        }else{
            System.out.println("Need Java knowledge");
        }


    }
}
