package primitives;

public class LogicalOperatorPractice2 {


    public static void main(String[] args) {


        /*
        you can attend to a master program if:
        your average of 3 test scores are 90 or above
        and your GPA is greater than 2.5

        "you are accepted to the program" + ....t/f
         */

        double studentTestAverage = 90, requiredAverage = 90, requiredGPA = 2.5, studentGPA = 2.5;

        boolean attend = (studentTestAverage >= requiredAverage) && (studentGPA > requiredGPA);

        System.out.println("you are accepted to the program >>> " + attend);

        boolean r1 = studentTestAverage >= requiredAverage;

        boolean r2 = studentGPA > requiredGPA;

        boolean attend2 = r1 && r2;
        System.out.println("you are accepted to the program >>> " + attend2);



        //========================================

        // attendance should be 85 percent or more
        // first and second quiz results should be  more than 8 points

        int yourAttendance = 90, requiredAttendance = 85, firstQuiz = 8, secondQuiz = 8, yourQuiz1 =9, yourQuiz2 = 1;

        boolean result = yourAttendance >= requiredAttendance && (firstQuiz < yourQuiz1 && yourQuiz2 > secondQuiz);


        System.out.println( "***** "+ result + " ******");


        //========================================
        char grade1 = 'A', grade2 = 'B', grade3 = 'A', requiredGrade = 'A';

        boolean pass1 = grade2 >= requiredGrade;
        System.out.println( pass1);

        //========================================

        /*
        to travel europe
        you need to have passport, valid visa, ticket
        if you do not have visa, you should be citizen of USA
        "I can go to Europe" + t/f
         */

        boolean myPass = true, myVisa = false, myTicket = true, myCitizenship = false;

        boolean visaReq = myVisa || myCitizenship;

        boolean travelToEurope = myPass && visaReq && myTicket;

        System.out.println("I can go to Europe  " + travelToEurope );

        boolean travelToEurope2 = myPass && (myVisa || myCitizenship) && myTicket;

        System.out.println("I can go to Europe  " + travelToEurope2 );

    }


}
