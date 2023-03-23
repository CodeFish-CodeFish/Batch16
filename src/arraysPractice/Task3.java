package arraysPractice;

public class Task3 {
    public static void main(String[] args) {

        char[] letters = {'*','!', '^', '1', '&', 'A', '8', '*'};

       // print out only digits from above array
        // print out only symbols (ex: * , &, ! ...) like >> "this is symbol ..*..."

        for ( int index = 0; index < letters.length; index++){

            if ( letters[index] >= '0' && letters[index] <= '9' ){
                System.out.println(  letters[index] );
            }else if( !( letters[index] >= '0' && letters[index] <= '9' ) &&
                    !(letters[index] >= 'A' && letters[index] <='Z' || letters[index] >= 'a' && letters[index] <='z')){

                System.out.println("this is symbol " + letters[index]);
            }

        }


    }
}
