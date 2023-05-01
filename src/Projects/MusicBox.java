package Projects;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String musicType="";
        String[] availableSongs=new String[5];
        int songPrice=0;
        boolean goNext=true;
        boolean tryAgain=true;
        while (tryAgain) {
            System.out.println("Available music types are: Classical, Pop and Country");
            System.out.println("Please enter the music type:");
            String musicTypeT=sc.nextLine().toLowerCase();
            musicType=musicTypeT;
            switch (musicType) {
                case "classical":
                    availableSongs = new String[]{"Four Seasons", "Fur Elise", "Finlandia", "Vocalize", "The Planets"};
                    songPrice = 2;
                    tryAgain=false;
                    break;

                case "pop":
                    availableSongs = new String[]{"Bad Guy", "Talk", "Please Me", "7 Ring", "Without Me"};
                    songPrice = 4;
                    tryAgain=false;
                    break;

                case "country":
                    availableSongs = new String[]{"Meant To Be", "Heaven", "Simple", "One Number Away", "Get Along"};
                    songPrice = 3;
                    tryAgain=false;
                    break;

                default:
                    System.out.println(musicType + " music type is NOT available");

                    System.out.println("Do you want to try again? Y/N");
                    String again=sc.nextLine();
                    if(again.equalsIgnoreCase("n")){
                        tryAgain=false;
                        goNext = false;
                    }
                    break;

            }
        }

        if(goNext) {
            System.out.println("Available songs under " + musicType + " music:");
            for (String i : availableSongs) {
                System.out.println(i);
            }

            System.out.println("Which song do you want to lisyen to? :");
            String songName = sc.nextLine();
            boolean isSongPresent = false;

            for (String i : availableSongs) {
                if (i.equalsIgnoreCase(songName)) {
                    isSongPresent = true;
                }
            }

            if (isSongPresent) {
                System.out.println("The price for the \"" + songName + "\" is $" + songPrice);
                System.out.println("Please enter your money:");
                int payment = 0;
                boolean paymentIsNotEnough = true;
                while (paymentIsNotEnough) {
                    payment += sc.nextInt();
                    if (payment == songPrice) {
                        System.out.println(songName + " is playing. Enjpy your song.");
                        paymentIsNotEnough = false;
                    } else if (payment > songPrice) {
                        System.out.println("YOU HAVE ENTERED $" + (payment - songPrice) + " MORE. PLEASE WAIT FOR CHANGE");
                        System.out.println(songName + " is playing. Enjoy your song.");
                        paymentIsNotEnough = false;
                    } else {
                        System.out.println("You entered $" + (songPrice - payment) + " less. Please add some more.");
                    }
                }
            } else {
                System.out.println(songName + " is NOT available in MusicBox.");
            }
        }
        else {
            System.out.println("BYE");
        }
    }
}
