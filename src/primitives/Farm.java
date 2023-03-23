package primitives;
public class Farm {
    public static void main(String[] args) {


        /*
        in a farm;
        there are 15 chickens and 45 cows
        1-create variables to represent data and find total numbers of the legs in this farm
        "There are .... numbers of legs in this farm"
        2-find out worth of this farm
           each cow is $1200
           each chicken $30.45
           ".... is the total money you can make out of this farm"
         */

        int cows = 45;
        int chickens = 15;
        int eachCowLeg = 4;
        int eachChickenLeg = 2;

        int totalLegs = cows * eachCowLeg + chickens * eachChickenLeg;
        System.out.println( "There are "+totalLegs + " numbers of legs in this farm"  );

        int cow$ = 1200;
        double chicken$ = 30.45;

        System.out.println   (   cows * cow$   + chickens * chicken$       );

        double total$ = cows * cow$   + chickens * chicken$;
        System.out.println( total$ + " is the total money you can make out of this farm");


    }
}
