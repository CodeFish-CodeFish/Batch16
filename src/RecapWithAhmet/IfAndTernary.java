package RecapWithAhmet;

import java.util.Scanner;

public class IfAndTernary {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-Most of the technical questions are required if condition(automation)

      If is a conditional statement

       if(condition){
       implementation
       }
       AND(&&)                              OR(||)
       TRUE & TRUE -->TRUE                TRUE || TRUE -->TRUE
       TRUE & FALSE -->FALSE              TRUE || FALSE -->TRUE
       FALSE & FALSE -->FALSE             FALSE || FALSE -->FALSE

       TERNARY OPERATORS:

        CONDITION ? VALUE1:VALUE2 --> TRUE --> VALUE * FALSE --> VALUE2

    NOTE:The reason people use ternary operator to make the code less
    and look more efficient.
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please put the temperature");
        int actualTemperature=scanner.nextInt();
        if(actualTemperature<0 && actualTemperature>-10){
            System.out.println("It is freezing");
        }else if(actualTemperature<25 && actualTemperature>=0){
            System.out.println("It is warm");
        }else if(actualTemperature>25){
            System.out.println("It is really hot");
        }else{
            System.out.println("Please check your input");
        }
        boolean result =actualTemperature>10 || actualTemperature<5;
        System.out.println(result);

        String name="Ahmet";
        String name2="ahmet";

        String result1=name.equalsIgnoreCase(name2) ? "Names are good" : "Names are totally different";
        System.out.println(result1);

        if(name.equalsIgnoreCase(name2)){
            System.out.println("Names are good");
        }else{
            System.out.println("Names are totally different");
        }
    }



}
