package loops;

public class NestedLoop2 {
    public static void main(String[] args) {

        /*
        print out minutes and hours
        hour from 1 to 6
        minutes from 1 to 59
        1 hour : 1 min
        seconds from 1 to 59
        1 hour : 1 min : 1 sec

         */

        for (int hour = 1; hour <= 6; hour++){

            for (int min = 1; min < 60; min++){

                for (int sec = 1; sec < 60; sec++) {

                    System.out.println(hour + " hour : " + min + " minutes " + sec +" seconds");
                }
            }

        }

    }
}
