package loops;

public class NestedLoop1 {
    public static void main(String[] args) {


        System.out.println("Before LOOPS");

        for ( int i=0; i < 5; i++){

            System.out.println("i is : "+ i);
            System.out.println("---------");

            for (int k=0; k < 3; k++){

                System.out.println("k is : "+k);
            }
            System.out.println("===============");

        }
        System.out.println("After LOOPs");


    }
}
