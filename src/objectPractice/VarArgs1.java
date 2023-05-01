package objectPractice;

public class VarArgs1 {


    // create a method that will find sum of numbers from an array

    static public void sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        System.out.println("Sum from Sum method is " + total);
    }

    static public void sum2(int... num) {
        int total = 0;
        for (int n : num) {

            total += n;
        }
        System.out.println("Sum from Sum2 method is :" + total);
    }
    /*
    create a method that will take var args
    this method will print out something like : Saturday, Sunday, ...

    1. Saturday
    2. Sunday
    3.   ...
     */
    public static void namesOfDays( String ... day){

        for (int i =0; i< day.length; i++){

            System.out.println( i +1 + ". " + day[i]  );
        }
    }


    public static void main(String[] args) {

        VarArgs1.namesOfDays("Saturday", "Sunday", "Monday", "Tuesday");

        int[] nums = {1, 2, 3, 4};
        double[] nums2 = {1, 2, 3, 4};
        VarArgs1.sum(nums);

        VarArgs1.sum2();
        VarArgs1.sum2(5,5);
        VarArgs1.sum2(1,2,3,4,5,6,7,8);

        VarArgs1.sum2(nums);

    }
}
