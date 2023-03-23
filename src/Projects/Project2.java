package Projects;

import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 6-digit number:");
        int number= scanner.nextInt();
        int digit6=number%10;
        number=number/10;
        int digit5=number%10;
        number=number/10;
        int digit4=number%10;
        number=number/10;
        int digit3=number%10;
        number=number/10;
        int digit2=number%10;
        number=number/10;
        int digit1=number%10;
        number=number/10;

        int multiplicationOfDigits=digit1*digit2*digit3*digit4*digit5*digit6;
        int sumOfDigits=digit1+digit2+digit3+digit4+digit5+digit6;

        System.out.println("Multiplication of all digits is "+multiplicationOfDigits);
        System.out.println("The Sum of all digits is "+sumOfDigits);

        System.out.println("============================================");

        System.out.println("Please enter 5-digit number:");
        int n=scanner.nextInt();

        digit5=n%10;
        n=n/10;
        digit4=n%10;
        n=n/10;
        digit3=n%10;
        n=n/10;
        digit2=n%10;
        n=n/10;
        digit1=n%10;
        n=n/10;

        int result=digit5*10000+digit4*1000+digit3*100+digit2*10+digit1;
        System.out.println("The output is "+result);
        System.out.println("====================");

        scanner=new Scanner(System.in);

        System.out.println("Please enter three ingredients with spaces:");
        String ingredients=scanner.nextLine();
        System.out.println("Please enter the int number:");
        int numb=scanner.nextInt();//5
        //Milk Peanuts Butter --> 5ilk 6eanuts 7utter
        int indexOfFirstSpace=ingredients.indexOf(" ");//4
        int indexOfSecondSpace=ingredients.indexOf(" ",indexOfFirstSpace+1);//12

        ingredients=ingredients.replace(ingredients.charAt(0)+"",numb+"");
        ingredients=ingredients.replace(ingredients.charAt(indexOfFirstSpace+1)+"",(numb+1)+"");
        ingredients=ingredients.replace(ingredients.charAt(indexOfSecondSpace+1)+"",(numb+2)+"");

        System.out.println(ingredients);
        System.out.println("=============================");
        scanner=new Scanner(System.in);
        System.out.println("Please enter the String with the following format “ word “");
        String word=scanner.nextLine();
        word=word.trim();
        indexOfSecondSpace=word.indexOf(" ");



        word=word.replace(word.charAt(0)+"",word.substring(0,1).toUpperCase());
        word=word.replace(word.charAt(indexOfSecondSpace+1)+"",word.substring(indexOfSecondSpace+1,indexOfSecondSpace+2).toUpperCase());

        System.out.println(word);
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("+-------------------------------------------------------------------+");
        System.out.println("|                                                              #### |");
        System.out.println("|                                                              #### |");
        System.out.println("|                                                              #### |");
        System.out.println("|                                                                   |");
        System.out.println("|                         Muammer Turan                             |");
        System.out.println("|                         2200 E Devon Ave \"Suite 385\"              |");
        System.out.println("|                         Des Plaines, IL-60018                     |");
        System.out.println("|                                                                   |");
        System.out.println("+-------------------------------------------------------------------+");

    }
}
