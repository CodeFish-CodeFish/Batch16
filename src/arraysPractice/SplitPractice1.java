package arraysPractice;

import java.util.Arrays;

public class SplitPractice1 {
    public static void main(String[] args) {
        String str = "Java is getting easier. So that, I start to like it!";

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        String[] parts = str.split("a");
        System.out.println(Arrays.toString(parts));


        String date2 = "03.19.2023";
        String date = "03-19-2023";
        // 03/19/2023
        String[] splitDate = date.split("-");
        System.out.println(Arrays.toString(splitDate));

        System.out.println(splitDate[1].equals("19"));

        String[] splitDate2 = date2.split("\\.");
        System.out.println(Arrays.toString(splitDate2));
    }
}
