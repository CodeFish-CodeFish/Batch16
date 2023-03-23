package ifStatement;

public class NestedIfPractice1 {
    public static void main(String[] args) {

        /*
        check city if it is Chicago or not
            check if the school is codeFish or not
  */

        String city = "Dallas", schoolName = "CodeFish";

        if (city.equalsIgnoreCase("Chicago")) {

            System.out.println("You are living in one of the best city on the earth");

            if (schoolName.equalsIgnoreCase("CodeFish")) {

                System.out.println("You are in the spot already, B16");
            } else {
                System.out.println("Please come and visit us since you are in Chicago");
            }

        } else {
            System.out.println("Please come to Chicago!!");
        }
        ///////////////////////

        if (7 > 5 && 3 == 7  && 'a' > 'b' && true) {


        } else {

        }
        ///////////////////////


    }
}
