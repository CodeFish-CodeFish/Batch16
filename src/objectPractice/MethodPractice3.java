package objectPractice;

import java.util.Arrays;

public class MethodPractice3 {

    // create a method that will take name of students
    // it creates "Happy Birthday ..Alex.."for each student
    // it will return all messages in another array
    public String[] messageCreator(String[] studentNames) {

        String[] messages = new String[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) {
            messages[i] = "Happy birthday " + studentNames[i] + "!";
        }
        return messages;
    }

    public static void main(String[] args) {

        MethodPractice3 practice3 = new MethodPractice3();
        String[] b16 = {"Alex", "Vlad", "Sam", "David", "Enver", "Jenny"};
        String[] resultWithMessages = practice3.messageCreator(b16);

        System.out.println(Arrays.toString(resultWithMessages));

    }

}
