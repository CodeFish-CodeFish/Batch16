package RecapWithAhmet;

import java.util.Scanner;

public class Loops {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

    1-Many technical and AUTOMATION are required loops.

    TYPE OF LOOPS:

       -->1-Do While -->No matter what it will run the code "ONCE"
       -->2-While -->it will check the condition first and then based on that
       run the code as long as condition is met.
       -->3-For -->it will initialize variable first then check the condition
       based on that it will keep running
       -->4-For Each -->it is a good way usage once you want to access
       all the data from List,Map,Set....etc
     */
    public static void main(String[] args) {
        String password;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please provide the password");
            password=scanner.nextLine();
        } while (password.startsWith("A"));
        //NOTE:Do while runs at least once
        //NOTE:As long as condition is met, it will continue executing same code

        /*
        1-Ask the user put an int number reverse the number
         //while loop
        2-Multiply the digits
        -->exp:12345 --> OUTPUT -->54321 -->Multiply-->120
         */
        //WHAT IS THE STARTING POINT:
        //1-Reading and verifying the requirements with interviewer
        //2-Start implementation one by one and step by step
        //3-talk during the implementation what you are thinking and doing

        Scanner scanner2=new Scanner(System.in);
        System.out.println("Please put int number?");
        int number=scanner2.nextInt();
        String reverse="";
        //12345 --> %10 --> 5              //123-->/10 -->12
        //1234 --> /10 --> 123            //12 -->%10-->2
       //1234 -->%10 -->4                  //123-->/10--12
        //123 -->%10-->3                   //12--/10 -->1
        //1 -->%10 -->1                    //1-->/10 -->0
        int total=1;
        while(number!=0){
            int digit=number%10;
            reverse+=digit;
            total*=digit;
            number/=10;
        }
        System.out.println(reverse);
        System.out.println(total);
    }
    /*
    1-USING SCANNER --> Ask user to enter one string value with 3 words
      *Print first letter of each word
      *print last letter of each word
      *print the sum of index number first letters
      *print the sum of index number of last letters
      *Print the difference between total last and total first index always positive

      REQUIREMENT:You can use any loops(for or foreach loop)
                  -->Please use only one loop
      Tips:I would use if condition for charAt and think about ' '

      EXAMPLE:"AHMET LOVES JAVA"
      output:ALJ
      output:TSA
      output:18
      output:29
      output:11
     */

}
