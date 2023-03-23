package loops;

public class WhilePractice2 {
    public static void main(String[] args) {

        /*
        create while loop to print out numbers from 10 to 15
         */

        int firstNum = 10, lastNumber = 15;

        while (firstNum <= lastNumber){
            System.out.println(" >>>> "+ firstNum);
          firstNum++;
        }

        // task: print out even numbers between 21 and 39
        int num1= 20, num2 = 39;

         while ( num1 < num2-1){

             num1 += 2;
             System.out.println(num1);
         }
        System.out.println("---------------");

        num1= 21; num2 = 39;


        while (num1 < num2){

            System.out.println(++num1);

            num1++;
        }


    }
}
