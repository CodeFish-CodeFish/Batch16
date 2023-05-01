package objectPractice;

public class BankAccount {
    /*
            variables:
            -accountHolderName, bankName, balance, userName, password, isLoggedIn
            Methods:
            - void displayInfo() ->will print out all account information
            - double deposit() -> one pramameter to update balance
            - double withdraw() -> one parameter to update balance
            -void logIn() -> userName, password parameters to update isLoggedIn boolean.
             */
    String accountHolderName, bankName, userName, password;
    boolean isLoggedIn;
    double balance;

    public void displayInfo() {
        if (isLoggedIn) {
            System.out.println("Account holder's name " + accountHolderName + "\nBank Name " + bankName
                    + "\nbalance " + balance + "\nUser Name " + userName + "\nPassword" + password + "\nLogged In " + isLoggedIn);
            System.out.println("-------------------------------");
        }else {
            System.out.println(">>LOG IN FIRST<<");
        }
    }

    public double deposit(double depositAmount) {

        balance += depositAmount;
        System.out.println("Your new balance after depositing " + depositAmount + " is :" + balance);
        return balance;
    }

    public double withdraw(double withDrawAmount) {

        balance -= withDrawAmount;
        System.out.println("Your  new balance after depositing " + withDrawAmount + " is :" + balance);
        return balance;
    }
    // void logIn() -> userName, password parameters to update isLoggedIn boolean.

    public void logIn(String user, String pass) {

        if (user.equals(userName) && pass.equals(password)) {

            System.out.println("You successfully logged in");
            isLoggedIn = true;
        } else {
            System.out.println("Check your creds!");
        }

    }
}
