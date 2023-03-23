package MentoringWithKutman;

import java.util.Scanner;

public class Mentoring1 {
    public static void main(String[] args) {
        //Ways of Concatination

        String str="Code";
        String str2="fish";


        //using method (str.concat(str2))

        String concatMethod=str.concat(str2);
        System.out.println(concatMethod);

        //+""
        String concatWithQuotation=str+str2;
        System.out.println(concatWithQuotation);

        System.out.println("Code"+"fish");

        System.out.println("+++++++++++++++++++++++++");

        /*
Write a code that will ask user the annual salary and will provide to user
his anual tax which is 30%
Example:
    Input:100000
    Output: your annual tax for this year is 30000$
 */
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your annual salary?");
        long salary=scanner.nextLong();
        int taxRate=30;//%
        long tax=salary*taxRate/100;
        System.out.println("Your annual tax for this year is $"+tax);

        System.out.println("++++++++++++++++++++++++++++++");


        /*
Ask user for two integers and print out A+B, A-B, A*B, A/B, A%B (Using scanner)
        A=5
        B=2

        5+2=7
        5-2=3
        5*2=10
        5/2=2
        5%2=1


 */
        System.out.println("Please enter number A:");
        int A=scanner.nextInt();//7
        System.out.println("Please enter number B:");
        int B=scanner.nextInt();//3

        System.out.println(A+" + "+B+" = "+(A+B));//10
        System.out.println(A+" - "+B+" = "+(A-B));//4
        System.out.println(A+" * "+B+" = "+(A*B));//21
        System.out.println(A+" / "+B+" = "+(A/B));//2
        System.out.println(A+" % "+B+" = "+(A%B));//1

        System.out.println("++++++++++++++++++++++++++++++");

        /*
Ask user for two integers and compare//  2-->A  3-->B
A>B-->false
A<B-->true
A<=B-->true
A>=B-->false
A==B-->false
A++-->2
A---->3
A+=B-->5
A-=B-->2
 */

        System.out.println("Please enter number A:");
        int C=scanner.nextInt();//7
        System.out.println("Please enter number B:");
        int D=scanner.nextInt();//3

        System.out.println(C+" > "+D+" = "+(C>D));//10
        System.out.println(C+" < "+D+" = "+(C<D));//4
        System.out.println(C+" >= "+D+" = "+(C>=D));//21
        System.out.println(C+" <= "+D+" = "+(C<=D));//2
        System.out.println(C+" == "+D+" = "+(C==D));//1
        System.out.println(C+"++ = "+(C++));//1
        System.out.println("++"+C+" = "+(++C));//1
        System.out.println(C+" += "+D+" = "+(C+=D));
        System.out.println(C+" -= "+D+" = "+(C-=D));

        System.out.println("++++++++++++++++++++");

        int balance=2000;
        int salaryPerMonth=7000;
        int expenses=4500;
        int month=7;

        int balanceAfter=2000+(7*7000)-(4500*7);

        System.out.println("Your balance after "+month+" months is "+balanceAfter);




    }
}
