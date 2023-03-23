package arraysPractice;

public class Task5 {

    public static void main(String[] args) {

        // print out every name of the fruit in reverse version
        String[] fruits = {"apple", "mango", "kiwi", "grape", "watermelon", "strawberry"};

        for ( int i =0; i< fruits.length; i++){

            String reversed = "";

                    for( int k = fruits[i] .length() -1 ; k >=0 ; k--){

                       char ch = fruits[i].charAt( k );
                        reversed += ch;
                    }
            System.out.println( reversed +" is reversed version of "+ fruits[i]);


        }

    }

}
