package loops;

public class ForPractice2 {
    public static void main(String[] args) {

        /*
        by using for loop, print out numbers btwn 0 and 5
         */

        for (int a = 0 ; a  <=5  ; a++ ){

            System.out.println(a);

        }
        System.out.println("----------------");
        int a = 0;
        for (     ; a  <=5  ; a++ ){

            System.out.println(a);

        }
        System.out.println("----------------");
        int b = 20;
        for ( b=2    ; b  <=5  ; b++ ){

            System.out.println(b);

        }
        System.out.println("b >> "+b);

        System.out.println("----------------");
        int a1 = 0;
        for ( String str ="test".concat("*")    ; a1 <=5  ; a1++ ){

            System.out.println(a1);

        }
        System.out.println("----------------");
        int c = 10;
        for (  double d = 500, e = 8.5   ; c  <=15  ; c++ ){

            System.out.println(c);
            System.out.println(d);

        }

        System.out.println("=============");
        int i = 0;
        for (     ; i  <=5  ;   ){

            System.out.println(i);
            i++;
        }
 //       System.out.println("=======Following is infinite loop======");
//        int i1 = 0;
//        for (     ;   ;    ){
//
//            System.out.println("=="+i1+"===");
//            i1++;
//        }

//        System.out.println("=======Following is infinite loop======");
//
//        for (   int i1 = 0;     ;  i1++  ){
//
//            System.out.println("=="+i1+"===");
//
//        }


    }
}
