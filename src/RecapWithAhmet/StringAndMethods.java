package RecapWithAhmet;

import java.util.Arrays;

public class StringAndMethods {

    /*
    POSSIBLE INTERVIEW QUESTIONS:

   1-Most of the technical questions are related with String code?
   2-What is the difference between (.)equals and (==) ?

   First of all, that's a great question Sir/MADAM.In my implementation I do not
   use == a lot but I know the difference

   .equals-->you are comparing the value based on the ONLY "VALUE"

   == -->You are comparing not only the "VALUE" but also "LOCATION IN THE MEMORY"

   3-What is String and how do you declare?

   GENERAL DESCRIPTION:
     String is an object that I use in java to store some data.

     There are few ways that we can declare String:

       1-String str;
       2-String str2=new String();

   Declare-->It is a way to create a variable without assigning value(String str;)

   Initialization:It is way to create a variable with Assigning value

       String str2="AHMET";

    *STRING METHODS:Is all about the usage of Object methods for automation perspective mostly

     1-equalIgnoreCase()-->It is used for comparison without any sensitivity(upper/lower)-->RETURN BOOLEAN
   * 2-substring()-->It is way to get the specific spot/s from word.RETURN STRING
     3-chartAt()-->it is a way to get the specific char from word.RETURN CHARA
     4-indexOf()-->It is a way to get the index of character from word. -->RETURN INT
     5-concat()-->It is a way to add the words/numbers/symbols next to each other.-->RETURN STRING
     6-length()-->It gives you the length of the word.RETURN INT
     7-EndsWith()-->It checks the word that ending with a specific character/characters.RETURN BOOLEAN
     8-StartsWith()-->It checks the word that starting with a specific character/characters.RETURN BOOLEAN
 *** 9-contains() -->It checks the word/words that contains the specific character/characters.RETURN BOOLEAN
     10-replace() -->it replaces the specific character/characters with given value.RETURN STRING
     11-ToUpper()-->It makes the word/words uppercase. RETURN STRING
     12-ToLower()-->it makes the word/words lowercase/ RETURN STRING
**** 13-trim()-->It removes the spaces from beginning and end of the word.RETURN STRING
     14-split()-->it is a way to seperate the word/words from specific index.RETURN STRING[]
***  15-equals()-->It checks the word/words(VALUE) are matching %100.RETURNS BOOLEAN
  *  16-ValueOf()-->It converts the other data types to String.

     NOTE:1-Once you give any explanation in IT
            -->Go from GENERAL TO DEEP(If they ask you to give more)
            -->USE IT TERMINOLOGY-->declare,initialize
     */
    public static void main(String[] args) {
        String name = "AHMET";
        String anotherName = new String("AHMET");
        String anotheranotherName = "AHMET";
        String name1 = new String("AHMET");
        System.out.println(name.equals(anotherName)); //true
        System.out.println(name == anotherName);//false
        System.out.println(anotherName == name1);//false
        System.out.println(System.identityHashCode(name));// 12312312
        System.out.println(System.identityHashCode(anotherName));//45645645
        System.out.println(System.identityHashCode(anotheranotherName));
        System.out.println(System.identityHashCode(name1));

        String str = "Ahmet Loves Java";
        String str2 = "Ahmet Loves Java";
        String str3 = "ahmet loves Java";

        System.out.println(str.indexOf('v'));//8 -->starts from 0
        System.out.println(str2.length()); //16//starts from 1
        System.out.println(str.equals(str3));//false
        System.out.println(str.equalsIgnoreCase(str3));//true
        System.out.println(str.concat(" and Selenium"));
        System.out.println(str.concat(" " + str3));
        System.out.println(str + " " + str3);
        String[] words = str3.split(" ");
        System.out.println(words);//hashcode
        System.out.println(Arrays.toString(words));
        System.out.println(str.replace(" and Selenium", "*"));
        System.out.println(str.replace("Ahmet", "Batch16"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String newName = "Hello From out side";//Adele
        System.out.println(newName.contains("Ahmet"));
        System.out.println(newName.startsWith("h"));
        System.out.println(newName.endsWith("side"));
        System.out.println(newName.charAt(4));//o
        System.out.println(newName.substring(0,1));//H
        System.out.println(newName.substring(0));//whole thing

        //$34.99


    }
}
