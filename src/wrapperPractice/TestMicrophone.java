package wrapperPractice;

public class TestMicrophone {
    public static void main(String[] args) {

        Microphone m1 = new Microphone("Insignia","Black","100");
        Microphone m2 = new Microphone("google","silver","30");

        Microphone m3 = new Microphone("Amazon","brown","25.99");

        Microphone m4 = new Microphone("samsung","Red","75.45");

        Microphone[] products = { m1,m2,m3,m4 };

        //calling method
        Microphone.priceChecker(  products );



    }
}
