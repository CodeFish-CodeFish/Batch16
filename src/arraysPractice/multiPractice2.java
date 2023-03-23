package arraysPractice;

import java.util.Arrays;

public class multiPractice2 {
    public static void main(String[] args) {



        String[][] usCities = {  {"Boston","New York", "Fairfax"}, { "Chicago","Indianapolis","Madison"}, {"LA", "Seattle","San Francisco"}   };

        System.out.println(Arrays.deepToString(usCities));

        // Indianapolis --> Dayton

        usCities[1][1] = "Dayton";
        System.out.println(Arrays.deepToString(usCities));

        // reach out every city name one at a time

        // when you find out the city name is 'Madison', "Madison is capitol of Wisconsin" << print his message
        // when you find out the city name is 'Madison', "Madison's index is ..index... " << print his message including index for madison
        for ( int i= 0; i< usCities.length; i++    ){
            //usCities[i] --> means/refers to each region on the usCities array
            for ( int j =0 ; j <usCities[i] . length ; j++ ){

             System.out.println( usCities[i][j]); //printing individual cities

                if (usCities[i][j].equalsIgnoreCase("madison")){ // if condition to check if the city is 'Madison'
                    System.out.println("Madison is capitol of Wisconsin");
                    System.out.println( "Madison's index is >> "+  i +" - "+ j);
                }else if (usCities[i][j].equalsIgnoreCase("LA")){
                    System.out.println( "LA's index is >> "+  i +" - "+ j);
                }

            }

        }
        System.out.println("==========use for each loop to print out each city one at a time==============");

        //{  {"Boston","New York", "Fairfax"}, { "Chicago","Indianapolis","Madison"}, {"LA", "Seattle","San Francisco"}   };

        for (String[] state   : usCities){

            System.out.println("East coast cities");
            for ( String city: state ) {

                System.out.println("**** "+city + "****");
            }

        }






    }
}
