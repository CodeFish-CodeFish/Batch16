package objectPractice;

import java.util.Scanner;

public class BankTest {

    public static void main(String[] args) {


        BankAccount account = new BankAccount();

        account.deposit(100);

        account.displayInfo();

        account.logIn("java", "1234");

        account.userName = "JAVA";
        account.password = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your user name, pass");

        account.logIn("JAVA", "1234");

        account.logIn(scanner.nextLine(), scanner.nextLine());

        account.displayInfo();


    }


}
