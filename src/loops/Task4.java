package loops;

public class Task4 {
    public static void main(String[] args) {


        String str = "345!!!!sfhA#*1";
        int   symbolCounter = 0;
        for ( int i = 0;  i < str.length()  ; i++  ){

            char  ch = str.charAt(i);

            if ( !(ch >= '0' && ch <='9') && !( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' )){

                symbolCounter++;

            }

        }
        System.out.println("There are "+ symbolCounter+" symbols in the string");



    }
}
