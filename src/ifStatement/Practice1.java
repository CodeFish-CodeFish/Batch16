package ifStatement;

public class Practice1 {

    public static void main(String[] args) {

        int apples = 45;
        int oranges = 95;


        System.out.println("This is BEFORE if");
        // "HI" if the number of apples are less than numbers of oranges

       if( apples < oranges ){

           System.out.println("HI");

       }

        System.out.println("this is AFTER if");

       // print "there are same numbers of fruits" when apples and oranges are same amount

        if ( apples == oranges ){

            System.out.println("there are same numbers of fruits");
        }

        String str = "yes";
        // "Welcome"

        if (str.equals("yes")){

            System.out.println("Welcome");
        }

    }
}
