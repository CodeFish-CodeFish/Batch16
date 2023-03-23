package loops;

public class TaskForPractice1 {
    public static void main(String[] args) {

        /*
        "Today is the first of daylight saving in the USA"
        from given sentence print out only letters 'a' and/or 'A'


         */
        String str = "Today is the first of daylight saving in the USA";

        for (int i = 0; i < str.length(); i++) {


            if (str.charAt(i) == 'a' ||  str.charAt(i) =='A') {

                System.out.println("I found an a/A here it is >> "+  str.charAt(i));
            }
        }

        System.out.println("-----------");
        // find out the numbers of 'a' and 'A' in the string and print that count

        String test = "Today is the first of daylight saving in the USA";

        int  count =0;
        for (int i = 0; i < test.length(); i++  ) {

            if (test.charAt(i) == 'a' ||  test.charAt(i) =='A') {

                System.out.println("I found an a/A here it is >> "+  test.charAt(i));
                count++;
            }
        }
        System.out.println("There are total of "+count +" a/A in the string");
    }
}
