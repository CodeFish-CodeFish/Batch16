package RecapWithAhmet;

import java.util.Scanner;

public class SwitchStatement {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-Some of the technical questions might need switch instead of if statement to show off yourself.

      -->NOTE:If you have limited amount of options then I can use switch instead of if.(this is not mandatory)
      -->The reason: It makes your code look more professional and look clear.
      -->Break is the most important part of the switch(PLEASE DO NOT FORGET)
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please provide the extention?");
        int extention=scanner.nextInt();
        switch (extention){
            case 1:
                System.out.println("You are talking to IT department");
                break;
            case 2:
                System.out.println("You are talking to Health department");
                break;
            case 3:
                System.out.println("You are talking to Customer Service");
                break;
            default:
                System.out.println("Your number range is not between 1 to 3");
        }
    }
}
