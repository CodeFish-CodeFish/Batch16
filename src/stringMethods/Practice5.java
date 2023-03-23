package stringMethods;

public class Practice5 {
    public static void main(String[] args) {

        String str = "java";
        //replace()

        str = str.replace('a', '$');
        System.out.println(str);

        str = "do whatever it takes";

        str = str.replace("ever", "EVER");
        System.out.println(str);

        // change all 't's to '*'
        System.out.println(str.replace('t', '*'));
        System.out.println(str);

        str = str.replace(" ", "-*-"); // do-*-whatEVER-*-it-*-takes

        System.out.println(str);

        // replace only first 't' in the str with '#'

        str = str.replace(str.charAt(8), '#'); // HW
        System.out.println(str);

        str = str.replaceFirst("E", "!");
        System.out.println(str);

        //trim() --> remove leading and ending spaces from string
        // e.g: "    Thursday is    tomorrow    ";

        String string = "    Thursday is    tomorrow    ";
        string = string.trim();
        System.out.println(string);


    }
}
