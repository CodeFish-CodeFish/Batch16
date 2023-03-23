package loops;

public class Task6 {
    public static void main(String[] args) {
        // find out total of numbers between 10 and 15
        // for loop
        // 11+12+13+14  ==> the sum is ..50..

        int sum = 0;
         for ( int i =11; i < 15; i++){
             sum += i;
         //    System.out.println(i);
         }
        System.out.println(sum);

    }
}
