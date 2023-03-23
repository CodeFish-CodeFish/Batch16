package primitives;
public class ComparisonPractice2 {
    public static void main(String[] args) {

        /*
        there is an event who can attend to this event if the age of the person is 18 or older
        -represent this scenario with variable/s
        -show/print a message like: "you can attend this event" --> t/f
         */

        int ageOfPerson = 12, requiredAge= 18;

        boolean result1 = ageOfPerson >= requiredAge;

        System.out.println( "you can attend to this event >> "+ result1);


        /*
        if the child is 12 years old or younger they are invited to birthday party
        "you are invited" .. t/f
         */

        int childAge = 8, requiredAgeOfChild = 12;


        System.out.println( "you are invited >> "+ (requiredAgeOfChild >= childAge ) );
        System.out.println( "you are invited >> "+ (childAge <= requiredAgeOfChild ) );

        boolean  result2 = childAge <= requiredAgeOfChild;
        System.out.println( "you are invited >>> "+result2);

        /*
        event for kids
        if the age of child is between  8 and 15, they are okay to attend
        "you are okay to come" + t/f
         */

        int minAge = 8, maxAge = 15, kidAge =4;

        boolean result4 = kidAge >= minAge, result5  = kidAge <=maxAge;

        boolean lastResult = result4 == result5;

        System.out.println( "you are okay to come "+ lastResult );


    }
}
