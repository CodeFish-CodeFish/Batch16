package primitives;

public class LogicalOperatorPractice1 {
    public static void main(String[] args) {


        // &&

        // visa , ticket

        boolean visa = false, ticket = true;

        boolean fly = visa && ticket;
        System.out.println(" Can fly to Mexico >> " + fly);

        ticket = false;
        System.out.println(" Can fly to Mexico >> " + fly);

        fly = visa && ticket;
        System.out.println(" Can fly to Mexico >> " + fly);

        System.out.println("=======================");
        // registration to school

        //requirements are age and being in the area
        int kidAge = 6, requiredAge = 5;
        boolean inArea = true;

        boolean ageResult = kidAge == requiredAge;

        boolean registration = ageResult && inArea;

        System.out.println("you can enroll " + registration);


    }
}
