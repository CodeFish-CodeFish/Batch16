package loops;

public class WhilePractice6 {

    public static void main(String[] args) {

        String str = "Saturday";

        // >> print every single char from above string
        // S, a, t, u, r, d, a, y

//        // how do you reach out any letter on this string?
//        System.out.println(   str.charAt( 2) );// t
//        System.out.println(   str.charAt( 3) );// u
//        System.out.println(   str.charAt( 4) );//  r
        int index = 0;

        while ( index < str.length()){

            if (index == str.length()-1){
                System.out.print(str.charAt(index));
            }else {
                System.out.print( str.charAt(index)+ "-");
            }

            index++;
        }


    }
}
