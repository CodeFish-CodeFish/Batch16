package stringBuilderPractice;

public class Practice3 {


    /*
    create a method that will take a String as a parameter and this method will delete '-' from given word
    "v-a-c-a-ti-on" --> vacation
     */

    public static void deleteDash(String str){
        StringBuilder builder = new StringBuilder(str);
        for (int i=0; i< builder.length(); i++){

            if (  builder.charAt(i) == '-'){
                builder.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(builder);
    }

    public static void main(String[] args) {

        String word = "v----a-c-a-ti-o---n---";

        deleteDash(word);
    }
}
