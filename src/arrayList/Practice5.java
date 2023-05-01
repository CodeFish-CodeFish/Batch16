package arrayList;

import java.util.ArrayList;

public class Practice5 {

    // create a method that will take an arrayList of cities
    // this method will generate contact e-mail address for each city
    // info@chicago.com , info@la.com, ...
    // return all of those e-mail address as another list
    // main method to test your logic


    public static ArrayList<String> emailCreator(ArrayList<String> cities) {
        ArrayList<String> emailList = new ArrayList<>();

        for (int i = 0; i < cities.size(); i++) {

            emailList.add("info@" + cities.get(i).toLowerCase() + ".com");

        }
        return emailList;
    }

    // create a method that will send an e-mail to city which is provided as a parameter

    // ....(info@chicago.com)  --> ...Email is being sent to ..info@chicago.com..

    // if provided e-mail in the parameter is one of those created info e-mails for cities

    public static void emailSender(String email) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Dallas");
        cities.add("Tampa");
        cities.add("Ottawa");
        // emailCreator(cities);

        for (int i = 0; i < emailCreator(cities).size(); i++) {

            if (email.equals(emailCreator(cities).get(i))) {
                System.out.println("Email has been sent");
                break;
            } else {

                System.out.println("check the email address");
                break;
            }
        }

    }

    public static void main(String[] args) {

        emailSender("info@ottawa.com");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Dallas");
        cities.add("Tampa");
        cities.add("Ottawa");

        System.out.println(emailCreator(cities));
        ;


        ArrayList<String> cityInfoEmails = emailCreator(cities);

        System.out.println(cityInfoEmails);
    }


}
