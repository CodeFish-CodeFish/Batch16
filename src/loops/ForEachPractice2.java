package loops;

public class ForEachPractice2 {
    public static void main(String[] args) {

        String[] cities = {"Chicago", "Denver","Istanbul","Des Plaines","Mt Prospect"};

        // use for each loop to print out each city
        for ( String city : cities ){
            System.out.println(city);
        }
    }
}
