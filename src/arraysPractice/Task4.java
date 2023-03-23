package arraysPractice;

public class Task4 {
    public static void main(String[] args) {

        // find out the oldest age from array
        int[] ages = {23, 15, 23, 7, 56, 40, 3, 56, 56, 56, 100};

        int largest = ages[0];
        int smallest = ages[0];
        for (int i = 1; i < ages.length; i++) {

            if (ages[i] > largest) {

                largest = ages[i];
            }
            if (ages[i] < smallest) {

                smallest = ages[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
}
