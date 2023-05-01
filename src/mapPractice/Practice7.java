package mapPractice;

import java.util.*;

public class Practice7 {
    public static void main(String[] args) {
        Map<Integer, ArrayList<String>> accounts=new HashMap<>();
        ArrayList<String> account1=new ArrayList<>();
        account1.add("Kutman");
        account1.add("Zhanasharov");
        account1.add("7734665417");
        account1.add("Chicago");
        account1.add("IL");
        account1.add("04/12/2000");

        ArrayList<String> account2=new ArrayList<>();
        account2.add("Anouar");
        account2.add("Sakji");
        account2.add("3126786534");
        account2.add("Des Plaines");
        account2.add("IL");
        account2.add("5/25/1998");

        ArrayList<String> account3=new ArrayList<>();
        account3.add("Viktoria");
        account3.add("Marcu");
        account3.add("8176348976");
        account3.add("Tampa");
        account3.add("FL");
        account3.add("12/11/1999");

        ArrayList<String> account4=new ArrayList<>();
        account4.add("Mark");
        account4.add("Zukerberg");
        account4.add("3128568834");
        account4.add("Austin");
        account4.add("TX");
        account4.add("1/2/1992");

        ArrayList<String> account5=new ArrayList<>();
        account5.add("Askar");
        account5.add("Imanbekov");
        account5.add("7836358753");
        account5.add("Brooklyn");
        account5.add("NY");
        account5.add("9/30/1989");

        accounts.put(301,account1);
        accounts.put(302,account2);
        accounts.put(303,account3);
        accounts.put(304,account4);
        accounts.put(305,account5);

        for (Map.Entry<Integer,ArrayList<String>> account:accounts.entrySet()){// entrySet()
            System.out.println(account);
        }
        /*
        give me the names of account holder who is located in IL
         */
        System.out.println("=========================================");
        System.out.println("Names of account holder who lives in IL:");
        for (Map.Entry<Integer,ArrayList<String>> account:accounts.entrySet()){
            if(account.getValue().contains("IL")){
                System.out.println("-"+account.getValue().get(0));
            }
        }

        /*
        print me average of keys --> (sum of all numbers)/number of accounts
        keySet()
         */

        Set<Integer> ids=accounts.keySet();
        int sum=0;
        for (Integer i:ids){
            sum+=i;
        }
        int averageOfKeys=sum/accounts.size();
        System.out.println("Average of keys is "+averageOfKeys);

        /*
        print lastnames who was born between 1990-1999(inclusively)
         */
        System.out.println("Lastnames of account holders who was born between 1990-1999");
        for (Map.Entry<Integer,ArrayList<String>> account:accounts.entrySet()){
            String date=account.getValue().get(5);//1/2/1992
            String year=date.substring(date.length()-4);//1992
            if(Integer.parseInt(year)>=1990 && Integer.parseInt(year)<=1999){
                System.out.println("-"+account.getValue().get(1));
            }
        }
        /*
        print average of phone number of all accounts

        Long.parseLong()
         */
        long sumOfPhoneNumbers=0;
        for (Map.Entry<Integer,ArrayList<String>> account:accounts.entrySet()){
            String phoneNumber=account.getValue().get(2);

            sumOfPhoneNumbers+=Long.parseLong(phoneNumber);
        }
        long averageOfPhoneNumbers=sumOfPhoneNumbers/accounts.size();
        System.out.println("Average of phone numbers is "+averageOfPhoneNumbers);


    }
}
