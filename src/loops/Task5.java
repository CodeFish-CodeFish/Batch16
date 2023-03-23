package loops;

public class Task5 {
    public static void main(String[] args) {

        // write java code to reverse given string value
        String str = "level";  // --> "etalocohc"
        String reversed = "";

        for ( int i = str.length()-1; i >=0  ; i--){

            reversed += str.charAt(i);

            //System.out.println(str.charAt(i));
        }
        System.out.println(reversed);

        // check if the given string is palindrome
        // EFE  -- anna -- hannah -- level

        if (reversed.equals(str)) System.out.println(str + " is a palindrome string");



    }
}
