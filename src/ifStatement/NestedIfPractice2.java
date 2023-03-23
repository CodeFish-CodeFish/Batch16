package ifStatement;

import java.util.Scanner;

public class NestedIfPractice2 {
    public static void main(String[] args) {
        /*
        passport
            visa
                ticket
                    -->>you are good to FLY<<--
                -get ticket to fly
            -get a visa
        -get a passport first
        yes/no
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to the OHARE security check point");

        System.out.println("Do you have passport? yes/no");
        String passport = scanner.nextLine().toLowerCase();

        if (passport.equals("yes")) {

            System.out.println("Do you have visa or money? visa/money");
            String visa = scanner.nextLine();

            if (visa.equalsIgnoreCase("visa") ) {

                System.out.println("Do you have ticket? yes/no");
                String ticket = scanner.nextLine().toUpperCase();

                if (ticket.equals("YES")) {
                    System.out.println("-->>you are good to FLY<<--");
                } else {
                    System.out.println("Get a ticket");
                }
            }else if(visa.equalsIgnoreCase("money")){
                System.out.println("GOOD to go since you have enough money");
            }
            else {
                System.out.println("get a visa");
            }
        } else {
            System.out.println("get a passport first");
        }

    }
}
