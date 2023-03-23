package loops;

public class NestedLoop4 {

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
                if (month > 5)
                    break;

                switch (month){
                    case 1:
                        System.out.print(month + " -JAN,");
                        break;
                    case 2:
                        System.out.print(month + " -FEB,");break;
                    case 3:
                        System.out.print(month + " -MARCH,");break;
                    case 4:
                        System.out.print(month + " -4,");break;
                    case 5:
                        System.out.print(month + " -5,");break;
                    case 6:
                        System.out.print(month + " -6,");break;
                    case 7:
                        System.out.print(month + " -7,");break;
                    case 8:
                        System.out.print(month + " -8,");break;
                    case 12:
                        System.out.println(month + " -DEC");break;
                }
            }
        }
    }
}
