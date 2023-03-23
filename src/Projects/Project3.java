package Projects;

import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter one String value:");
        String str=scanner.nextLine();
        int startingNumber=scanner.nextInt();
        int endingNumber=scanner.nextInt();

        String output=str.substring(startingNumber-1,endingNumber);
        System.out.println(output);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");


        String str1=" Snicker ";
        String str2="Cookie";

        System.out.println(str1.trim().toLowerCase().substring(0,3).charAt(2));// Snicker //Snicker//snicker//snic//i
        System.out.println(str2.toLowerCase().replace('o','u').concat("s").startsWith("C"));//Cookie//cookie//cuukie//cuukies//false

        System.out.println("++++++++++++++++++++++++++++++++");
        scanner=new Scanner(System.in);
        String words1=scanner.nextLine();
        scanner=new Scanner(System.in);
        String words2=scanner.nextLine();
        scanner=new Scanner(System.in);
        String words3=scanner.nextLine();
        boolean result=false;

        if(words1.length()==words2.length() && words2.length()==words3.length()){
            if(words1.charAt(0)>=65 && words1.charAt(0)<=90){
                if(words2.charAt(0)>=65 && words2.charAt(0)<=90) {
                    if(words3.charAt(0)>=65 && words3.charAt(0)<=90){
                        if(words1.toLowerCase().contains("java") && words2.toLowerCase().contains("java") && words3.toLowerCase().contains("java")){
                            result=true;
                        }
                    }
                }
            }
        }

        System.out.println(result);

        System.out.println("+++++++++++++++++++++++++++++++");

        scanner=new Scanner(System.in);
        System.out.println("Enter three words:");//Importance of human
        String threeWords=scanner.nextLine();
        int lastOf1st=threeWords.indexOf(' ')-1;
        int lastOf2nd=threeWords.indexOf(' ',threeWords.indexOf(' ')+1)-1;
        int lastOf3rd=threeWords.length()-1;

        System.out.println(lastOf1st+"--> index number of '"+threeWords.charAt(lastOf1st)+"'");
        System.out.println(lastOf2nd+"--> index number of '"+threeWords.charAt(lastOf2nd)+"'");
        System.out.println(lastOf3rd+"--> index number of '"+threeWords.charAt(lastOf3rd)+"'");
        System.out.println("The sun:"+(lastOf1st+lastOf2nd+lastOf3rd));

        System.out.println("++++++++++++++++++++++++++++");

        System.out.println("Enter weight of package in lbs:");
        int lbs=scanner.nextInt();
        scanner=new Scanner(System.in);
        String shippingSpeed=scanner.nextLine();
        int shippingCost=0;

        if(lbs>0 && lbs<=5){
            shippingCost=10;
            if(shippingSpeed.equalsIgnoreCase("overnight")){
                shippingCost*=2;
            }
        }
        else if(lbs>5 && lbs<=10){
            shippingCost=20;
            if(shippingSpeed.equalsIgnoreCase("overnight")){
                shippingCost*=2;
            }
        }
        else if(lbs>10 && lbs<=20){
            shippingCost=30;
            if(shippingSpeed.equalsIgnoreCase("overnight")){
                shippingCost*=2;
            }
        }
        else if(lbs>20){
            shippingCost=40;
            if(shippingSpeed.equalsIgnoreCase("overnight")){
                shippingCost*=2;
            }
        }
        else {
            System.out.println("ERROR");
        }


        System.out.println("Your shipping cost is $"+shippingCost);


        System.out.println("++++++++++++++++++++++++++");

        scanner=new Scanner(System.in);
        double numberOfTemperature=scanner.nextInt();
        scanner=new Scanner(System.in);
        System.out.println("Enter type of temperature(fahrenheit/celsius):");
        String typeOfTemperature=scanner.nextLine();

        if(typeOfTemperature.equalsIgnoreCase("celsius")){
            System.out.println(numberOfTemperature+typeOfTemperature+" is "+String.format("%.1f",((numberOfTemperature*9/5) +32))+"F");
        } else if (typeOfTemperature.equalsIgnoreCase("fahrenheit")) {
            System.out.println(numberOfTemperature+typeOfTemperature+" is "+String.format("%.1f",((numberOfTemperature-32)*5/9))+"C");
        }
        else {
            System.out.println("ERROR");
        }


    }



}
