package loops;
public class Task3 {
    public static void main(String[] args) {


        /*
        count how many letters are in the string >>> "There are ..4.. letters in the string"
        count how many digits are in the string >>> "There are ..4.. digits in the string"
        count how many other symbols are in the string >>> "There are ..2.. symbols in the string"
         */
        String str = "345sfhA#*1";
        int  digitCount = 0, letterCounter = 0, symbolCounter = 0;
        for ( int i = 0;  i < str.length()  ; i++  ){

            char  ch = str.charAt(i);

            if ( ch >= '0' && ch <='9' ){
               digitCount++;

            }else if( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ){

                letterCounter++;
            }else {
                symbolCounter++;
            }


        }
        System.out.println("There are "+ digitCount+" digits in the string");

        System.out.println("There are "+ letterCounter+" letters in the string");
        System.out.println("There are "+ symbolCounter+" symbols in the string");


    }
}
