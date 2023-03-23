package switchStatement;

public class Practice1 {

    public static void main(String[] args) {

        int number = 9, numb2 = 5, num3 =1;
        switch (number) {
            default:
                System.out.println("Not a valid number");
                break;
            case 3:
                System.out.println("case 3");
                break;
            case 1:
                System.out.println("Case 1");
                break;
            case 5:
                System.out.println("Case 5");
                break;
        }

        System.out.println("===============");

        String str = "oFFICe".toLowerCase();

        switch (str){

            case "hybrid": System.out.println("Empty home");break;
            case "home":
                System.out.println( "you are at home");break;
            case "office":
                System.out.println("Working at office");
                break;
            default:
                System.out.println("Freelancer");   break;
        }


    }
}
