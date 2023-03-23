package loops;

public class BreakPractice {
    public static void main(String[] args) {

        JOHN:
        for (int i = 0; i < 20; i++) {

            System.out.println("i " + i);
          //  if(i > 10) break JOHN;
            SAM:
            for (int m = 0; m < 30; m++) {
               //  if (m > 15)break JOHN;

                System.out.print("m > " + m);
                if(i > 10) break JOHN;

            }
           // if(i > 10) break SAM; you cannot reach out SAm from out of inner(SAM) loop

            System.out.println();

            //  break;
            //  System.out.println(); compile time error


        }

    }
}
