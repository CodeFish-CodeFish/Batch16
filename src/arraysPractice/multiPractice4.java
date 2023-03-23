package arraysPractice;

public class multiPractice4 {
    public static void main(String[] args) {
//              TV				            	Compt                           Speakers
//        "Samsung", "LG", "Sony"		"Apple", "HP", "Dell"			"Google",  "JBL",  "Amazon"

//        985.99,  500,   755		        2100	100 700			           99.99	250.45	 120.50
//
//        "Samsung is $985.99"

        // tell me only samsung price
        // tell me only samsung price if it is less than $200
        String[][]  items = {{"Samsung", "LG", "Sony"},	{"Apple", "HP", "Dell"},{"Google",  "JBL",  "Samsung"}};

        double[][] prices= { {985.99,  500,   755},{  2100,	100 ,700	}, { 99.99,	250.45, 120.50}};



        for ( int a = 0; a< items.length; a++){

            for ( int b = 0; b < items[a].length ; b++){

               // System.out.println(   items[a][b] +  " is $" + prices[a][b]);

                if( items[a][b].equalsIgnoreCase("SAMSUNG") && prices[a][b] < 200){
                    System.out.println(   items[a][b] +  " is $" + prices[a][b]);
                }
            }
        }

    }
}
