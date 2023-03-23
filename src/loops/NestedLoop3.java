package loops;

public class NestedLoop3 {
    public static void main(String[] args) {

        /*
        print out months for years between 2023 and 2025(inclusive)

        2023 --> 1-JAN, 2-FEB, 3-MARCH,  , 12-DEC,
        2024 --> 1-JAN, 2-FEB, 3-MARCH , , 12-DEC,
        2025 --> 1-JAN, 2-FEB, 3-MARCH ,  ,12-DEC,
         */

        for (int year = 2023; year <=2025; year++){


            System.out.print(year + " --> ");

            for ( int month = 1; month<=12; month++){

                if (month ==12){
                    System.out.println(month);
                }else {
                    System.out.print( month + ", ");
                }

            }

        }



    }
}
