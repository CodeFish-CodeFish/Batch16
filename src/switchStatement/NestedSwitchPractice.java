package switchStatement;

import java.util.Scanner;

public class NestedSwitchPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome, please select from following options" +
                "\nHR - 1 \nIT - 2 \nAdmin - 3 \nCSR - 4");
        int department = scanner.nextInt();
        switch (department) {
            case 1: // HR
                System.out.println("This is HR, Chose from following names.. Alex/David");
                String name = scanner.next().toLowerCase();

                switch (name){
                    case "alex":
                        System.out.println("Speaking with ALEX");break;
                    case "david":
                        System.out.println("Speaking with DAVID"); break;
                    default:
                        System.out.println("Wrong name chosen, try again");
                }
                break;
            case 2: // IT
                System.out.println("This is IT, Chose from following names.. Sam/Jenny");
                String name1 = scanner.next().toLowerCase();
                switch (name1){
                    case "sam":
                        System.out.println("Speaking with SAM");break;
                    case "jenny":
                        System.out.println("Speaking with JENNY"); break;
                    default:
                        System.out.println("Wrong name chosen, try again");
                }
                break;
            case 3: // Admin
                System.out.println("This is ADMIN department"); break;

            case 4: // CSR
                System.out.println("This is CSR"); break;
            default:
                System.out.println("Wrong department number, please try again");
                break;

        }

    }
}
