package objectPractice;

public class TestComputer {
    public static void main(String[] args) {

        Computer computer1 = new Computer();

        computer1.playGame(3);

        System.out.println("c1 brand >>"+   computer1.brand ); // null

        Computer computer2 = new Computer("LG");

        System.out.println("C2 brand >>  "+ computer2.brand);

    }
}
