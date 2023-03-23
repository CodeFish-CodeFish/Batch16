package loops;

public class NestedLoop5 {
    public static void main(String[] args) {
        /*
        create a multiplication table for numbers 1 to 12
        1 * 1 = 1
        1 * 2 = 2
        ......
        1 * 12 = 12
        ------------
        2 * 1 = 2
        2 * 2 = 4
        ....
        2 * 12 = 24
         */

        for (int i = 1; i <= 12; i++) {
                  if (i > 5){
                      break;
                  }
            for (int k = 1; k <= 12; k++) {
//                   if (k > 8){
//                       break;
//                   }
                System.out.println(i + " * " + k + " = " + i * k);
               // break;
            }
            System.out.println("--------------");
            //break;
        }


    }
}
